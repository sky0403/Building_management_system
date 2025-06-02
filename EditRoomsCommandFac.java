import java.util.*;

public class EditRoomsCommandFac extends CommandFactory{
    Vector _buildings;
    CareTaker caretaker;

    public EditRoomsCommandFac(){
        _buildings = null;
    }

   public void setBuildings(Vector buildings){
        this._buildings = buildings;
    }

    public void setCaretaker(CareTaker caretaker){
        this.caretaker = caretaker;
    }
    public Command create() throws Exception{
        return new EditRoomsCommand(_buildings,caretaker);
    }
}
