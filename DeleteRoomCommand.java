import java.util.*;
import java.io.*;

public class DeleteRoomCommand implements Command{
    Vector _buildings;
    CareTaker ct;
    Building build;
    

    public DeleteRoomCommand(Building build, CareTaker ct){
        this.build = build;
        this.ct = ct;
    }
    public void execute(){
        try{
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);

            System.out.println("Room No.:");
            int roomno = Integer.parseInt(br.readLine());
            Room r = build.getRooms().get(roomno-1);
            ct.saveCurrent(build,r,this,roomno);
            build.deleteRoom(roomno);
            System.out.println("Updated Building:");
            build.printBuilding();
            
        }catch(Exception ex){

        }
    }
}
