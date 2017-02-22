package com.cucumber.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by Pratik Barjatiya on 12/02/16.
 * @author Pratik Barjatiya
 * @version 1.0.0
 */
@SuppressWarnings("ALL")
public class MyStepdefs {

    @Given("I have (\\d+) cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        System.out.format("Cukes: %n\n", cukes);
//        Assert.assertTrue(false);
    }

    @Given("I have (\\d+) cukes in my bellies")
    public void I_have_cukes_in_my_bellies(int cukes) {
        System.out.format("Cukes: %n\n", cukes);
    }

    @Then("^I print$")
    public void iPrint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
