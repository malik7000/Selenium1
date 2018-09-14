package pack1;

import cucumber.api.java.en.Then;

public class StepDefinition3 {
	@Then("^Enter data and select hotel$")
	public void enter_data_and_select_hotel() throws Throwable {
	   Common.selectelementindex("id", "location", 1);
	   Common.selectelementvalue("id", "hotels", "Hotel Sunshine");
	   Common.selectelementindex("id", "room_type", 2);
	   Common.selectelementvalue("id","room_nos","2");
	   Common.sendText("id", "datepick_in", "20/09/2018");
	   Common.sendText("id", "datepick_out", "26/09/2018");
	   Common.selectelementvalue("id","adult_room","2");
	   Common.selectelementindex("id", "child_room", 1);
	   Common.linkClick("id", "Submit");
	   Common.linkClick("id", "radiobutton_0");
	   Common.linkClick("id", "continue");
	}

	@Then("^Enter personal details and book$")
	public void enter_personal_details_and_book() throws Throwable {
	   Common.sendText("id", "first_name", "Zeeshan");
	   Common.sendText("id", "last_name", "Malik");
	   Common.sendText("id", "address", "78 A PCSIR");
	   Common.sendText("id", "cc_num", "1234567812345678");
	   Common.selectelementvalue("id", "cc_type", "VISA");
	   Common.selectelementvalue("id", "cc_exp_month", "3");
	   Common.selectelementindex("id", "cc_exp_year", 10);
	   Common.sendText("id", "cc_cvv", "222");
	   Common.linkClick("id", "book_now");
	}
	}

