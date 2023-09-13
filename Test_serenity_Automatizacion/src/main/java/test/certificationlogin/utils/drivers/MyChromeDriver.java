package test.certificationlogin.utils.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriver {

    public static WebDriver chromeDriver = null;

    public static MyChromeDriver chromeHisBrowserWeb() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        //options.addArguments("--window-size=1920,1080");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        options.addArguments("--remote-allow-origins=*");

        chromeDriver = new ChromeDriver(options);
        return new MyChromeDriver();
    }

    public WebDriver onTheUrl(String url){
        chromeDriver.get(url);
        return chromeDriver;
}
}
