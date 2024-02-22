package FrameWork;

import org.testng.annotations.Test;


public class TestNGEx {

	@Test
	public void createContact()
	{
   System.out.println("Contact Created");
    }

	@Test
	public void modifyContact()
	{
		System.out.println("Contact Modified");
	}
	
	@Test(invocationCount = 3)
	public void deleteContact()
	{
		System.out.println("Contact deleted");
	}
}

