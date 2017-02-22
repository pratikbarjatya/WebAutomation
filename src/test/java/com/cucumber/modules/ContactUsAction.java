package com.cucumber.modules;


import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.cucumber.pageObjects.AutomationHomePage;
import com.cucumber.pageObjects.ContactUs;

/**
 * Created by pratik on 15/01/17.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
public class ContactUsAction {

    public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{

        AutomationHomePage.contact_us.click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(10,0)");
        ContactUs.email.sendKeys((String)map.get(0).get("email"));
        ContactUs.message.sendKeys(map.get(0).get("message"));
        ContactUs.submit.click();
        Assert.assertTrue(ContactUs.error_message.getText().contains("There is 1 error"));
    }
}
