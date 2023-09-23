package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hrPages {

    public hrPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
///html/body/table/tbody/tr[1]/td/div[2]/div/div[4]
    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[2]/input")
    public WebElement loginButton;

    @FindBy(id = "user-block")
    public WebElement editOwnProfile;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]/span[2]")
    public WebElement logOut;

    @FindBy(xpath = "//*[@class='menu-popup-item-text']")
    public WebElement myProfile;

    @FindBy(xpath = "//*[@class='user-profile-block-title']")
    public WebElement contactInformation;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[2]/span[2]")
    public WebElement EditProfileSetting;

    @FindBy(xpath = "//*[@id=\"content-edit-form-1\"]/tbody/tr[5]/td[2]/input[1]")
    public WebElement email;

    @FindBy(xpath = "//input[@name='NAME']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='LAST_NAME']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@name='PERSONAL_PHONE']")
    public WebElement phone;

    @FindBy(xpath = "//*[@name='PERSONAL_MOBILE']")
    public WebElement mobile;

    @FindBy(xpath = "//*[@name='WORK_PHONE']")
    public WebElement WorkPhone;

    @FindBy(xpath = "//*[@class='content-edit-form-field-input-select']")
    public WebElement TimeZone;

    @FindBy(xpath = "//input[@name='PERSONAL_WWW']")
    public WebElement webSite;

    @FindBy(xpath = "//input[@name='PERSONAL_CITY']")
    public WebElement city;

    @FindBy(xpath = "//*[@value='M']")
    public WebElement maleGender;

    @FindBy(xpath = "//*[@value='F']")
    public WebElement femaleGender;

    @FindBy(xpath = "//*[@id='PERSONAL_BIRTHDAY_MONTH']")
    public WebElement months;

    @FindBy(xpath = "//*[@id='PERSONAL_BIRTHDAY_DAY']")
    public WebElement days;

    @FindBy(xpath = "//*[@id='PERSONAL_BIRTHDAY_YEAR']")
    public WebElement year;

    @FindBy(xpath = "//*[@name='UF_LINKEDIN']")
    public WebElement LinkedIn;

    @FindBy(xpath = "//*[@name='PERSONAL_ZIP']")
    public WebElement zipCode;


    @FindBy(xpath = "//*[@class='webform-button-text']")
    public WebElement saveButton;


    @FindBy(xpath = "//*[@class='user-profile-block-title']")
    public WebElement AfterSaveContactInformation;

    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[3]/table/tbody/tr[2]/td[2]/a")
    public WebElement savedSetting;
}
