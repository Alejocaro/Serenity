package test.certificationlogin.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import test.certificationlogin.userinterfaces.HomePageUnitTest;
import test.certificationlogin.userinterfaces.LoginPageUtest;

public class LoginUser implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HomePageUnitTest.BTN_LOGIN.resolveFor(actor).isVisible()).andIfSo(
                Click.on(HomePageUnitTest.BTN_LOGIN)
                        ),
                Enter.theValue("trappipeuddauje-8912@yopmail.com").into(LoginPageUtest.TXT_EMAIL),
                Enter.theValue("0123456789aA.*").into(LoginPageUtest.TXT_PASSWORD),
                Click.on(LoginPageUtest.BTN_SINGIN)
        );
    }
    public static Performable LoginUser(){
        return Tasks.instrumented(LoginUser.class);
    }

}