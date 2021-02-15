package com.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");


//		Assert.assertEquals("","","");
//		Assert.assertTrue(true);
//
//		Assert.assertTrue(true,"");
//
//		Assert.assertFalse(false);

	}
	//@Test(invocationCount = 5)
	@Test(priority=1)
	public  void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(true);
	}

	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}

	@Test(priority = -1)
	public void SecondTest()
	{
		System.out.println("bye_bye");
	}

	@Test(priority=-1)

	public void Aandomdemo(){

		System.out.println("hello arkadashlar");
	}

	@Test(priority=-2)

	public void thridTest(){

		System.out.println("smallest value");
	}

}
