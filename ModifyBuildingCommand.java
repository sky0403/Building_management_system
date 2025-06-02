import java.util.*;
import java.io.*;

public class ModifyBuildingCommand implements Command {
    Vector _buildings;
    CareTaker ct;

    public ModifyBuildingCommand(Vector buildings,CareTaker ct){
        this._buildings = buildings;
        this.ct = ct;
    }
    
    public void execute(){
        try{
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            System.out.print("Building No.:");
            String command = br.readLine();
            int buildingID = Integer.parseInt(command);
            for(int i = 0; i< _buildings.size(); i++){
                if(((Building)_buildings.elementAt(i)).getId() == buildingID){
                    Building b = (Building)_buildings.elementAt(i);
                    System.out.println(((Building)_buildings.elementAt(i)).toString());
                    b.modifyBuilding();
                    ct.saveCurrent(b, this);
                    System.out.println(((Building)_buildings.elementAt(i)).toString());
                    
                }
            }
        }catch(Exception ex){

        }
    }
}
