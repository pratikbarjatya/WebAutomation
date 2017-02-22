package com.cucumber.modules;

import org.openqa.selenium.WebDriver;
import com.cucumber.pageObjects.AutomationHomePage;
import java.util.HashMap;
import java.util.List;
import static com.cucumber.listener.ExtentCucumberFormatter.*;

/**
 * Created by pratik on 15/01/17.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
public class SignoutAction {
    public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
        AutomationHomePage.profile_pic.click();
        setTestRunnerOutput("Click on Profile Avtaar");
        AutomationHomePage.sign_out.click();
        setTestRunnerOutput("Sign Out Button is clicked");
    }
}
