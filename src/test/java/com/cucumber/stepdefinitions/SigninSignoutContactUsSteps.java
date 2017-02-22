package com.cucumber.stepdefinitions;

import com.cucumber.helpers.DataHelper;

import java.util.HashMap;
import java.util.List;

import com.cucumber.modules.ContactUsAction;
import com.cucumber.modules.SignInAction;
import com.cucumber.modules.SignoutAction;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.cucumber.pageObjects.AutomationHomePage;
import com.cucumber.pageObjects.ContactUs;
import com.cucumber.pageObjects.LoginPage;
import com.cucumber.pageObjects.AccountPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.cucumber.listener.ExtentCucumberFormatter;
import org.testng.Assert;

/**
 * Created by pratik on 15/01/17.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
public class SigninSignoutContactUsSteps {
    private final WebDriver driver;
    private final List<HashMap<String,String>> datamap;


    public SigninSignoutContactUsSteps()
    {
        driver = Hooks.driver;
        datamap = DataHelper.data();
    }

    @When("^I open hotstar website$")
    public void iOpenHotstarWebsite() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://hotstar.com");
        ExtentCucumberFormatter.setTestRunnerOutput("STEP: Hotstar Web Application launched - Success");
    }

    @When("^I sign in$")
    public void iSignIn() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, AutomationHomePage.class);
        PageFactory.initElements(driver, LoginPage.class);
        SignInAction.Execute(driver,datamap);
        Assert.assertEquals(true,AutomationHomePage.profile_pic.isDisplayed());
        ExtentCucumberFormatter.setTestRunnerOutput("STEP: Sign In - Success");

    }

    @Then("^I click on my account")
    public void iClickOnMyAccount() throws Exception{
        PageFactory.initElements(driver, AutomationHomePage.class);
        AutomationHomePage.profile_pic.click();
        AutomationHomePage.my_account.click();
        PageFactory.initElements(driver, AccountPage.class);
        Assert.assertEquals(true,AccountPage.billing_details.isDisplayed());
        ExtentCucumberFormatter.setTestRunnerOutput("STEP: My Account - Success");
    }

    @And("^I certify login")
    public void certifyLogin() throws Exception{
        PageFactory.initElements(driver,AccountPage.class);
        Assert.assertEquals(true,AccountPage.sign_in_acccount_details.getText().startsWith("Signed in"));
        ExtentCucumberFormatter.setTestRunnerOutput("STEP: Login Certify - Success");
    }

    @Then("^I sign out$")
    public void iSignOut() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, AutomationHomePage.class);
        PageFactory.initElements(driver, LoginPage.class);
        SignoutAction.Execute(driver,datamap);
        ExtentCucumberFormatter.setTestRunnerOutput("STEP: SignOut - Success");
    }

    @And("^I certify signout")
    public void iCertifySignout() throws Exception{
        PageFactory.initElements(driver, AutomationHomePage.class);
        Assert.assertEquals(true,AutomationHomePage.sign_in.isDisplayed());
        ExtentCucumberFormatter.setTestRunnerOutput("STEP: SignOut Certify - Success");
    }

    @Then("^I perform contact us actions$")
    public void iPerformContactUsActions() throws Exception {
        PageFactory.initElements(driver, AutomationHomePage.class);
        PageFactory.initElements(driver, ContactUs.class);
        ContactUsAction.Execute(driver,datamap);

    }
}
