package com.cucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pratik on 15/01/17.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
public class AccountPage extends BaseClass{

    public AccountPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id='master-container-inner']//div[2]/p[2]")
    public static WebElement sign_in_acccount_details; //Signed in via email

    @FindBy(xpath = ".//*[@id='master-container-inner']//div/h4[contains(.,'MEMBERSHIP')]")
    public static WebElement membership;

    @FindBy(xpath = "//*[@id='master-container-inner']//div/h4[contains(.,'BILLING DETAILS')]")
    public static WebElement billing_details;

}