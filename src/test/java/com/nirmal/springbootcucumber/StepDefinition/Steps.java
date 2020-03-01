package com.nirmal.springbootcucumber.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {
       System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
       driver= new ChromeDriver();				

       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
       driver.manage().window().maximize();
       driver.get("http://www.google.com/");
    }		
    
    @When("^click on item with selector \\\"([^\\\"]*)\\\"")					
    public void  click_on_item_with_selector(String selector) throws Throwable 							
    {		
       driver.findElement(By.cssSelector(selector)).click();;													
    }

    @When("^click on item with xpath \\\"([^\\\"]*)\\\"")					
    public void  click_on_item_with_xpath(String xpathExpression) throws Throwable 							
    {		
       driver.findElement(By.xpath(xpathExpression)).click();
    }
    
    @Then("^go back to previous URL")
    public void go_back_to_previous_URL() throws Throwable {
    	driver.navigate().back();
    }


    @When("^div vivible and clickable with xpath \\\"([^\\\"]*)\\\"")					
    public void  div_vivible_and_clickable(String xpathExpression) throws Throwable 							
    {		
       driver.findElement(By.xpath(xpathExpression)).isDisplayed();		
       driver.findElement(By.xpath(xpathExpression)).isEnabled();		
    }



    @Then("^Enter the value on \"([^\"]*)\" as \"([^\"]*)\" and press enter")
    public void enter_the_value_on_and_pressenterFor(String xpathExpression, String value) throws Throwable
    {
        driver.findElement(By.xpath(xpathExpression)).sendKeys(value);
        driver.findElement(By.xpath(xpathExpression)).sendKeys(Keys.ENTER);
    }


    @When("^Click on clickable item \\\"([^\\\"]*)\\\"")
    public void Click_on_clickable_item(String xpathExpression) throws Throwable
    {
        driver.findElement(By.xpath(xpathExpression)).click();
    }

}