Meta:

Narrative:
This story covers all test of main page

Lifecicle:
Before:
Given I open main page

Scenario: User can go to main page via logo
When I click on logo
Then I see main page URL
And I see 0 image in main carousel

Scenario: User clicks through main carousel
When I click through main carousel
Then I see 0 image in main carousel