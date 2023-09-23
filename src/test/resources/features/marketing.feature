Feature: My Profile
  User Story: User can edit own Profile
  User can see the Contact Information in own Profile
  User can see updated personal information after user edits own personal information

 @EditProfileMarketing
  Scenario Outline: User can edit own profile
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


  @ContactInformationMarketing
  Scenario Outline: User can see the Contact Information in own Profile
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

  @UpdateInformationMarketing
  Scenario Outline: User can see updated personal information after user edits own personal information
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
