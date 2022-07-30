package com.Project.selenium.Compren;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://tide.com/en-us");
        driver.findElement(By.xpath("//a[contains(@class,'lilo3746-close-icon')]")).click();
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Shop Products"))).perform();
        driver.findElement(By.xpath("//a[contains(@data-action-detail,'Pacs')]")).click();
        //driver.navigate().back();
          //driver.manage
        //driver.get("https://tide.com/en-us");
        action.moveToElement(driver.findElement(By.linkText("Our Commitment"))).perform();
        driver.findElement(By.xpath("//a[contains(@data-action-detail,'Our Ambition')]")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Surf");
        driver.findElement(By.xpath("//g[@id='search']")).click();
        
        
    }
}
