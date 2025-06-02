import java.io.*;

public class House extends Building{
    private int noOfFloors;
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);

    public House(){
        super();
		try{
            System.out.print("Building No.:");
			String line = br.readLine();
		    int id = Integer.parseInt(line);
            super.setId(id);
            System.out.println();
            System.out.print("No. of Floors: ");
			line = br.readLine();
		    noOfFloors = Integer.parseInt(line);
            System.out.println();
            System.out.print("Number of rooms:");
            line = br.readLine();
            int noOfRooms = Integer.parseInt(line);
            System.out.println();
            super.setRooms(noOfRooms);

            for(int i = 0; i<noOfRooms; i++){
                System.out.println("Room No. " + (i+1) + ":");
                System.out.print("Length: ");
                line = br.readLine();
                int len = Integer.parseInt(line);
                System.out.print("Width: ");
                line = br.readLine();
                int wid = Integer.parseInt(line);
                addRoom(len, wid);
            }
        }catch(Exception e){
			
        }
    }

    public House(int id, int noOfRooms,int noOfFloors){
        super(id,noOfRooms);
        this.noOfFloors = noOfFloors;
    }
    public void setFloors(int noOfFloors){
        this.noOfFloors = noOfFloors;
    }
    public int getFloors(){
        return noOfFloors;
    }
    public void modifyBuilding(){
        try{
            System.out.print("No. of Floors: ");
            noOfFloors = Integer.parseInt(br.readLine());
            System.out.println("Building is modified");
        }catch(Exception ex){}
    }
    public void printBuilding(){
        System.out.println("Building No.: " + super.getId() + "\nNo. of Floors: " + noOfFloors);
        for(int i = 0; i<getRoomQty();i++){
            System.out.println("Room No.: " + (i+1) + " " + getRooms().get(i).toString());
        }
    }
    public String toString(){
        return "Building No.: " + super.getId() + ", No. of Floors: " + noOfFloors;
    }
}
