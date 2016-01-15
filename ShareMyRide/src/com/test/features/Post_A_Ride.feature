Feature: Publish a ride .
As an employee of  bank i need my car details to be shared to all the bank employees 
who want to share car rides.

@myFirstTag
Scenario: The employee post all the details correctly.
Given employee enter all mandatory data correctly.
When click on "Submit"
Then Display Message "Publish Successful"

Scenario: The employee post correct data mentioned below.
Given employee Person No. is 22222222 , Phone No. is 1234567890, Email Id is "ankit@gmail.com" , origin is "Gurgaon", destination is "Noida", Ride Type is "Car", Seats Offered is 4, Start Time is "13/01/2016:18:00:00" 
When click on "Submit"
Then Display Message "Publish Successful"


Scenario: The employee post data 
And time less that current time
Given employee Person No. 22222222 , Phone No. 1234567890, Email Id "ankit@gmail.com" , origin "Gurgaon", destination "Noida", Ride Type "Car", Seats Offered 4, Start Time "12/01/2016:11:00:00" 
When click on "Submit"
Then Display Message "Please enter correct Date and Time"



Scenario: Mandatory field is missing
Given employee Person No. , Phone No. 1234567890, Email Id "ankit@gmail.com" , origin "Gurgaon", destination "Noida", Ride Type "Car", Seats Offered 4, Start Time "12/01/2016:11:00:00" 
When click on "Submit"
Then Display Message "Mandatory field left blank"



