Feature: Testing rediff mypage

Scenario: User has to test if login on rediff is successful or not

Given I open the chrome browser
When I enter rediff mypage URL
Then I capture the title of the page
Then I click on login button
Then I should see an Error message
And I click on Click here link
And I close the browser																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											