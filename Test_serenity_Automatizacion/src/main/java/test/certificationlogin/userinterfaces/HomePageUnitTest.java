    package test.certificationlogin.userinterfaces;

    import net.serenitybdd.core.pages.ResolvableElement;
    import net.serenitybdd.screenplay.targets.Target;
    import org.openqa.selenium.By;

    public class HomePageUnitTest {
        public static final net.serenitybdd.screenplay.targets.Target BTN_LOGIN = Target.the("login button").located(By.xpath("//a[@class='unauthenticated-nav-bar__link'][contains(.,'Log In')]"));

    }
