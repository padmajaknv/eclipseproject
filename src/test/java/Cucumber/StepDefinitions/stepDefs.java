package Cucumber.StepDefinitions;

import Cucumber.Functions.commons;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepDefs extends commons {
    @Given("the user opens the application")
    public void openApp(){
        System.out.println("the user opens the application");
    }

    @When("the user enters the credentials")
    public void typeCreds(){
        System.out.println("the user enters the credentials");
    }

    @And("the user clicks on login button")
    public void clickLogin(){
        System.out.println("the user clicks on login button");
    }

    @And("the user must be able to login")
    public void verifyLogin(){
        System.out.println("the user must be able to login");
    }

    @But("the user does not click on login button")
    public void incorrectLogin(){
        System.out.println("the user doesnot click on login button");
    }

    @Before
    public void beforeHook(){
        System.out.println("Before Scenario");
    }

    @After
    public void afterHook(){
        System.out.println("After Scenario");
    }

//    @BeforeStep
//    public void beforeStep(){
//        System.out.println("Before every step");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("After every step");
//    }

    @Given("open the chrome driver")
    public void callDriver() throws Exception{
        commons cm = new commons();
        cm.openDriver();
    }
}
