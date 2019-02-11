Narrative:
This story covers all tests of wedding page

Scenario: User can open Wedding page
Given I open Main page
When I expand Portfolio dropdown
And I click on Wedding page
Then I see Wedding page URL

Scenario: User can browse through images in viewer
Given I open Wedding page
When I click on image tile with index 0
Then I see same image after browsing trough all images in viewer



