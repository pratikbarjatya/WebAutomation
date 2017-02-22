package com.cucumber.stepdefinitions;

import com.cucumber.helpers.DataHelper;
import com.cucumber.listener.ExtentCucumberFormatter;

import com.cucumber.modules.SearchAction;
import com.cucumber.pageObjects.AutomationHomePage;
import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

/**
 * Created by pratik on 15/01/17.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
public class SearchSteps {
    private final WebDriver driver;
    private final List<HashMap<String,String>> datamap;


    public SearchSteps()
    {
        driver = Hooks.driver;
        datamap = DataHelper.data();
    }

    @Given("^I am on hotstar application$")
    public void iAmOnHotstarApplication() throws Throwable {
        driver.get("http://hotstar.com");
        ExtentCucumberFormatter.setTestRunnerOutput("STEP: Hotstar Web Application launched - Success");
//        throw new PendingException();
    }

    @When("^I search with searchKey$")
    public void iSearchWithSearchKey() throws Throwable {
        PageFactory.initElements(driver, AutomationHomePage.class);
        SearchAction.Execute(driver,datamap);
        ExtentCucumberFormatter.setTestRunnerOutput("STEP: I search with $searchKey - Success");
//        throw new PendingException();
    }

    @Then("^I should see the searchKey in search result$")
    public void iShouldSeeTheSearchKeyInSearchResult() throws Throwable {
        PageFactory.initElements(driver, AutomationHomePage.class);
        SearchAction.VerifySearchResult(driver,datamap);
        ExtentCucumberFormatter.setTestRunnerOutput("STEP: I see the $searchKey in search results drop down - Success");
        SearchAction.VerifyShowMoreResults();
        ExtentCucumberFormatter.setTestRunnerOutput("STEP:I see show more results button in search results - Success");
//        throw new PendingException();
    }
}
