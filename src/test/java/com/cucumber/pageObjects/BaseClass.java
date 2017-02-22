package com.cucumber.pageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by pratik on 15/01/17.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */

@SuppressWarnings("ALL")
abstract class BaseClass {

    private static WebDriver driver;
    private static boolean bResult;

    BaseClass(WebDriver driver){
        BaseClass.driver = driver;
        BaseClass.bResult = true;
    }
}