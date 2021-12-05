package _Dec4th;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    String getNumberOfTeamMembers(){
        return "Each team has n players in " + getName();
    }
}

class Soccer extends Sports{

    @Override
    String getName(){
        return "Soccer Sport";
    }
    @Override
    String getNumberOfTeamMembers(){
        return "Each team has 11 players in "+getName();
    }
}

public class Sport {
	public static void main(String args[]) {
		Sports g= new Sports();
		System.out.println(g.getName());
		System.out.println(g.getNumberOfTeamMembers());
		
		Sports g1=new Soccer();
		System.out.println(g1.getName());
		System.out.println(g1.getNumberOfTeamMembers());
	}
}
