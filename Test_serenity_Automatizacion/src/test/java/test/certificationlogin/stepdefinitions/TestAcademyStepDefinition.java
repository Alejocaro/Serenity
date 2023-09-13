package test.certificationlogin.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import test.certificationlogin.utils.drivers.MyChromeDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static test.certificationlogin.tasks.AcademyCourse.Academycourse;
import static test.certificationlogin.tasks.LoginUser.LoginUser;
import static test.certificationlogin.utils.ConstanManage.ConstanManage.ACTOR;
import static test.certificationlogin.utils.ConstanManage.ConstanManage.URL;

public class TestAcademyStepDefinition {
    @Before
    public void SetUp(){ OnStage.setTheStage(new OnlineCast());}

    @Given("I am on the main home page")
    public void iAmOnTheMainHomePage() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));


    }
    @When("I click on the academy button")
    public void iClickOnTheAcademyButton() {
        theActorCalled(ACTOR).wasAbleTo(LoginUser());
        theActorCalled(ACTOR).wasAbleTo(Academycourse());


    }
    @Then("I select a course from the same page using the take course button")
    public void iSelectACourseFromTheSamePageUsingTheTakeCourseButton() {

    }
}
