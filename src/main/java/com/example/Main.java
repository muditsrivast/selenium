package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.junit.*;

public class Main {    
        public  static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91790\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/pricing");
        List<WebElement> elements = driver.findElements(By.cssSelector("#live-plans > div.row.pricing-tables.pricing-tables-sidenav.pricing-v3.no-pad > div"));
        for (WebElement element : elements) {
            String planName = element.findElement(By.cssSelector("div.plan-name")).getText();
            List<WebElement> planPriceDetailsElements = element.findElements(By.cssSelector("div.plan-price-details > span"));
            if (!planPriceDetailsElements.isEmpty()) {
                String planValue = planPriceDetailsElements.get(0).getText();
                if(!planName.isEmpty() || !planValue.isEmpty())
                {
                     System.out.println("Plan Name: " + planName);
                     System.out.println("Plan Value: "+planValue);                                                       
                }
            } 
            else 
            {   
                if(!planName.isEmpty() )
                {
                System.out.println("Plan Name: " + planName);
                System.out.println("Plan Value: N/A");
                }
            }
        }
        driver.quit();
      
    }
}