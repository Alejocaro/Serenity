package test.certificationlogin.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.conditions.Check;
import test.certificationlogin.tasks.LoginFailed;
import test.certificationlogin.userinterfaces.HomePageUnitTest;
import test.certificationlogin.userinterfaces.LoginPageUtest;
import test.certificationlogin.utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static test.certificationlogin.tasks.LoginFailed.LoginFail;
import static test.certificationlogin.tasks.LoginUser.LoginUser;
import static test.certificationlogin.utils.ConstanManage.ConstanManage.ACTOR;
import static test.certificationlogin.utils.ConstanManage.ConstanManage.URL;

public class TestLoginStepDefinition {

    @Before
    public void SetUp(){ OnStage.setTheStage(new OnlineCast());}
    @Given("I othen home page")
    public void i_othen_home_page() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));

    }

    @When("I type the user and password")
    public void i_type_the_user_and_password() { theActorCalled(ACTOR).wasAbleTo(LoginUser());

    }
    @Then("I can see the home init page")
   public void i_can_see_the_home_init_page() { theActorCalled(ACTOR);

   }

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));
    }
    @When("I enter the correct username but an incorrect password")
    public void iEnterTheCorrectUsernameButAnIncorrectPassword() { theActorCalled(ACTOR).wasAbleTo(LoginFail());

    }
    @Then("I should see an error message indicating the login has failed")
    public void iShouldSeeAnErrorMessageIndicatingTheLoginHasFailed() {

    }

    }

