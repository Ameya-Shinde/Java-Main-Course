package _Nov29th;

class Vehicle
{
	int tyres;
	String type;
	
	Vehicle()
	{
		this.tyres=2;
		this.type="Bike";
		System.out.println("Vehicle Type: "+type);
		System.out.println("No of tyres: "+tyres);
	}
	
        Vehicle(int tyres, String type)
	{
		this.tyres=tyres;
		this.type=type;
	}
    
        public void fuelType(String ftype)
        {
    	System.out.println("Fuel Type: "+ftype);
        }
	
	public int getTyres()
	{
		return this.tyres;
	}
	public String getType()
	{
		return this.type;
	}
	
	public void setTyres(int tyres)
	{
		this.tyres=tyres;
	}
        public void setType(String type)
	{
		this.type=type;
	}
    
}



public class Transport {
	
	public static void main(String[] args) {
		
		Vehicle bike  = new Vehicle();
		bike.fuelType("Petrol");
		System.out.println();
	
		Vehicle car  = new Vehicle(4,"Car");
        System.out.println("Vehicle Type: "+car.getType());
        System.out.println("No of tyres: "+car.getTyres());
        car.fuelType("Petrol/Diesel");
        System.out.println();
		
		Vehicle truck  = new Vehicle(6,"Truck");
		System.out.println("Vehicle Type: "+truck.getType());
		System.out.println("No of tyres: "+truck.getTyres());
        truck.fuelType("Diesel");
        
	}
}
