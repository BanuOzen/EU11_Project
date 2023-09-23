@SCRUM-1262
Feature: Default

	#hr users can edit own profile
	@SCRUM-1253
	Scenario Outline: Hr User can edit own Profile
		  Given User is on login page
		  When User enters username "<username>"
		  When  User enters password "<password>"
		  When User clicks login button
		  When User clicks Edit own profile
		  Then User log out
		
		  Examples: hr users
		    | username                | password |
		    | hr1@cybertekschool.com  | UserUser |
		    | hr10@cybertekschool.com | UserUser |
		    | hr20@cybertekschool.com | UserUser |
		    | hr30@cybertekschool.com | UserUser |
		    | hr40@cybertekschool.com | UserUser |	

	#hr users can see the Contact Information in own Profile
	@SCRUM-1254
	Scenario Outline: hr User can see the Contact Information in own Profile
		  Given User is on login page
		  When User enters username "<username>"
		  When User enters password "<password>"
		  When User clicks login button
		  When User clicks Edit own profile
		  When User clicks My Profile
		  When User see the Contact information
		  When User clicks Edit own profile
		  Then User log out
		
		
		  Examples: hr users
		    | username                | password |
		    | hr1@cybertekschool.com  | UserUser |
		    | hr10@cybertekschool.com | UserUser |
		    | hr20@cybertekschool.com | UserUser |
		    | hr30@cybertekschool.com | UserUser |
		    | hr40@cybertekschool.com | UserUser |	

	#hr users can see updated personal information after user edits own personal information
	@SCRUM-1255
	Scenario Outline: hr User can see updated personal information after user edits own personal information
		  Given User is on login page
		  When User enters username "<username>"
		  When User enters password "<password>"
		  When User clicks login button
		  When User clicks Edit own profile
		  When User clicks Edit Profile Settings
		  When User changes E-Mail
		  When User changes First Name
		  When User changes Last Name
		  When User changes Phone
		  When User changes Mobile
		  When User changes Work Phone
		  When User changes Auto Time Zone
		  When User changes Web Site
		  When User changes City
		  When User changes Gender
		  When User changes Date Of Birth
		  When User changes LinkedIn
		  When User changes Zip
		  When User saves the edit profile setting
		  When User sees again Contact Information
		  When user checks the saved setting
		  When User clicks Edit own profile
		  Then User log out
		
		  Examples: Hr users
		    | username                | password |
		    | hr1@cybertekschool.com  | UserUser |
		    | hr10@cybertekschool.com | UserUser |
		    | hr20@cybertekschool.com | UserUser |
		    | hr30@cybertekschool.com | UserUser |
		    | hr40@cybertekschool.com  | UserUser |	

	#helpdesk users can edit own Profile
	@SCRUM-1256
	Scenario Outline: helpdesk users can edit own Profile
		    Given User is on login page
		    When User enters username "<username>"
		    When  User enters password "<password>"
		    When User clicks login button
		    When User clicks Edit own profile
		    Then User log out
		
		    Examples: helpdesk users
		      | username                      | password |
		      | helpdesk1@cybertekschool.com  | UserUser |
		      | helpdesk10@cybertekschool.com | UserUser |
		      | helpdesk20@cybertekschool.com | UserUser |
		      | helpdesk30@cybertekschool.com | UserUser |
		      | helpdesk40@cybertekschool.com | UserUser |	

	#helpdesk users can see the Contact Information in own Profile
	@SCRUM-1257
	Scenario Outline: helpdesk Users can see the Contact Information in own Profile
		    Given User is on login page
		    When User enters username "<username>"
		    When User enters password "<password>"
		    When User clicks login button
		    When User clicks Edit own profile
		    When User clicks My Profile
		    When User see the Contact information
		    When User clicks Edit own profile
		    Then User log out
		
		    Examples: helpdesk users
		      | username                      | password |
		      | helpdesk1@cybertekschool.com  | UserUser |
		      | helpdesk10@cybertekschool.com | UserUser |
		      | helpdesk20@cybertekschool.com | UserUser |
		      | helpdesk30@cybertekschool.com | UserUser |
		      | helpdesk40@cybertekschool.com | UserUser |	

	#User can see updated personal information after user edits own personal information
	@SCRUM-1258
	Scenario Outline: helpdesk users can see updated personal information after user edits own personal information
		    Given User is on login page
		    When User enters username "<username>"
		    When User enters password "<password>"
		    When User clicks login button
		    When User clicks Edit own profile
		    When User clicks Edit Profile Settings
		    When User changes E-Mail
		    When User changes First Name
		    When User changes Last Name
		    When User changes Phone
		    When User changes Mobile
		    When User changes Work Phone
		    When User changes Auto Time Zone
		    When User changes Web Site
		    When User changes City
		    When User changes Gender
		    When User changes Date Of Birth
		    When User changes LinkedIn
		    When User changes Zip
		    When User saves the edit profile setting
		    When User sees again Contact Information
		    When user checks the saved setting
		    When User clicks Edit own profile
		    Then User log out
		
		  Examples: helpdesk users
		    | username                      | password |
		    | helpdesk1@cybertekschool.com  | UserUser |
		    | helpdesk10@cybertekschool.com | UserUser |
		    | helpdesk20@cybertekschool.com | UserUser |
		    | helpdesk30@cybertekschool.com | UserUser |
		    | helpdesk40@cybertekschool.com  | UserUser |	

	#marketing users can edit own Profile
	@SCRUM-1259
	Scenario Outline: marketing users can edit own Profile
		    Given User is on login page
		    When User enters username "<username>"
		    When  User enters password "<password>"
		    When User clicks login button
		    When User clicks Edit own profile
		    Then User log out
		
		  Examples: marketing users
		    | username                      | password |
		    | marketing1@cybertekschool.com | UserUser |
		    | marketing2@cybertekschool.com | UserUser |
		    | marketing3@cybertekschool.com | UserUser |
		    | marketing4@cybertekschool.com | UserUser |
		    | marketing5@cybertekschool.com | UserUser |	

	#marketing users can see the Contact Information in own Profile
	@SCRUM-1260
	Scenario Outline: marketing users can see the Contact Information in own Profile
		    Given User is on login page
		    When User enters username "<username>"
		    When User enters password "<password>"
		    When User clicks login button
		    When User clicks Edit own profile
		    When User clicks My Profile
		    When User see the Contact information
		    When User clicks Edit own profile
		    Then User log out
		
		
		    Examples: marketing users
		      | username                      | password |
		      | marketing1@cybertekschool.com | UserUser |
		      | marketing2@cybertekschool.com | UserUser |
		      | marketing3@cybertekschool.com | UserUser |
		      | marketing4@cybertekschool.com | UserUser |
		      | marketing5@cybertekschool.com | UserUser |	

	#marketing users can see updated personal information after user edits own personal information
	@SCRUM-1261
	Scenario Outline: marketing users can see updated personal information after user edits own personal information
		    Given User is on login page
		    When User enters username "<username>"
		    When User enters password "<password>"
		    When User clicks login button
		    When User clicks Edit own profile
		    When User clicks Edit Profile Settings
		    When User changes E-Mail
		    When User changes First Name
		    When User changes Last Name
		    When User changes Phone
		    When User changes Mobile
		    When User changes Work Phone
		    When User changes Auto Time Zone
		    When User changes Web Site
		    When User changes City
		    When User changes Gender
		    When User changes Date Of Birth
		    When User changes LinkedIn
		    When User changes Zip
		    When User saves the edit profile setting
		    When User sees again Contact Information
		    When user checks the saved setting
		    When User clicks Edit own profile
		    Then User log out
		
		    Examples: marketing users
		      | username                      | password |
		      | marketing1@cybertekschool.com | UserUser |
		      | marketing2@cybertekschool.com | UserUser |
		      | marketing3@cybertekschool.com | UserUser |
		      | marketing4@cybertekschool.com | UserUser |
		      | marketing5@cybertekschool.com | UserUser |