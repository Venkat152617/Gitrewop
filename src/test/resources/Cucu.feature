Feature: Verfiy the hotel booking 
@Execute1
Scenario:  verify the valid username & Invalid pwd
Given  User is on login page
When  The user is enter valid "<user name>" & valid "<password>"
|user name  |UserName009|
|password   |9E3AWC     |
And   user click login button
Then  navigate page to hotel booking  

@Execute2
Scenario: User Enter the hotel details
When user select loc "<location>"
|location|London| 
And user select hot "<hotel>"
|Hotel         |Hotle SunShine|
And user select room "<roontype>"
|roomtype      |Standard|
And user select no "<no of room>"
|no of room      |1-one|
And User select checkin "<Checkin date>"
|check in date      |21/03/2022|
And User select checkout "<Checkout Date>"
|check out date      |22/03/2021|
And User select adult "<Adults>"
|Adults              |1- one  |
And User selcct ch"<child>"
|child               |0- None  |
And user click search button
And click radio btn
And Click continue button
Then navigate to next page

@Execute3
Scenario: User Enter the personal Details
When User enter first"<first>"
|first             |Vengatesh|
And User enter last"<Last>"
|Last              |R  |
And User enter the bill"<billing>"
|billing             |sdffd |
And user enter cc"<cc no>"
|cc no             |1234567890123456 |
And user select type"<cc type>"
|cc type             |visa  |
And user select  mon"<expiry mon>"
|expiry mon        |mar |
And user select yr "<expiry yr>"
|expiry yr |2012   |
And user enter CVV "<num>"
|num  |778  |
And user click book button
Then Order no will be dispalyed

