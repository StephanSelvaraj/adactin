package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactingbookinpage extends BaseClass {
	
	public Adactingbookinpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "username" )
	private WebElement username;
	
	
	@FindBy(id = "password" )
	private WebElement password;
	
	
	@FindBy(id = "login" )
	private WebElement login;
	
	
	@FindBy(id = "location" )
	private WebElement location;
	
	@FindBy(id = "hotels" )
	private WebElement hotels;
	
	@FindBy(id = "room_type" )
	private WebElement room_type;
	
	
	@FindBy(id = "room_nos" )
	private WebElement room_nos;
	
	@FindBy(id = "datepick_in" )
	private WebElement datepick_in;

	@FindBy(id = "datepick_out" )
	private WebElement datepick_out;
	
	@FindBy(id = "adult_room" )
	private WebElement adult_room;
	
	
	

	@FindBy(id = "child_room" )
	private WebElement child_room;
	
	
	@FindBy(id = "Submit" )
	private WebElement submit_click;
	
	@FindBy(xpath = "//input[@type='radio']" )
	private WebElement radio;
	
	
	@FindBy(id = "continue" )
	private WebElement continue_click;
	
	@FindBy(xpath = "//input[@name='first_name']" )
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='last_name']" )
	private WebElement lastname;
	
	
	@FindBy(xpath = "//textarea[@name='address']" )
	private WebElement address;
	
	
	@FindBy(xpath = "//input[@name='cc_num']" )
	private WebElement creditCard;
	
	
	@FindBy(id = "cc_type" )
	private WebElement cc_type;
	
	
	@FindBy(id = "cc_exp_month" )
	private WebElement cc_exp_month;
	
	@FindBy(id = "cc_exp_year" )
	private WebElement cc_exp_year;
	
	
	@FindBy(xpath = "//input[@name='cc_cvv']" )
	private WebElement cvv;
	
	
	@FindBy(id = "book_now" )
	private WebElement book_now;


	public WebElement getUsername() {
		return username;
	}


	public void setUsername(WebElement username) {
		this.username = username;
	}


	public WebElement getPassword() {
		return password;
	}


	public void setPassword(WebElement password) {
		this.password = password;
	}


	public WebElement getLogin() {
		return login;
	}


	public void setLogin(WebElement login) {
		this.login = login;
	}


	public WebElement getLocation() {
		return location;
	}


	public void setLocation(WebElement location) {
		this.location = location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}


	public WebElement getRoom_type() {
		return room_type;
	}


	public void setRoom_type(WebElement room_type) {
		this.room_type = room_type;
	}


	public WebElement getRoom_nos() {
		return room_nos;
	}


	public void setRoom_nos(WebElement room_nos) {
		this.room_nos = room_nos;
	}


	public WebElement getDatepick_in() {
		return datepick_in;
	}


	public void setDatepick_in(WebElement datepick_in) {
		this.datepick_in = datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}


	public void setDatepick_out(WebElement datepick_out) {
		this.datepick_out = datepick_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}


	public void setAdult_room(WebElement adult_room) {
		this.adult_room = adult_room;
	}


	public WebElement getChild_room() {
		return child_room;
	}


	public void setChild_room(WebElement child_room) {
		this.child_room = child_room;
	}


	public WebElement getSubmit_click() {
		return submit_click;
	}


	public void setSubmit_click(WebElement submit_click) {
		this.submit_click = submit_click;
	}


	public WebElement getRadio() {
		return radio;
	}


	public void setRadio(WebElement radio) {
		this.radio = radio;
	}


	public WebElement getContinue_click() {
		return continue_click;
	}


	public void setContinue_click(WebElement continue_click) {
		this.continue_click = continue_click;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}


	public WebElement getAddress() {
		return address;
	}


	public void setAddress(WebElement address) {
		this.address = address;
	}


	public WebElement getCreditCard() {
		return creditCard;
	}


	public void setCreditCard(WebElement creditCard) {
		this.creditCard = creditCard;
	}


	public WebElement getCc_type() {
		return cc_type;
	}


	public void setCc_type(WebElement cc_type) {
		this.cc_type = cc_type;
	}


	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}


	public void setCc_exp_month(WebElement cc_exp_month) {
		this.cc_exp_month = cc_exp_month;
	}


	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}


	public void setCc_exp_year(WebElement cc_exp_year) {
		this.cc_exp_year = cc_exp_year;
	}


	public WebElement getCvv() {
		return cvv;
	}


	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}


	public WebElement getBook_now() {
		return book_now;
	}


	public void setBook_now(WebElement book_now) {
		this.book_now = book_now;
	}
	
	
	
	
	
}
