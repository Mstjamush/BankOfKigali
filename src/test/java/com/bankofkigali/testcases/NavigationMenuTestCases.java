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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 *
 * @author josphatmuindi
 */
public class NavigationMenuTestCases {
    WebDriver driver;
    
    
    @Test(priority = 1)
    public void OpenBrowser() throws InterruptedException{
        
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.bk.rw/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
}
    
    @Test(priority = 2)
    public void confirmAssertCurrentSaving() throws InterruptedException{
        
        String openAccountID = "/html/body/section[2]/nav/div/div/div[2]/ul[1]/li[2]/a";
        WebElement web = driver.findElement(By.xpath(openAccountID));
        boolean bool=web.isDisplayed();
    
        if(bool == true){
            System.out.println("Test passed, page contains Current & Savings");
        } else {
            System.out.println("Test has failed");
        }
          
    }
    
    
    @Test(priority = 3)
    public void confirmAssertCurrentSavingDropDown() throws InterruptedException{
        String openAccountID = "/html/body/section[2]/nav/div/div/div[2]/ul[1]/li[2]/a";
        WebElement web = driver.findElement(By.xpath(openAccountID));
        
        Actions action = new Actions(driver);
        action.moveToElement(web).build().perform();
        WebElement drop = driver.findElement(By.xpath("/html/body/section[2]/nav/div/div/div[2]/ul[1]/li[2]/ul/li[2]/ul/li[1]"));
        
        boolean bool = drop.isDisplayed();
        if(bool == true){
            System.out.println("Test passed, Current & Savings is a drop down");
        } else {
            System.out.println("Test has failed");
        }
    }
    
    @Test(priority = 4)
    public void confirmAssertOnlineBankingPage() throws InterruptedException {
        String openAccountID = "/html/body/section[2]/nav/div/div/div[2]/ul[1]/li[2]/a";
        String onlineBankingId = "Online Banking";
        
        String onlineBankingPageTitle = "";
        WebElement web = driver.findElement(By.xpath(openAccountID));
        
        Actions action = new Actions(driver);
        action.moveToElement(web).build().perform();
        driver.findElement(By.linkText(onlineBankingId)).click();
        
        Thread.sleep(1000);
        
        String actualPageTitle = driver.getTitle();
        if (actualPageTitle.contains(onlineBankingPageTitle)){
            System.out.println("Test Pass, page navigated to is the Online Banking page");
        } else {
            System.out.println("Test Fail");
        }
    }
    
}