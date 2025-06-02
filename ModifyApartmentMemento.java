public class ModifyApartmentMemento implements Memento{
    private Apartment apart;
    private int id,noOfRooms;
    private String supportStaff;
    private double monthlyRental;
    
    public ModifyApartmentMemento(Apartment apart){
        this.apart = apart;
        this.id = apart.getId();
        this.noOfRooms = apart.getRoomQty();
        this.supportStaff = apart.getSupportStaff();
        this.monthlyRental = apart.getMonthlyRental();
    }
    public void restore(){
        apart.setId(id);
        apart.setSupportStaff(supportStaff);
        apart.setMonthlyRental(monthlyRental);
    }
    public String getStaff(){
        return supportStaff;
    }
    public double getmonthly(){
        return monthlyRental;
    }

    public int getBuildingID(){
        return id;
    }
    public Building getBuilding(){
        return this.apart;
    }

    public String toString(){
        return "Modify Building: " + this.getBuildingID() + ", Support Staff: " + this.getStaff() + ", Monthly Rental: " + this.getmonthly();
    }
}
