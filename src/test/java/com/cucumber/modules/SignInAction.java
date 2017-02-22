package com.cucumber.modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import com.cucumber.pageObjects.*;
import static com.cucumber.listener.ExtentCucumberFormatter.*;

/**
 * Created by pratik on 15/01/17.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
public class SignInAction {
    public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
        AutomationHomePage.sign_in.click();
        setTestRunnerOutput("Click action is performed on My Account link" );
        LoginPage.email.sendKeys(map.get(0).get("username"));
        setTestRunnerOutput("username is entered in UserName text box" );
        LoginPage.password.sendKeys(map.get(0).get("password"));
        setTestRunnerOutput("password is entered in Password text box" );
        LoginPage.sign_in_button.click();
        setTestRunnerOutput("SignIn Action is successfully perfomred");
    }
}
