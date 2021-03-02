package com.quinbay.cucumber.steps;


import com.quinbay.cucumber.CucumberHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


/**
 * @author kumar on 12/01/21
 * @project X-search
 */

public class LoginSteps {
  WebDriver driver;

 // CucumberHooks cucumberHooks=new CucumberHooks();
 // WebDriver driver=cucumberHooks.getDriver();


  @Given("^I am on Facebook login page$")
  public void goToFacebook() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    // driver.get("https://www.facebook.com/");

    driver.get("https://www.facebook.com/");
    System.out.println("Test Facebook Page");
  }

  @When("^I enter username as \"(.*)\"$")
  public void enterUserName(String userName) {
    WebElement loginElement= driver.findElement(By.xpath("//input[@id='email']"));
    loginElement.sendKeys(userName);

    System.out.println("UserName:" + userName);
  }

  @And("^I enter password as \"(.*)\"$")
  public void iEnterPasswordAs(String password) {
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
    System.out.println("UserName:" + password);
  }

  @Then("Login should fail")
  public void loginShouldFail() {
    WebElement submit=driver.findElement(By.xpath("//button[@name='login']"));
    submit.submit();

    System.out.println("Login Failed and it is out");
  }

  @Then("this is a test")
  public void m2() throws InterruptedException{
  //  Thread.sleep(5000);
  //  driver.close();

  }

}
