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
public class AutomationHomePage extends BaseClass{

    public AutomationHomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[contains(.,'Sign In')]")
    public static WebElement sign_in;

    @FindBy(how=How.LINK_TEXT, using="Contact us")
    public static WebElement contact_us;

    @FindBy(id = "user-pic")
    public static WebElement profile_pic;

    @FindBy(xpath = "//*[@id='autoSearchBox']//li/a[contains(.,'My Account')]")
    public static WebElement my_account;

    @FindBy(xpath = "//*[@id='autoSearchBox']//li/a[contains(.,'Sign Out')]")
    public static WebElement sign_out;

    @FindBy(xpath = "//button[contains(.,'SEARCH')]")
    public static WebElement search_button;

    @FindBy(xpath = "//*[@id='autoCompleteSearchId']")
    public static WebElement search_span;

    @FindBy(xpath = "//*[@id='autoSearchBox']/li[1]/button")
    public static WebElement search_CTA;

    @FindBy(id = "autoSearchBoxCards")
    public static WebElement search_cards;

    @FindBy(xpath = "//*[@id='autoSearchBoxCards']/div/div[1]//div/h3")
    public static WebElement search_cards_meta_data_one;

    @FindBy(xpath = "//*[@id='autoSearchBoxCards']/div/div[2]//div/h3")
    public static WebElement search_cards_meta_data_two;

    @FindBy(xpath = "//*[@id='autoSearchBoxCards']/div/div[3]//div/h3")
    public static WebElement search_cards_meta_data_three;

    @FindBy(xpath = "//*[@id='autoSearchBoxCards']/div/div[4]//div/h3")
    public static WebElement search_cards_meta_data_four;

    @FindBy(xpath = "//*[@id='autoSearchBoxCards']/div/div[5]//div/h3")
    public static WebElement search_cards_meta_data_five;

    @FindBy(xpath = "//*[@id='autoSearchBoxCards']/p[2]")
    public static WebElement show_more_cta;
}