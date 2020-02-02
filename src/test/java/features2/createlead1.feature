Feature: CreateLead1 for Leaftaps Application

Background:
Given Launch the Browser1
And Load the URL1
And Maximise the Browser1
And Set the Timeouts1

Scenario Outline: TC001_Positive_CreateLead_Flow

And Enter Username as Demosalesmanager1
And Enter Password as crmsfa1
When Click on the Login Button1
Given Click CRMSFA Link1
And Click on the Leads Tab1
And Click on the Create Lead Menu1
And Enter the Company Name as <cname>
And Enter the First Name as <fname>
And Enter the Last Name as <lname>
When Click on the Create Lead Button1
Then Verify Lead Creation is success1
Then Close Browser1

Examples:
|cname|fname|lname|
|Testleaf|Balaji|C|
|Testleaf|Hari|R|