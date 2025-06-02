import java.util.*;
public class DeleteRoomCommandFac extends CommandFactory{
    Vector _buildings;
    Building build;

    public Command create() throws Exception{
        return new DeleteRoomCommand(build,caretaker);
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
