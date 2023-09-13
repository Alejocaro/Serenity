package test.certificationlogin.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import test.certificationlogin.userinterfaces.AcademyPage;
import test.certificationlogin.userinterfaces.HomePageUnitTest;

public class AcademyCourse implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(AcademyPage.BTN_ACADEMY.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(AcademyPage.BTN_ACADEMY)
                ));
        actor.attemptsTo(
                Click.on(AcademyPage.BTN_TAKECOURSE)
        );
    }
    public static Performable Academycourse(){
        return Tasks.instrumented(AcademyCourse.class);
    }

}
