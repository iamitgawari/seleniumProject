package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class amazonAutomation  {


    @Test
    public void testBrowser() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.com");
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("TV");
        driver.findElement(By.id("nav-search-submit-button")).click();



        driver.quit();
    }
}