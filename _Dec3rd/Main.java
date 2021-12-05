package _Dec3rd;

abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}
class Novel extends Book
{
	@Override
	void setTitle(String s)
	{
		this.title=s;
	}
	
}
public class Main {
	public static void main(String[] args)
	{
		Novel new_novel=new Novel(); 
		new_novel.setTitle("A tale of two cities");
		System.out.println("The title is: "+new_novel.getTitle());
	}

}
