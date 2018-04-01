Feature: Search for a ticket

@purchaseTicket
Scenario: look for a ticket and compare a price
Given go to UrlExpedia and look for a ticket
And Apply city and fill up the blanks 
Then click the search button
And save a results 

