import java.util.*;


public class CareTaker {
    private Vector _buildings;
    private Vector _undoList;
    private Vector _redoList;

    public CareTaker(){
        _undoList = new Vector();
        _redoList = new Vector();
    }

    public void setBuilding(Vector Buildings){
        this._buildings = Buildings;
    }
    public Memento getMemento(Building build){
        if (build instanceof Apartment){
            return new ApartmentMemento((Apartment)build);
        }else if(build instanceof House){
            return new HouseMemento((House) build);
        }
        return null;
    }
    public Memento getMemento(Building build,Room room,int roomNo){
        return new DeleteRoomMemento(build,room,roomNo);
    }
    public void saveCurrent(Building build,Command cmd){
        Memento amemento;
        if(cmd instanceof AddCommand){
            amemento = getMemento(build);
        }else if(cmd instanceof ModifyBuildingCommand){
            amemento = getModifyMemento(build);
        }else{
            amemento = null;
        }
        _undoList.add(new VectorItem(build,amemento,cmd));
    }
    public Memento getModifyMemento(Building build){
        if (build instanceof Apartment){
            return new ModifyApartmentMemento((Apartment)build);
        }else if(build instanceof House){
            return new ModifyHouseMemento((House) build);
        }
        return null;
        
    }
    public void saveCurrent(Building build,Room room,Command cmd,int roomNo){
        Memento amemento = getMemento(build,room,roomNo);
        _undoList.add(new VectorItem(room,amemento,cmd));
    }


    public void undo(){
        if(_undoList.size() == 0){
            System.out.println("No last undo command.");
            return;
        }

        VectorItem vi = (VectorItem) _undoList.lastElement();
        if(vi.getCommand() instanceof AddCommand){
            _buildings.remove(vi.getBuilding());
        }else if(vi.getCommand() instanceof AddRoomCommand){
            vi.getBuilding().getRooms().remove(vi.getBuilding().getRooms().size()-1);
        }else if(vi.getCommand() instanceof ModifyBuildingCommand){
            Memento memento = getModifyMemento(vi.getBuilding());
            vi.getMemento().restore();
            vi.setMemento(memento);
        }else{}
        _undoList.remove(vi);
        _redoList.add(vi);
    }
    
    public void redo(){
        if (_redoList.size() == 0) {
            System.out.println("No last redo command.");
            return;
        }

        VectorItem vi = (VectorItem) _redoList.lastElement();

        if (vi.getCommand() instanceof AddCommand) {
            _buildings.add(vi.getBuilding());
        }
        else if(vi.getCommand() instanceof ModifyBuildingCommand){
            Memento memento = getModifyMemento(vi.getBuilding());
            vi.getMemento().restore();
            vi.setMemento(memento);
        } else{}
        _redoList.remove(vi);
        _undoList.add(vi);
    }
    public void displayUnRedoList() {
        System.out.println("Undo List:");
        if (_undoList.size() == 0) {
            System.out.println("Nothing to undo");
        } else {
            _undoList.forEach(VectorItem -> System.out.println(VectorItem.toString()));
        }

        System.out.println();

        System.out.println("Redo List:");
        if (_redoList.size() == 0) {
            System.out.println("Nothing to redo");
        } else {
            _redoList.forEach(VectorItem -> System.out.println(VectorItem.toString()));
        }
    }
}