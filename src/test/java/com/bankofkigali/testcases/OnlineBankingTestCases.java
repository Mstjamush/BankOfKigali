/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankofkigali.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 *
 * @author josphatmuindi
 */
public class OnlineBankingTestCases {
    
    WebDriver driver;
    
    
    @Test(priority = 1)
    public void OpenBrowser() throws InterruptedException{
        
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
	driver = new FirefoxDriver();
        driver = new ChromeDriver();
	driver.get("https://www.bk.rw/");
	//driver.manage().window().maximize();
	Thread.sleep(1000);
}
    
    
    @Test(priority = 2)
    public void confirmAssertApplyButton() throws InterruptedException{
        String openAccountID = "/html/body/section[2]/nav/div/div/div[2]/ul[1]/li[2]/a";
        String onlineBankingId = "Online Banking";
        String applyNowID = "Apply Online";
        
        WebElement web = driver.findElement(By.xpath(openAccountID));
        
        Actions action = new Actions(driver);
        action.moveToElement(web).build().perform();
        driver.findElement(By.linkText(onlineBankingId)).click();
        
        Thread.sleep(1000);
        
        WebElement apply = driver.findElement(By.linkText(applyNowID));
        
        boolean bool = apply.isDisplayed();
        if(bool == true){
            System.out.println("Test passed, Apply Now button exists");
        } else {
            System.out.println("Test has failed");
        }
        
    }
    
}
