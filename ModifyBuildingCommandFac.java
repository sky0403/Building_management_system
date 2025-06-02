import java.util.*;

public class ModifyBuildingCommandFac extends CommandFactory{
    Vector _buildings;
    CareTaker caretaker;

    public ModifyBuildingCommandFac(){
        _buildings = null;
    }

    public void setBuildings(Vector buildings){
        this._buildings = buildings;
    }

    public void setCaretaker(CareTaker caretaker){
        this.caretaker = caretaker;
    }
    public Command create() throws Exception{
        return new ModifyBuildingCommand(_buildings,caretaker);
    }
}
