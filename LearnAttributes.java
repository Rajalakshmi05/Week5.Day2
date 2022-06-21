package Week7.Day2;

import org.testng.annotations.Test;

public class LearnAttributes {
@Test(priority=1)
	public void Createlead()
	{
		System.out.println("Create Lead");
	}
@Test(priority=-1, invocationCount=4)
	public void Editlead()
	{
		System.out.println("Edit Lead");
	}
@Test(priority=2, dependsOnMethods= {"Editlead"})
	public void Deletelead()
	{
		System.out.println("Delete Lead");
	}
@Test(enabled=false)	
	public void Duplicatelead()
	{
		System.out.println("Duplicate Lead");
	}
	
}

