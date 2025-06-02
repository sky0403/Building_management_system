public class VectorItem {
    private Memento memento;
    private Command cmd;
    private Building build;
    private Room room;

    public VectorItem(Building build,Memento memento, Command cmd){
        this.build = build;
        this.memento = memento;
        this.cmd = cmd;
    }
    public VectorItem(Room room,Memento memento, Command cmd){
        this.room = room;
        this.memento = memento;
        this.cmd = cmd;
    }

    public Room getRoom(){
        return room;
    }

    public void setRoom(Room room){
        this.room = room;
    }

    public Building getBuilding(){
        return build;
    }

    public void setBuilding(Building build){
        this.build = build;
    }

    public Memento getMemento(){
        return memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }

    public Command getCommand(){
        return cmd;
    }

    public void setCommand(Command command){
        this.cmd = command;
    }
    public String toString(){
        return this.getMemento().toString();
    }

}
