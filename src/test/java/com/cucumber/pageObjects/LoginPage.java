package com.cucumber.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by pratik on 15/01/17.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
public class LoginPage extends BaseClass{

    public LoginPage(WebDriver driver){
        super(driver);
    }


    @FindBy(id = "emailaddress")
    public static WebElement email;

    @FindBy(id = "userPwd")
    public static WebElement password;

    @FindBy(xpath = "//*[@id='signinForm']//div/button")
    public static WebElement sign_in_button;


    @FindBy(how=How.ID, using="email_create")
    public static WebElement email_create;

    @FindBy(how=How.ID, using="SubmitCreate")
    public static WebElement submit_create;



}