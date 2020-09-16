package runner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Casting {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ajayj\\eclipse-workspace\\Voltas\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/elements");

        driver.manage().window().maximize();

    /*    TakesScreenshot scrShot = ((TakesScreenshot) driver);

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile=new File("C:\\Users\\ajayj\\eclipse-workspace\\Voltas\\Screenshots\\toolsqa.png");

        FileUtils.copyFile(SrcFile, DestFile);*/

        WebElement radioButton = driver.findElement(By.xpath("//span[contains(text(),'Radio Button')]"));

        // radioButton.click(); // selenium server

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        javascriptExecutor.executeScript("arguments[0].click();", radioButton); // browser executes it

        //    javascriptExecutor.executeScript("window.scrollTo(0, 500);");

        WebElement bookStore = driver.findElement(By.xpath("//div[contains(text(),'Book Store Application')]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", bookStore);

       /* WebElement textBox = driver.findElement(By.xpath(""));
        javascriptExecutor.executeScript("arguments[0].value='ajay';", textBox);*/

        String pageTitle = javascriptExecutor.executeScript("return document.title;").toString();

        System.out.println("Page title: " + pageTitle);

    }
}
