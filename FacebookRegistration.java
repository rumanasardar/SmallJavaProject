package smallproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.awt.*;

public class FacebookRegistration {
    public static void main(String[] args) throws AWTException {
       EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("rumanasardar3@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("ruman#18");
        driver.findElement(By.id("u_0_5_us")).click();

    }
}
