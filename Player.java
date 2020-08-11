package Inheritance;
import java.util.*;

public class Player {
	private String name;
	
	public Player()
	{
		sc=new Scanner(System.in);
	}

	protected Scanner sc;
	
	public void getName()
	{
		System.out.println("Please fill in your name: ");
		name=sc.next();
	}
	
	public void setName()
	{
		System.out.println("The player name is: " + name);
	}
}