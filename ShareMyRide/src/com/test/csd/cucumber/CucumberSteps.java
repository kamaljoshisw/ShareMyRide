package com.test.csd.cucumber;


import com.test.csd.main.PostRideBean;
import com.test.csd.main.Publisher;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps {

	PostRideBean bean;
	String buttonClicked;
	
	@Given("^employee enter all mandatory data correctly.$")
	public void employee_enter_all_mandatory_data_correctly() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		bean = new PostRideBean();
		bean.setName("Team");
		bean.setPersonNumber(3423423);
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		buttonClicked = arg1;
		
		
	}

	@Then("^Display Message \"([^\"]*)\"$")
	public void Display_Message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		String msg = null;
		if(buttonClicked.equals("Submit")){
			Publisher publisher = new Publisher();
			msg= publisher.submit(bean);
		}
		
		org.junit.Assert.assertEquals(arg1, msg);
	}

	@Given("^employee Person No. is (\\d+) , Phone No. is (\\d+), Email Id is \"([^\"]*)\" , origin is \"([^\"]*)\", destination is \"([^\"]*)\", Ride Type is \"([^\"]*)\", Seats Offered is (\\d+), Start Time is \"([^\"]*)\"$")
	public void employee_Person_No_is_Phone_No_is_Email_Id_is_origin_is_destination_is_Ride_Type_is_Seats_Offered_is_Start_Time_is(int arg1, int arg2, String arg3, String arg4, String arg5, String arg6, int arg7, String arg8) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^time less that current time$")
	public void time_less_that_current_time() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^employee Person No. (\\d+) , Phone No. (\\d+), Email Id \"([^\"]*)\" , origin \"([^\"]*)\", destination \"([^\"]*)\", Ride Type \"([^\"]*)\", Seats Offered (\\d+), Start Time \"([^\"]*)\"$")
	public void employee_Person_No_Phone_No_Email_Id_origin_destination_Ride_Type_Seats_Offered_Start_Time(int arg1, int arg2, String arg3, String arg4, String arg5, String arg6, int arg7, String arg8) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^employee Person No. , Phone No. (\\d+), Email Id \"([^\"]*)\" , origin \"([^\"]*)\", destination \"([^\"]*)\", Ride Type \"([^\"]*)\", Seats Offered (\\d+), Start Time \"([^\"]*)\"$")
	public void employee_Person_No_Phone_No_Email_Id_origin_destination_Ride_Type_Seats_Offered_Start_Time(int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
}
