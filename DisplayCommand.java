import java.util.*;
import java.io.*;

public class DisplayCommand implements Command {
    Vector _buildings;

    public DisplayCommand(Vector buildings){
        this._buildings = buildings;
    }
    
    public void execute(){
        try{
            if(this._buildings.isEmpty()){
                System.out.println("No Building here");
                return;
            }else{
                InputStreamReader is = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(is);
                System.out.println("Enter Building No.(* to display all):");
                String command = br.readLine();
                if(command.equals("*")){
                    for(int i = 0; i< _buildings.size(); i++){
                        System.out.println(((Building)_buildings.elementAt(i)).toString());
                    }
                }else{
                    int buildingID = Integer.parseInt(command);
                    for(int i = 0; i< _buildings.size(); i++){
                        if(((Building)_buildings.elementAt(i)).getId() == buildingID){
                            ((Building)_buildings.elementAt(i)).printBuilding();
                        }
                    }
                }
            }
        }catch(Exception ex){

        }
    }
}
