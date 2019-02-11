Meta:

Narrative:
This story covers all tests of main page

Lifecycle:
Before:
Given I open Main page

Scenario: User can go to main page via logo
When I click on logo
Then I see Main page URL
And I see main carousel

Scenario: User can browse through images main carousel
Then I see same image after browsing trough all images in main carousel