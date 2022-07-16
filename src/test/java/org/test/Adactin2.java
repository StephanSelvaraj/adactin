package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin2 extends BaseClass{
	
	//WebDriver driver;
	
	@Given("Open the Adactinhotel application")
	public void open_the_Adactinhotel_application() {
		
		Adactingbookinpage a = new Adactingbookinpage();
		browserLaunch("https://adactinhotelapp.com/");
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://adactinhotelapp.com/");
		
	}

	@When("enter the Username and Password")
	
	public void enter_the_Username_and_Password() {
		
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement username = a.getUsername();
		WebElement password = a.getPassword();
		enterText(username, "stefandselvaraj");
		enterText(password, "Reverse@123");
    System.out.println("Today i am practicing cucumber");
		System.out.println("Today i am working on git cucumber");
		
		

		
//		driver.findElement(By.id("username")).sendKeys("stefandselvaraj");
//		driver.findElement(By.id("password")).sendKeys("Reverse@123");
	}
	
	
	

	@And("click the Login button")
	public void click_the_Login_button() {
		
		Adactingbookinpage a = new Adactingbookinpage();
		a.getLogin().click();
		
		
//	driver.findElement(By.id("login")).click();    
	
	}
	
	
	

	@And("selction the location")
	public void selction_the_location() throws InterruptedException {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement location = a.getLocation();
		enterId(location, "Sydney");
		
//	 WebElement location =   driver.findElement(By.name("location"));
//	 Select select = new Select(location);
//	 Thread.sleep(2000);
//	 	 
//	 select.selectByValue("Sydney");		 
		
		
	}
	
	
	

	@And("select the Hotels")
	public void select_the_Hotels() throws InterruptedException {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement hotels = a.getHotels();
		enterId(hotels, "Hotel Creek");
		
		
//		Select select1 = new Select(driver.findElement(By.id("hotels")));
//		Thread.sleep(2000);
//		select1.selectByValue("Hotel Creek");
//	    
	}

	@And("select the RoomType")
	public void select_the_RoomType() throws InterruptedException {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement room_type = a.getRoom_type();
		enterId(room_type, "Standard");
		
		
//		Select select2 = new Select(driver.findElement(By.id("room_type")));
//		Thread.sleep(2000);
//		select2.selectByValue("Standard");
//	    

	}

	@And("select the Number of Room")
	public void select_the_Number_of_Room() throws InterruptedException {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement room_nos = a.getRoom_nos();
		enterId(room_nos, "2");
		
		
//		Select select3 = new Select(driver.findElement(By.id("room_nos")));
//		Thread.sleep(2000);
//		select3.selectByValue("2");
//	    	    
	}

	@And("select Check in date")
	public void select_Check_in_date() {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement datepick_in = a.getDatepick_in();
		enterText(datepick_in, "20/07/2022");
		
//		driver.findElement(By.id("datepick_in")).sendKeys("20/06/2022");
	  
	}

	@And("checkout date")
	public void checkout_date() {
		
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement datepick_out = a.getDatepick_out();
		enterText(datepick_out,"22/07/2022");
		//driver.findElement(By.id("datepick_out")).sendKeys("22/06/2022");
	}

	@And("select no of adults per room")
	public void select_no_of_adults_per_room() throws InterruptedException {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement adult_room = a.getAdult_room();
		enterId(adult_room, "2");
		
//	    Select selectNew1 = new Select(driver.findElement(By.id("adult_room")));
//	    Thread.sleep(2000);
//		selectNew1.selectByValue("2");
		
	}
	

	@And("select the Childrens per room")
	public void select_the_Childrens_per_room() throws InterruptedException {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement child_room = a.getChild_room();
		enterId(child_room, "4");
		a.getSubmit_click().click();

		
//		Select selectNew2 = new Select(driver.findElement(By.id("child_room")));
//	    Thread.sleep(2000);
//		selectNew2.selectByValue("4");
//		//submit
		//driver.findElement(By.id("Submit")).click();
	   
	}

	@And("selct the Radio button and continue")
	public void selct_the_Radio_button_and_continue() {
		Adactingbookinpage a = new Adactingbookinpage();
		
		a.getRadio().click();
	    //driver.findElement(By.xpath("//input[@type='radio']")).click();
	    //continue
		a.getContinue_click().click();
	    //driver.findElement(By.id("continue")).click();
	}

	@And("fill name and address details")
	public void fill_name_and_address_details() {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement firstname = a.getFirstname();
		WebElement lastname = a.getLastname();
		WebElement address = a.getAddress();
		
		enterText(firstname, "Selvaraj");
		enterText(lastname, "Stefan");
		enterText(address, "Chennai");
		
		
//		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Selvaraj");
//		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Stefan");
//		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Chennai");
			
	    
	}

	@And("add credit card number")
	public void add_credit_card_number() {
		
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement creditCard = a.getCreditCard();
		enterText(creditCard, "1111111235416555");
		//driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1111111235416555");
		
	}

	@And("select card tyope")
	public void select_card_tyope() throws InterruptedException {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement cc_type = a.getCc_type();
		enterId(cc_type, "AMEX");
//		Select select22 = new Select(driver.findElement(By.id("cc_type")));
//		Thread.sleep(2000);
//		select22.selectByValue("AMEX");
//		
		
	}

	@And("selct month year")
	public void selct_month_year() throws InterruptedException {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement cc_exp_month = a.getCc_exp_month();
		enterId(cc_exp_month, "12");
		
//		Select select23 = new Select(driver.findElement(By.id("cc_exp_month")));
//		Thread.sleep(2000);
//		select23.selectByValue("12");
	}

	@And("add Cvv number")
	public void add_Cvv_number() throws InterruptedException {
		Adactingbookinpage a = new Adactingbookinpage();
		WebElement cc_exp_year = a.getCc_exp_year();
		enterId(cc_exp_year, "2022");
		
//		Select select24 = new Select(driver.findElement(By.id("cc_exp_year")));
//		Thread.sleep(2000);
//		select24.selectByValue("2022");
		
		//cvv
		WebElement cvv = a.getCvv();
		enterText(cvv, "123");
//		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
//	   Thread.sleep(2000);
	}

	@Then("click Book Now")
	public void click_Book_Now() {
		Adactingbookinpage a = new Adactingbookinpage();
		a.getBook_now().click();
		//driver.findElement(By.id("book_now")).click();
	   
	}



}
