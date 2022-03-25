package org.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	static WebDriver driver;
	
	@Given("User is on login page")
	public void userIsOnLoginPage() {
   WebDriverManager.chromedriver().setup();
   driver = new ChromeDriver();
   driver.get("https://adactinhotelapp.com/");
   driver.manage().window().maximize();
   
}
	@When("The user is enter valid {string} & valid {string}")
	public void theUserIsEnterValidValid(String string, String string2, io.cucumber.datatable.DataTable dt) {
  
		String user = (String) dt.asMap(String.class, String.class).get("user name");
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(user);
		String pwd = (String) dt.asMap(String.class, String.class).get("password");
		WebElement txtPwd = driver.findElement(By.id("password"));
		txtPwd.sendKeys(pwd);	
		
		}	
	
	@When("user click login button")
	public void userClickLoginButton() {
	    WebElement btn= driver.findElement(By.id("login"));
	    btn.click();
	}
	
	@Then("navigate page to hotel booking")
	public void navigatePageToHotelBooking() {
	  System.out.println("User Enter hotel booking main page"); 
	}

	@When("user select loc {string}")
	public void userSelectLoc(String string, io.cucumber.datatable.DataTable dt) {
		String loc = (String) dt.asMap(String.class, String.class).get("location");
		if (loc!=null) {
			WebElement txtLoc = driver.findElement(By.id("location"));	
			txtLoc.sendKeys(loc);
		} else {
           System.out.println("leave the page");
		}
	  
	}
	
	@When("user select hot {string}")
	public void userSelectHot(String string, io.cucumber.datatable.DataTable dt) {
		String hot = (String) dt.asMap(String.class, String.class).get("Hotel");
		if (hot!=null) {
			WebElement txthot = driver.findElement(By.id("hotels"));
			txthot.sendKeys(hot);	
		} else {
           System.out.println("leave the page");
		}
		
	
	
	}

	@When("user select room {string}")
	public void userSelectRoom(String string, io.cucumber.datatable.DataTable dt) {
    String room = (String) dt.asMap(String.class, String.class).get("roomtype");
	 WebElement txtroom = driver.findElement(By.id("room_type"));
	 txtroom.sendKeys(room);
	 }

	@When("user select no {string}")
	public void userSelectNo(String string, io.cucumber.datatable.DataTable dt) {
    String roomNo = (String) dt.asMap(String.class, String.class).get("no of room");
	 WebElement selNo = driver.findElement(By.id("room_nos"));
	 selNo.sendKeys(roomNo);
		
		
	}

	@When("User select checkin {string}")
	public void userSelectCheckin(String string, io.cucumber.datatable.DataTable dt) {
		String checkIn = (String) dt.asMap(String.class, String.class).get("check in date");
		 WebElement datein = driver.findElement(By.id("datepick_in"));
		   datein.sendKeys(checkIn);	
		
	   
	}

	@When("User select checkout {string}")
	public void userSelectCheckout(String string, io.cucumber.datatable.DataTable dt) {
		String checkOut = (String) dt.asMap(String.class, String.class).get("check out date");	
		 WebElement dateout = driver.findElement(By.id("datepick_out"));
		   dateout.sendKeys(checkOut);
		
	   
	}

	@When("User select adult {string}")
	public void userSelectAdult(String string, io.cucumber.datatable.DataTable dt) {
		String adu = (String) dt.asMap(String.class, String.class).get("Adults");	
		 WebElement adult1 = driver.findElement(By.id("adult_room"));
		   adult1.sendKeys(adu);
		
	   
	}

	@When("User selcct ch{string}")
	public void userSelcctCh(String string, io.cucumber.datatable.DataTable dt) {
		String ch = (String) dt.asMap(String.class, String.class).get("child");	
		  WebElement child = driver.findElement(By.id("child_room"));
		    child.sendKeys(ch);	
	   
	}

	@When("user click search button")
	public void userClickSearchButton() {
		
		 WebElement src = driver.findElement(By.id("Submit"));
		    src.click();
	  
	}

	@When("click radio btn")
	public void clickRadioBtn() {
		 WebElement rdBtn = driver.findElement(By.id("radiobutton_0"));
		   rdBtn.click();
	  
	}

	@When("Click continue button")
	public void clickContinueButton() {
		WebElement cnt = driver.findElement(By.id("continue"));
		   cnt.click();	
		}

	@Then("navigate to next page")
	public void navigateToNextPage() {
		System.out.println("Navigate to Final Page");
	   
	}

	@When("User enter first{string}")
	public void userEnterFirst(String string, io.cucumber.datatable.DataTable dt) {
		String first = (String) dt.asMap(String.class, String.class).get("first");	
		 WebElement txtFirst = driver.findElement(By.id("first_name"));
		    txtFirst.sendKeys(first);
		
	   
	}

	@When("User enter last{string}")
	public void userEnterLast(String string, io.cucumber.datatable.DataTable dt) {
		String last = (String) dt.asMap(String.class, String.class).get("Last");		
		WebElement txtLast = driver.findElement(By.id("last_name"));
	    txtLast.sendKeys(last);
		
	   
	}

	@When("User enter the bill{string}")
	public void userEnterTheBill(String string, io.cucumber.datatable.DataTable dt) {
		String bill = (String) dt.asMap(String.class, String.class).get("billing");	
		 WebElement txtLast = driver.findElement(By.id("address"));
		    txtLast.sendKeys(bill);
		}
	


	@When("user enter cc{string}")
	public void userEnterCc(String string, io.cucumber.datatable.DataTable dt) {
		String cc = (String) dt.asMap(String.class, String.class).get("cc no");		
		 WebElement txtCc = driver.findElement(By.id("cc_num"));
		    txtCc.sendKeys(cc);
	   
	}

	@When("user select type{string}")
	public void userSelectType(String string, io.cucumber.datatable.DataTable dt) {
		String ccType = (String) dt.asMap(String.class, String.class).get("cc type");			
		 WebElement txtTyp = driver.findElement(By.id("cc_type"));
		    txtTyp.sendKeys(ccType);
	    
	}

	@When("user select  mon{string}")
	public void userSelectMon(String string, io.cucumber.datatable.DataTable dt) {
    String mon = (String) dt.asMap(String.class, String.class).get("expiry mon");	
	WebElement txtMon = driver.findElement(By.id("cc_exp_month"));
    txtMon.sendKeys(mon);
		
	}

	@When("user select yr {string}")
	public void userSelectYr(String string, io.cucumber.datatable.DataTable dt) {
		 String yr = (String) dt.asMap(String.class, String.class).get("expiry yr");	
		WebElement txtYr = driver.findElement(By.id("cc_exp_year"));
	    txtYr.sendKeys(yr);
		
	   
	}

	@When("user enter CVV {string}")
	public void userEnterCVV(String string, io.cucumber.datatable.DataTable dt) {
		 String cvv = (String) dt.asMap(String.class, String.class).get("num");	
		WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
	    txtCvv.sendKeys(cvv);
		
	    
	}

	@When("user click book button")
	public void userClickBookButton() {
		 WebElement btn = driver.findElement(By.id("book_now"));
		 btn.click();  
	}

	@Then("Order no will be dispalyed")
	public void orderNoWillBeDispalyed() {
		 System.out.println("Congratulations Yor room has been booked");
		
	}

	
}