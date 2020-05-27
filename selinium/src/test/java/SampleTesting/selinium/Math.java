package SampleTesting.selinium;

import static org.testng.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Math {
	public static int add,a,b,int1;
	@Given("sum of two number {int} and {int}")
	public void sum_of_two_number_and(int a, int b) {
	    add=a+b;
	    System.out.println("adddd>>>>"+add);
	}

	
	@When("sum is {int}")
	public void sum_is(int int1) {
		 System.out.println("adddd>>>>"+add);
		   assertEquals(int1,add);
	}
	
	}


	    
	

