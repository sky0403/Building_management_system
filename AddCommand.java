import java.util.*;
import java.io.*;

public class AddCommand implements Command {
	Vector _buildings;
    Building _build;
    CareTaker ct;

	public AddCommand(Vector buildings,CareTaker ct) {
		this._buildings = buildings;
        this.ct = ct;
	}

	public void execute() {
        int noOfRooms = 0;
        try{
            System.out.println("Enter Building Type(a=Apartment/h=House):");
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String line = br.readLine();
            if(line.equals("a")){
                _build = new Apartment();
            }else if(line.equals("h")){
                _build = new House();
            }
            System.out.println("New Building Added:");
            for(int i = 0; i<_build.getRoomQty(); i++){
                System.out.println("Room No.: " + (i+1) + " " + _build.getRooms().get(i).toString());
            }
            _buildings.add(_build);
            ct.saveCurrent(_build, this);
        }catch(Exception ex){

        }
	}

}
