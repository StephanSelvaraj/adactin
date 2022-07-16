Feature: Book hotel using username and password

  
Scenario: Book hotel room with one set of username and password
Given Open the Adactinhotel application
When enter the Username and Password
And click the Login button
And selction the location
And select the Hotels
And select the RoomType
And select the Number of Room
And select Check in date
And checkout date
And select no of adults per room
And select the Childrens per room
And selct the Radio button and continue
And fill name and address details
And add credit card number
And select card tyope
And selct month year
And add Cvv number
Then click Book Now
  