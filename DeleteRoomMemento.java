import java.util.*;
public class DeleteRoomMemento implements Memento{
    Room room;
    double length,width;
    int RoomNo,id;
    Building build;

    public DeleteRoomMemento(Building build,Room room,int RoomNo){
        this.room = room;
        this.length = room.getLength();
        this.width = room.getWidth();
        this.build = build;
        this.RoomNo = RoomNo;
        this.id = build.getId();
    }

    public Building getBuilding(){
        return build;
    }

    public int getRoomNo(){
        return RoomNo;
    }
    public void restore(){
        build.getRooms().add(RoomNo-1, room);
        this.room = room;
    }
    
    public int getBuildingID(){
        return id;
    }

    public String toString(){
        return "Delete Room: Building No.: " + build.getId() + ", Room No. "+ RoomNo + ", Length: " + length + ", Width: " + width;
    }
}
