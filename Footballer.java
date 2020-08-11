package Inheritance;
import java.util.*;

public class Footballer extends Player {
	
	private String club;
	
	public Footballer()
	{
		sc=new Scanner(System.in);
		System.out.println("Get the name of the Club: ");
		club=sc.next();
		System.out.println("The club name : " + club);
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
}
