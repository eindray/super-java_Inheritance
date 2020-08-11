package Inheritance;
import java.util.*;

public class Cricketer extends Player {
	private Double battingAverage;
	
	public Cricketer()
	{
		sc=new Scanner(System.in);
		System.out.println("What is the batting average?: ");
		battingAverage=sc.nextDouble();
		System.out.println("The batting average is : " + battingAverage);
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
