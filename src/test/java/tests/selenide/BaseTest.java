package tests.selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {

    public void setUp(){
        WebDriverManager.edgedriver().setup();
        Configuration.browser = "edge";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }

    @BeforeTest
    public void init(){
        setUp();
    }

    @AfterTest
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
