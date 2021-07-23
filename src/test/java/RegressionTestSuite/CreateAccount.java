package RegressionTestSuite;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class CreateAccount {
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
    public void testCreateAccount() throws Exception {
        driver.get("https://ru.wikipedia.org/w/index.php?title=%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%A1%D0%BE%D0%B7%D0%B4%D0%B0%D1%82%D1%8C_%D1%83%D1%87%D1%91%D1%82%D0%BD%D1%83%D1%8E_%D0%B7%D0%B0%D0%BF%D0%B8%D1%81%D1%8C&returnto=%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F+%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        driver.findElement(By.linkText("Создать учётную запись")).click();
        driver.findElement(By.id("wpName2")).clear();
        driver.findElement(By.id("wpName2")).sendKeys("Test97432");
        driver.findElement(By.xpath("//form[@id='userlogin2']/div")).click();
        driver.findElement(By.xpath("//form[@id='userlogin2']/div")).click();
        driver.findElement(By.id("wpPassword2")).click();
        driver.findElement(By.xpath("//form[@id='userlogin2']/div/div[4]")).click();
        driver.findElement(By.id("wpPassword2")).click();
        driver.findElement(By.id("wpPassword2")).click();
        driver.findElement(By.id("wpRetype")).click();
        driver.findElement(By.xpath("//body")).click();
        driver.findElement(By.id("wpRetype")).click();
        driver.findElement(By.xpath("//form[@id='userlogin2']/div/div[3]/div/div")).click();
        driver.findElement(By.xpath("//form[@id='userlogin2']/div/div[3]/div")).click();
        driver.findElement(By.id("wpPassword2")).click();
        driver.findElement(By.xpath("//body")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//body | ]]
        driver.findElement(By.id("wpPassword2")).clear();
        driver.findElement(By.id("wpPassword2")).sendKeys("un_9.xRYhAWjpA6");
        driver.findElement(By.id("wpRetype")).clear();
        driver.findElement(By.id("wpRetype")).sendKeys("un_9.xRYhAWjpA6");
        driver.findElement(By.xpath("//form[@id='userlogin2']/div/div[6]/div")).click();
        driver.findElement(By.id("wpRetype")).click();
        driver.findElement(By.id("wpEmail")).click();
        driver.findElement(By.id("wpEmail")).click();
        driver.findElement(By.id("wpEmail")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=wpEmail | ]]
        driver.findElement(By.xpath("//body")).click();
        driver.findElement(By.id("mw-input-captchaWord")).click();
        driver.findElement(By.id("mw-input-captchaWord")).clear();
        driver.findElement(By.id("mw-input-captchaWord")).sendKeys("timexteams");
        driver.findElement(By.id("wpCreateaccount")).click();
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
