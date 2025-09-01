package Cucumber.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefs2 {
    @When("the user enters username as {string}")
    public void username(String username){
        System.out.println("Username: "+username);
    }

    @And("user enters (.*) as email")
    public void regEx(String text){
        System.out.println(text);
    }

    @When("the user enters password as {string}")
    public void password(String password){
        System.out.println("Password: "+password);
    }

    @Then("the user will see the score as {int} for {float}")
    public void score(int x, float y){
        System.out.println("% is: "+((x/y)*100));
    }
}
