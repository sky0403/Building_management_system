import java.io.*;

public class Apartment extends Building{
    private double monthlyRental;
    private String supportStaff;
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);

    public Apartment(){
        super();
		try{
            System.out.print("Building No.:");
			String line = br.readLine();
		    int id = Integer.parseInt(line);
            super.setId(id);
			System.out.print("Monthly Rental:");
			line = br.readLine();
			monthlyRental = Double.parseDouble(line);
            System.out.print("Support Staff:");
            line = br.readLine();
            supportStaff = line;
            System.out.print("Number of rooms:");
            line = br.readLine();
            int noOfRooms = Integer.parseInt(line);
            setRooms(noOfRooms);
            try{
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
            }catch(Exception ex){
                
            }
            
        }catch(Exception e){
			
        }
    }

    public Apartment(int id,int noOfRooms,double monthlyRental,String supportStaff){
        super(id, noOfRooms);
        this.monthlyRental = monthlyRental;
        this.supportStaff = supportStaff;
        try{
            for(int i = 0; i<noOfRooms; i++){
                System.out.println("Room No. " + (i+1) + ":");
                System.out.print("Length: ");
                String line = br.readLine();
                int len = Integer.parseInt(line);

                System.out.print("Width: ");
                line = br.readLine();
                int wid = Integer.parseInt(line);
                addRoom(len, wid);
            }
        }catch(Exception ex){
            
        }
    }

    public void setMonthlyRental(double monthlyRental){
        this.monthlyRental = monthlyRental;
    }

    public double getMonthlyRental(){
        return monthlyRental;
    }

    public void setSupportStaff(String supportStaff){
        this.supportStaff = supportStaff;
    }

    public String getSupportStaff(){
        return supportStaff;
    }
    public void modifyBuilding(){
        try{
            System.out.print("Modify Monthly Rental: ");
            monthlyRental = Double.parseDouble(br.readLine());
            System.out.print("Modify Support Staff: ");
            supportStaff = br.readLine();
            System.out.println("Building is modified");
        }catch(Exception ex){}
    }
    public void printBuilding(){
        System.out.println("Building No.: " + super.getId() + "\nSupport Staff: " + supportStaff + "\nMonthly Rental: " + monthlyRental);
        for(int i = 0; i<getRoomQty();i++){
            System.out.println("Room No.: " + (i+1) + " " + getRooms().get(i).toString());
        }
    }
    public String toString(){
        return "Building No.: " + super.getId() + ", Support Staff: " + supportStaff + ", Monthly Rental: " + monthlyRental;
    }
}
