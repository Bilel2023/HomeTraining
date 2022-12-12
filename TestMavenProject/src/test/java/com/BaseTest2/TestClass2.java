package com.BaseTest2;

import org.testng.annotations.Test;

public class TestClass2 {
	
	

@Test(groups= {"SANITY"})

public void testCase4() {
	
	System.out.println("this is Test Case4");
}
@Test(groups= {"SANITY"})	
public void testCase5() {
	
	System.out.println("this is Test Case5");
}
@Test(groups= {"Regression"})
public void testCase6() {
	
	System.out.println("this is Test Case6");
}

}
