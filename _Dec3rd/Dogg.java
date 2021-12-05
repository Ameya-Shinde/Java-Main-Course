package _Dec3rd;

class Beagle extends Dogg
{
    public void speak()
    {
        System.out.println("arf arf");
    }
}


public class Dogg {
	public void speak()
    {
        System.out.println("woof!");
    }

    public static void main(String[] args)
    {
        Dogg d = new Dogg();
        d.speak();
        Dogg b = new Beagle();
        b.speak();
    }

}
