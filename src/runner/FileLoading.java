package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileLoading {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ajayj\\eclipse-workspace\\Voltas\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/elements");

        driver.manage().window().maximize();

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Upload and Download')]"));

        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
        element.click();

        WebElement download = driver.findElement(By.xpath("//a[@id='downloadButton']"));
        WebElement upload = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        Thread.sleep(2000);
        download.click();
        Thread.sleep(2000);
        upload.sendKeys("C:\\Users\\ajayj\\Documents\\Java.txt");

    }
}
