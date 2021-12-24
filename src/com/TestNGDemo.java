package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGDemo {
  @Test(priority = 1)
  public void test1() 
  {
  System.out.println("Testing1 start");
  
  }
  
  
  @Test(priority = 2)
  public void test2() 
  {
  System.out.println("Testing2 start");
  
  }
  @Test(priority = 3)
  public void test3() 
  {
  System.out.println("Testing3 start");
  
  }
  @Test(priority = 4)
  public void test4() 
  {
  System.out.println("Testing4 start");
  
  }
  @Test(priority = 5)
  public void test5() 
  {
  System.out.println("Testing5 start");
  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("test before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("test after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test start");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test end");
  }

}
