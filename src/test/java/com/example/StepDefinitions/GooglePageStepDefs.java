package com.example.StepDefinitions;

import com.example.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.example.page.GooglePage.*;

public class GooglePageStepDefs extends BaseClass {
    @Before
    public void setup() {
        setDriver();
    }

    @After
    public void tearDown() throws InterruptedException {
        closeDriver();
    }
    @Given("user open google page")
    public void userOpenGooglePage() throws InterruptedException {
        navigateToHome();
    }


    @When("user input keyword {string} on google page")
    public void userInputKeywordOnGooglePage(String keyword) {
        inputKeyword(keyword);
    }

    @And("user click button google search")
    public void userClickButtonGoogleSearch() {
        clickBtnSearch();
    }

    @Then("user see description {string}")
    public void userSeeDescription(String keywordResult) {
        Assert.assertEquals("Keyword is not same", keywordResult, getKeywordDesc());
    }
}
