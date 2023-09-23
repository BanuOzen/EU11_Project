package com.cydeo.step_definitions;

import com.cydeo.pages.hrPages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import com.github.javafaker.Options;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Locale;
import java.util.TimeZone;

public class hrUsers_step_definitions {

    hrPages hrPages = new hrPages();
    Faker faker = new Faker();

    String email;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("new round");
    }
    @When("User enters username {string}")
    public void user_enters_username(String string) {
        BrowserUtils.waitFor(2);
        hrPages.userName.click();
        hrPages.userName.sendKeys(string);
    }
    @When("User enters password {string}")
    public void user_enters_password_user_user(String string) {
        hrPages.password.sendKeys(string);
    }
    @When("User clicks login button")
    public void user_clicks_login_button() {
        hrPages.loginButton.click();
    }
    @When("User clicks Edit own profile")
    public void user_clicks_edit_own_profile() {
        hrPages.editOwnProfile.click();


    }
    @Then("User log out")
    public void user_log_out() {
        hrPages.logOut.click();

    }

    @When("User clicks My Profile")
    public void user_clicks_my_profile() {
        hrPages.myProfile.click();
    }
    @When("User see the Contact information")
    public void user_see_the_contact_information() {
        hrPages.contactInformation.isDisplayed();
    }

    @When("User clicks Edit Profile Settings")
    public void user_clicks_edit_profile_settings() {
        hrPages.EditProfileSetting.click();
    }
    @When("User changes E-Mail")
    public void user_changes_e_mail() {
        hrPages.email.click();
        hrPages.email.clear();
        email = faker.internet().emailAddress();
        hrPages.email.sendKeys(email);
        BrowserUtils.waitFor(1);

    }
    @When("User changes First Name")
    public void user_changes_first_name() {
        hrPages.firstName.click();
        hrPages.firstName.clear();
        String FFirstName = faker.name().firstName();
        hrPages.firstName.sendKeys(FFirstName);
        BrowserUtils.waitFor(1);
    }
    @When("User changes Last Name")
    public void user_changes_last_name() {
        hrPages.lastName.click();
        hrPages.lastName.clear();
        String FLastName = faker.name().lastName();
        hrPages.lastName.sendKeys(FLastName);
        BrowserUtils.waitFor(1);
    }
    @When("User changes Phone")
    public void user_changes_phone() {
        hrPages.phone.click();
        hrPages.phone.clear();
        String FPhone = faker.numerify("0###-###-####");
        hrPages.phone.sendKeys(FPhone);
    }
    @When("User changes Mobile")
    public void user_changes_mobile() {
        hrPages.mobile.click();
        hrPages.mobile.clear();
        String FMobile = faker.numerify("0###-###-####");
        hrPages.mobile.sendKeys(FMobile);
    }
    @When("User changes Work Phone")
    public void user_changes_work_phone() {
        hrPages.WorkPhone.click();
        hrPages.WorkPhone.clear();
        String FWorkPhone = faker.numerify("0###-###-####");
        hrPages.WorkPhone.sendKeys(FWorkPhone);
    }
    @When("User changes Auto Time Zone")
    public void user_changes_auto_time_zone() {
        hrPages.TimeZone.click();
        hrPages.TimeZone.isSelected();
        Select select = new Select(hrPages.TimeZone);
        select.getOptions().get(1);


    }
    @When("User changes Web Site")
    public void user_changes_web_site() {
        hrPages.webSite.click();
        hrPages.webSite.clear();
        String FWebSite = faker.internet().safeEmailAddress();
        hrPages.webSite.sendKeys(FWebSite);
    }
    @When("User changes City")
    public void user_changes_city() {
        hrPages.city.click();
        hrPages.city.clear();
        String FCity = faker.address().city();
        hrPages.city.sendKeys(FCity);
    }
    @When("User changes Gender")
    public void user_changes_gender() {
        hrPages.femaleGender.click();
        BrowserUtils.waitFor(1);
    }
    @When("User changes Date Of Birth")
    public void user_changes_date_of_birth() {
        hrPages.months.click();
        Select select = new Select(hrPages.months);
        select.selectByIndex(faker.number().numberBetween(0,11));
        BrowserUtils.waitFor(1);

        hrPages.days.click();
        Select select1 = new Select(hrPages.days);
        select1.selectByIndex(faker.number().numberBetween(0,31));
        BrowserUtils.waitFor(1);

        hrPages.year.click();
        hrPages.year.clear();
        String FYear = faker.numerify("####");
        hrPages.year.sendKeys(FYear);
        BrowserUtils.waitFor(1);

    }
    @When("User changes LinkedIn")
    public void user_changes_linked_in() {
        hrPages.LinkedIn.click();
        hrPages.LinkedIn.clear();
        String FLinkedIN = faker.internet().domainName();
        hrPages.LinkedIn.sendKeys(FLinkedIN);

    }
    @When("User changes Zip")
    public void user_changes_zip() {
        hrPages.zipCode.click();
        hrPages.zipCode.clear();
        String FZipCode = faker.address().zipCode();
        hrPages.zipCode.sendKeys(FZipCode);
    }
    @When("User saves the edit profile setting")
    public void user_saves_the_edit_profile_setting() {
        hrPages.saveButton.click();
    }
    @When("User sees again Contact Information")
    public void user_sees_again_contact_information() {
        hrPages.AfterSaveContactInformation.isDisplayed();

    }

    @When("user checks the saved setting")
    public void user_checks_the_saved_setting() {

       String actualTitle = hrPages.savedSetting.getText();
       BrowserUtils.waitFor(1);
       String expectedTitle = email;

       Assert.assertEquals(expectedTitle, actualTitle);

    }





}
