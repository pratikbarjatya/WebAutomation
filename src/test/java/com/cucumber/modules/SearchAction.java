package com.cucumber.modules;

import com.cucumber.pageObjects.AutomationHomePage;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.List;

import static com.cucumber.listener.ExtentCucumberFormatter.setTestRunnerOutput;

/**
 * Created by pratik on 15/01/17.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
public class SearchAction {
    public static void Execute(WebDriver driver, List<HashMap<String,String>> map) throws Exception{
        AutomationHomePage.search_button.click();
        setTestRunnerOutput("Click action is performed on Search link" );
        AutomationHomePage.search_button.sendKeys(map.get(0).get("searchKey"));
        Thread.sleep(3000);
        setTestRunnerOutput("Search Key is entered in Search field" );
    }

    public static void VerifySearchResult(WebDriver driver, List<HashMap<String,String>> map) throws Exception{
        AutomationHomePage.search_cards.isDisplayed();
        setTestRunnerOutput("Search Cards are displayed" );
        AutomationHomePage.search_cards_meta_data_one.getText().matches(map.get(0).get("searchKey"));
        AutomationHomePage.search_cards_meta_data_two.getText().matches(map.get(0).get("searchKey"));
        AutomationHomePage.search_cards_meta_data_three.getText().matches(map.get(0).get("searchKey"));
        AutomationHomePage.search_cards_meta_data_four.getText().matches(map.get(0).get("searchKey"));
        AutomationHomePage.search_cards_meta_data_five.getText().matches(map.get(0).get("searchKey"));
        setTestRunnerOutput("Search Cards matched the search key meta data "+ AutomationHomePage.search_cards_meta_data_one.getText() +" "+ AutomationHomePage.search_cards_meta_data_five.getText());
    }

    public static void VerifyShowMoreResults() throws Exception{
        AutomationHomePage.show_more_cta.isDisplayed();
        setTestRunnerOutput("Show More Results CTA is displayed" );
    }
}
