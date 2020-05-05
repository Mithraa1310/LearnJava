Feature: CreateLead for LeafTaps

Scenario: verify the creation of new lead

Given Launch the browser
And Load the url
And Set the timeouts
And Maximize the browser
And Enter the username
And Enter the password
And Click on the Login button
And Click CRM/SFA Link
And Click Leads
And Click createLead
And Enter Company Name
And Enter first Name
And Enter last Name
When clicking on Create Lead button
Then Verify view Lead is displayed
