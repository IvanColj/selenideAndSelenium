package tests.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne extends BaseTest {

    @Test
    public void checkTemperature() {
        String temperature = "+12";
        MainPage mainPage = new MainPage();
        String test = mainPage.createTemp();
        Assert.assertEquals(test, temperature);
    }
}
