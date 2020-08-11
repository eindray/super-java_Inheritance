package Inheritance;
import java.util.*;

public class Bowler extends Player {

    private Double bowlingAverage;
	
	public Bowler()
	{
		sc=new Scanner(System.in);
		System.out.println("What is the bowling average?: ");
		bowlingAverage=sc.nextDouble();
		System.out.println("The bowling average is : " + bowlingAverage);
	}

	@Override
	public void getName()
	{
		super.getName();
	}
	
	@Override
	public void setName()
	{
		super.setName();
	}

    public static void main(String args[])
    {
    System.out.println("Check all of the Players and Clubs information below:");
    Footballer f=new Footballer();
    f.getName();
    f.setName();
    System.out.println("*******");
    
    Cricketer c=new Cricketer();
    c.getName();
    c.setName();
    System.out.println("*******");
	
    Bowler b=new Bowler();
    b.getName();
    b.setName();
    System.out.println();
    System.out.println("- End of the script");
    }
}