import java.util.ArrayList;


abstract class Building{
    private int id;
    private ArrayList<Room> rooms;

    public Building(){}

    public Building(int id,int noOfRooms){
        this.id = id;
        rooms = new ArrayList<Room>(noOfRooms);
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public ArrayList<Room> getRooms(){
        return rooms;
    }
    public void setRooms(int noOfRooms){
        this.rooms = new ArrayList<Room>(noOfRooms);
    }
    public Room addRoom(double length, double width){
        Room room = new Room(length, width);
        rooms.add(room);
        return room;
    }
    public void modifyRoom(int roomNo,double length, double width){
        rooms.get(roomNo-1).setLength(length);
        rooms.get(roomNo-1).setWidth(width);
    }
    public void deleteRoom(int roomNo){
        rooms.remove(roomNo-1);
    }
    public void printRooms(){
        for(int i = 0; i< rooms.size(); i++){
            System.out.println("Room No.: " + (i+1) + " " + rooms.get(i).toString());
        }
    }
    public int getRoomQty(){
        return rooms.size();
    }
    abstract void modifyBuilding();
    abstract void printBuilding();
}