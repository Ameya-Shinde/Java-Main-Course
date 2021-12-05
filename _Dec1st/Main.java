package _Dec1st;

class Animals
{
	int legs;
	String type;
	int wings;
	
	Animals(int legs, String type)
	{
		this(4,type,0);
	}
	Animals(int legs, String type,int wings)
	{
		this.legs = legs;
		this.type = type;
		this.wings=wings;
	}
	
	public Animals() {
		// TODO Auto-generated constructor stub
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public void isHerbivore()
	{
		System.out.println("Is a Herbivore");
	}
	public void isCarnivore()
	{
		System.out.println("Is a Carnivore");
	}
	public void isOmnivore()
	{
		System.out.println("Is a Omnivore");
	}
	public void hasWings(int n)
	{	
		this.wings=n;
		System.out.println("Yes, Number of Wings = "+this.wings);
	}
	public void display() {
		System.out.println("Type :"+this.type+"\nNumber of Legs :"+this.legs);
	}
	
}


public class Main {
	public static void main(String[] args)
	{
		Animals dog = new Animals();
		dog.setLegs(4);
		dog.setType("Domestic");
		System.out.println("Dog");
		System.out.println("Type :"+dog.getType()+"\nNumber of Legs :"+dog.getLegs());
		dog.isOmnivore();
		System.out.println();
		
		System.out.println("Lion");
		Animals tiger = new Animals(4,"Wild");
		tiger.display();
		tiger.isCarnivore();
		System.out.println();
		
		System.out.println("Eagle");
		Animals pgn = new Animals(2,"Domestic",2);
		pgn.display();
		pgn.hasWings(2);
		pgn.isCarnivore();
		
	}

}
