import java.util.*;

public abstract class CommandFactory {
    Vector _buildings;
    CareTaker caretaker;
    Building build;

    abstract public Command create() throws Exception;
    public void setBuildings(Vector _buildings) {
        this._buildings = _buildings;
    }

    public void setCaretaker(CareTaker caretaker) {
        this.caretaker = caretaker;
    }
    public void setBuilding(Building build){
        this.build = build;
    }
}
