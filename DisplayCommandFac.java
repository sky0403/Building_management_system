import java.util.*;

public class DisplayCommandFac extends CommandFactory {
    Vector _buildings;

    public DisplayCommandFac(){
        _buildings = null;
    }

    public void setBuildings(Vector buildings){
        this._buildings = buildings;
    }

    public Command create() throws Exception{
        return new DisplayCommand(_buildings);
    }
}
