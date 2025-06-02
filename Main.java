import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Vector _buildings = new Vector();
        CareTaker caretaker = new CareTaker();
        caretaker.setBuilding(_buildings);
		boolean cont = true;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
        HashMap<String, String> Map = new HashMap<String, String>() {{
            put("a", "AddCommandFac");
            put("d", "DisplayCommandFac");
            put("m", "ModifyBuildingCommandFac");
            put("e", "EditRoomsCommandFac");
            put("u", "UndoCommandFac");
            put("r", "RedoCommandFac");
            put("l", "UnRedoListCommandFac");
        }};

		try {
            CareTaker ct = new CareTaker();
            
			while (cont) {
                System.out.println("Building Management System (BMS)");
                System.out.println("Please enter command: [a|d|m|e|u|r|l|x]");
                System.out.println("a = add building, d = display buildings, m = modify building, e = edit rooms");
                System.out.println("u = undo, r = redo, l = list undo/redo, x = exit system");
                Command com;
                String command = br.readLine();
                if (command.equals("x")){
					cont = false;
                }else{
                    String factory = Map.get(command);
                    CommandFactory comfac = (CommandFactory) Class.forName(factory).newInstance();
                    comfac.setBuildings(_buildings);
                    comfac.setCaretaker(caretaker);
                    com = comfac.create();
                    if(com != null){
                        com.execute();
                    }
				}
                System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    
    }
}
