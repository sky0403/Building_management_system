public class HouseMemento implements Memento{
    private House house;
    private int id,noOfRooms,noOfFloors;
    
    public HouseMemento(House house){
        this.house = house;
        this.id = house.getId();
        this.noOfFloors = house.getFloors();
    }
    public void restore(){
        house.setId(id);
        house.setFloors(noOfFloors);
    }
    
    public int getBuildingID(){
        return id;
    }
    public int getFloor(){
        return noOfFloors;
    }
    public Building getBuilding(){
        return house;
    }
    public String toString(){
        return "Add Building: " + this.getBuildingID() + ", No. of Floor: " + this.getFloor();
    }
}
