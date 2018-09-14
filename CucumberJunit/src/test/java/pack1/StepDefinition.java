package pack1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("^launch the application$")
	public void launch_the_application() throws Throwable {
		Common.launchbrowser();
		Common.accessapplication("http://www.adactin.com/HotelAppBuild2/");
	}

	@When("^enter userName and password and click on ok button$")
	public void enter_userName_and_password_and_click_on_ok_button() throws Throwable {
		Common.sendText("id", "username", "tester11");
		Common.sendText("id", "password", "tester11");
		Common.ButtonClick("id", "login");

	}



	@Then("^verify if user home page is displayed$")
	public void verify_if_user_home_page_is_displayed() throws Throwable {
		String Actual = "HI";
		String Expected = "HI";
		if (Actual == Expected) {
			System.out.println("passed");
		} else {
			System.out.println("Failed");
		}
	}

	@Then("^click on logout button$")
	public void click_on_logout_button() throws Throwable {
		Common.linkClick("linkText", "Logout");
		System.out.println("is this running");
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		Common.closeBrowser();
	}

	
}