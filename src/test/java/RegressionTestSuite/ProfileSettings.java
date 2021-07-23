package RegressionTestSuite;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ProfileSettings {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testProfileSettings() throws Exception {
        driver.get("https://ru.wikipedia.org/w/index.php?title=%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%94%D0%BE%D0%BC%D0%B0%D1%88%D0%BD%D1%8F%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0&source=personaltoolslink&namespace=-1");
        driver.findElement(By.linkText("Test97432")).click();
        driver.findElement(By.linkText("Настройки")).click();
        driver.findElement(By.xpath("//div[@id='ooui-php-401']/span")).click();
        driver.findElement(By.xpath("//div[@id='ooui-php-402']/span")).click();
        driver.findElement(By.xpath("//div[@id='ooui-php-403']/span")).click();
        driver.findElement(By.xpath("//div[@id='ooui-php-404']/span")).click();
        driver.findElement(By.xpath("//div[@id='ooui-php-405']/span")).click();
        driver.findElement(By.xpath("//div[@id='ooui-php-406']/span")).click();
        driver.findElement(By.xpath("//div[@id='ooui-php-407']/span")).click();
        driver.findElement(By.xpath("//div[@id='ooui-php-408']/span")).click();
        driver.findElement(By.xpath("//div[@id='ooui-php-409']/span")).click();
        driver.findElement(By.xpath("//div[@id='ooui-php-410']/span")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
