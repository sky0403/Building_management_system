import java.util.*;
import java.io.*;

public class AddRoomCommand implements Command{
    Vector _buildings;
    CareTaker ct;
    Building build;
    

    public AddRoomCommand(Building build, CareTaker ct){
        this.build = build;
        this.ct = ct;
    }
    public void execute(){
        try{

            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);

            System.out.print("Length: ");
            int length = Integer.parseInt(br.readLine());
            System.out.print("Width: ");
            int width = Integer.parseInt(br.readLine());
            build.addRoom(length,width);
            System.out.println("Updated Building:");
            build.printBuilding();
            ct.saveCurrent(build, this);
        }catch(Exception ex){

        }
    }
}
