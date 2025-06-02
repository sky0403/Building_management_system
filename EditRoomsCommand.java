import java.util.*;
import java.io.*;

public class EditRoomsCommand implements Command{
    Vector _buildings;
    CareTaker ct;

    public EditRoomsCommand(Vector buildings,CareTaker ct){
        this._buildings = buildings;
        this.ct = ct;
    }
    
    public void execute(){
        HashMap<String, String> Map = new HashMap<String, String>() {{
            put("a", "AddRoomcommandFac");
            put("d", "DeleteRoomCommandFac");
            put("m", "ModifyRoomCommandFac");
        }};
        try{
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            System.out.println("Building No.:" );
            String command = br.readLine();
            int buildingID = Integer.parseInt(command);
            System.out.println(buildingID);
            for(int i = 0; i< _buildings.size(); i++){
                if(((Building)_buildings.elementAt(i)).getId() == buildingID){
                    Building b = (Building)_buildings.elementAt(i);
                    b.printBuilding();
                    System.out.println("Please enter command: [a|d|m]");
                    System.out.println("a = add room, d = delete room, m = modify room");
                    Command com;
                    command = br.readLine();
                    String factory = Map.get(command);
                    System.out.println(factory);
                    CommandFactory comfac = (CommandFactory) Class.forName(factory).newInstance();
                    comfac.setBuildings(_buildings);
                    comfac.setCaretaker(ct);
                    comfac.setBuilding(b);
                    com = comfac.create();
                    if(com != null){
                        com.execute();
                        
				    }
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
