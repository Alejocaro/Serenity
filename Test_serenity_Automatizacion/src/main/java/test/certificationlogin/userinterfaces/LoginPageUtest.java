package test.certificationlogin.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageUtest {
    public static final net.serenitybdd.screenplay.targets.Target TXT_EMAIL = Target.the("TXTCorreo").located(By.xpath("//input[@id='username']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PASSWORD = Target.the("TXTPassword").located(By.xpath("//input[@id='password']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_SINGIN = Target.the("Sing in").located(By.xpath("//button"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_FAIL = Target.the("Invalid username or password.").located(By.xpath("//span[contains(@class, 'e')]"));
}

