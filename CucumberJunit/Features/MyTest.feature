Feature: User  Login
Scenario: Validating the login feature with valid data

Given launch the application
When  enter userName and password and click on ok button
Then  verify if user home page is displayed
And click on logout button 
And close browser
