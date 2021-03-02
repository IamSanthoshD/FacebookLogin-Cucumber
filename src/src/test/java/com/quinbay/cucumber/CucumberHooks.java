package com.quinbay.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author kumar on 12/01/21
 * @project X-search
 */

public class CucumberHooks {



  @Before
  public void testBefore(){

    System.out.println("This is a demo of before hook");
  }




  @After
  public void testAfter(){
    System.out.println("This is a demo of after hook");
  }
}
