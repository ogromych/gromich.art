Meta:

Narrative:
This story covers all test of contact page

Scenario: User sends message via contact form
Given I open contact page
When I set name "Alex"
And I set email "test@test.com"
And I set text "This is automation baby!"
And I submit form
Then I see sending confirmation

Scenario: User tries to send message with blank form fields
Given I open contact page
When I submit form
Then I see name error
Then I see email error
Then I see sending error


