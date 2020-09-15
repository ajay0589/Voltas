package runner;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;


public class SeleniumPractice {
    WebDriver driver;

    public static void main(String[] args) throws Exception {
        SeleniumPractice obj = new SeleniumPractice();
        obj.testSelenium();
    }

    void testSelenium() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ajayj\\eclipse-workspace\\Voltas\\Drivers\\chromedriver.exe");

        //Customize your browser
        // chrome - chromeoptions
        // firefox - firefoxprofile
        DesiredCapabilities capabilities = new DesiredCapabilities(); // to run testcases on remote machine

        Map prefs = new HashMap();
        prefs.put("profile.default_content_settings.cookies", 2);
        ChromeOptions options = new ChromeOptions();
        //  options.setExperimentalOptions("prefs", prefs);

        driver = new ChromeDriver(options);

        driver.get("https://demoqa.com/elements"); // get

        String pageTitle = driver.getTitle(); // getTitle

        System.out.println("Page title:" + pageTitle);

        driver.manage().window().maximize();
        Point maxPoint = driver.manage().window().getPosition();
        int x = maxPoint.getX();
        int y = maxPoint.getY();
        System.out.println("X axis:" + x + " Y axis:" + y);

        Thread.sleep(2000);

       /* Point point = new Point(200, 200);

        driver.manage().window().setPosition(point);*/

      /*  Dimension dimension = new Dimension(300, 300);

        driver.manage().window().setSize(dimension);*/

       /* driver.findElement(By.className("btn btn-light active")).click();

        WebElement fullNameTextbox = driver.findElement(By.id("userName"));

        Dimension userNameCoordinates = fullNameTextbox.getSize();

        int userNameWidth = userNameCoordinates.getWidth();
        int userNameHeight = userNameCoordinates.getHeight();

        String namePlaceholder = fullNameTextbox.getAttribute("placeholder");
        System.out.println("Place holder is: " + namePlaceholder);*/

        driver.findElement(By.xpath("//span[contains(text(),'Check Box')]")).click();

        WebElement homeCheckbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[local-name()='svg']"));

        boolean homeFlag = homeCheckbox.isSelected();

        System.out.println("Home flag:" + homeFlag);

        boolean flag = retryingFindClick(homeCheckbox);
        //homeCheckbox.click();
       /* if (flag) {
            homeFlag = homeCheckbox.isSelected();
            System.out.println("Home flag:" + homeFlag);
        }*/


        //  driver.switchTo().window(""); // frame, window, alert




    }

    public boolean retryingFindClick(WebElement element) {
        boolean result = false;
        int attempts = 0;
        while (attempts < 2) {
            try {
                element.click();
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
            }
            attempts++;
        }
        return result;
    }

    void handleStaleElement() {

      /*  new WebDriverWait(driver, 10)
                .ignoring(StaleElementReferenceException.class)
                .until(new Predicate<WebDriver>() {
                    @Override
                    public boolean apply(@Nullable WebDriver driver) {
                        driver.findElement(By.id("checkoutLink")).click();
                        return true;
                    }
                });*/

    }


}
