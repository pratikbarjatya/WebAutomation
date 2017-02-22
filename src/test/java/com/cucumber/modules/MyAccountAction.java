package com.cucumber.modules;

import com.cucumber.pageObjects.AutomationHomePage;
import com.cucumber.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import java.util.List;
import static com.cucumber.listener.ExtentCucumberFormatter.*;

/**
 * Created by pratik on 15/01/17.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
class MyAccountAction {
    public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
        AutomationHomePage.my_account.click();
        setTestRunnerOutput("Click action is perfromed on My Account link");
        LoginPage.email.sendKeys(map.get(0).get("username"));
        setTestRunnerOutput("username is entered in UserName text box" );
        LoginPage.password.sendKeys(map.get(0).get("password"));
        setTestRunnerOutput("password is entered in Password text box" );
        LoginPage.sign_in_button.click();
        setTestRunnerOutput("SignIn Action is successfully performed");
    }
}
