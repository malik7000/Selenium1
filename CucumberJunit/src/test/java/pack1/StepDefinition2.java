package pack1;

import cucumber.api.java.en.When;

public class StepDefinition2 {
	@When("^enter \"(.*?)\" and \"(.*?)\" and click on ok button$")
	public void enter_and_and_click_on_ok_button(String arg1, String arg2) throws Throwable {
		Common.launchbrowser();
		Common.accessapplication("http://www.adactin.com/HotelAppBuild2/");

		Common.sendText("id", "username", arg1);
		Common.sendText("id", "password", arg2);
		Common.ButtonClick("id", "login");
		Common.linkClick("linkText", "Logout");
		System.out.println("is this runing");
		Common.closeBrowser();

	}

}
