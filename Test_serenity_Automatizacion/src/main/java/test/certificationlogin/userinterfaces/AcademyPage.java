package test.certificationlogin.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AcademyPage {
    public static final net.serenitybdd.screenplay.targets.Target BTN_ACADEMY = Target.the("Academy").located(By.xpath("//div[@class='nav-sidebar-item__text'][contains(.,'Academy')]"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_TAKECOURSE = Target.the("TakeCourse").located(By.xpath("/html/body/ui-view/div/div/div/ui-view/academy-home/main/div/div[2]/div/div[2]/course-track-card/div/div[4]/a"));

}
