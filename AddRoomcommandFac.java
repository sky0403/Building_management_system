import java.util.*;
public class AddRoomcommandFac extends CommandFactory{
    Vector _buildings;
    CareTaker caretaker;
    Building build;

    public Command create() throws Exception{
        return new AddRoomCommand(build,caretaker);
    }
    public void setBuildings(Vector _buildings) {
        this._buildings = _buildings;
    }

    public void setBuilding(Building build){
        this.build = build;
    }

    public void setCaretaker(CareTaker caretaker) {
        this.caretaker = caretaker;
    }
}
