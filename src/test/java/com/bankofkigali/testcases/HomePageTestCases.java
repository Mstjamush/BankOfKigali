/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankofkigali.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 *
 * @author josphatmuindi
 */
public class HomePageTestCases {
    WebDriver driver;
    
    //@TestCase 
    @Test(priority = 1)
    public void OpenBrowser() throws InterruptedException{
        
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.bk.rw/");
	//driver.manage().window().maximize();
	Thread.sleep(1000);
}
    @Test(priority = 2)
    public void confirmAssertOpenAccount() throws InterruptedException {
    
        String openAccountID = "Open account";
        WebElement web = driver.findElement(By.className(openAccountID));
        boolean bool=web.isDisplayed();
    
        if(bool == true){
            System.out.println("Test passed, page contains Open Account");
        } else {
            System.out.println("Test has failed");
        }
}
    @Test(priority = 2)
    public void confirmAssertGetALoan() throws InterruptedException {
    
        String getALoanID = "Get a loan";
        WebElement web = driver.findElement(By.className(getALoanID));
        boolean bool=web.isDisplayed();
    
        if(bool == true){
            System.out.println("Test passed, page contains Get a Loan");
        } else {
            System.out.println("Test has failed");
        }
}
    @Test(priority = 2)
    public void confirmAssertGetAMortgage() throws InterruptedException {
        String getALoanID = "Get a Mortgage";
        WebElement web = driver.findElement(By.className(getALoanID));
        boolean bool=web.isDisplayed();
    
        if(bool == true){
            System.out.println("Test passed, page contains Get a Mortgage");
        } else {
            System.out.println("Test has failed");
        }
    }
    
    @Test(priority = 2)
    public void confirmAssertCardCentre() throws InterruptedException {
        String getALoanID = "Card Center";
        WebElement web = driver.findElement(By.className(getALoanID));
        boolean bool=web.isDisplayed();
    
        if(bool == true){
            System.out.println("Test passed, page contains Card Centre");
        } else {
            System.out.println("Test has failed");
        }
    }
    
    @Test(priority = 2)
    public void confirmAssertPersonalAccount() throws InterruptedException {
        
        String personalAccountID = "Personal Current";
        WebElement web = driver.findElement(By.linkText(personalAccountID));
        
        boolean bool=web.isDisplayed();
    
        if(bool == true){
            System.out.println("Test passed, page contains Personal Account link");
        } else {
            System.out.println("Test has failed");
        }
        
    }
    
    @Test(priority = 2)
    public void confirmAssertJointAccount() throws InterruptedException {
        
        String jointAccountID = "Joint Account";
        WebElement web = driver.findElement(By.linkText(jointAccountID));
        
        boolean bool=web.isDisplayed();
    
        if(bool == true){
            System.out.println("Test passed, page contains Joint Account link");
        } else {
            System.out.println("Test has failed");
        }
    }
    
    @Test(priority = 2)
    public void confirmAssertSellPriceBuyPrice() throws InterruptedException {
        String sellPriceID = "";
        String buyPriceID = "";
        
        String sellPrice = driver.findElement(By.xpath(sellPriceID)).getText();
        String buyPrice = driver.findElement(By.xpath(buyPriceID)).getText();
        
        double buy = Double.valueOf(buyPrice);
        double sell = Double.valueOf(sellPrice);
        
        if(sell > buy && sell > 800){
            System.out.println("Test passed, Sell price is greater than buy and above 800");
        } else {
            System.out.println("Test has failed");
        }
    }
}
