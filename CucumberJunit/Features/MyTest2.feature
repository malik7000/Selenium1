Feature: User  Login with multiple logins
Scenario Outline: Validating the login with multile data inputs

When  enter "<username>" and "<password>" and click on ok button


Examples:
|username|password|
|tester22|tester22|
|tester33|tester33|