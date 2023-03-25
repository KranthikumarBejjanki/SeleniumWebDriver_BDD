package com.stepDefinitions;

import com.pageObjects.loginPO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Steps {

    public WebDriver driver;
    public loginPO lp;


    @Given("User launches the chrome browser")
    public void user_launches_the_chrome_browser() {

        //System.setProperty("webdriver.chrome.driver", System.getProperty("user")+"//Drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        lp=new loginPO(driver);
    }
    @When("user opens the URL {string}")
    public void user_opens_the_url(String url) {

        driver.get(url);
    }
    @Then("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enters_username_as_and_password_as(String un, String pwd) {
      lp.setUsername(un);
      lp.setPassword(pwd);

    }

    @Then("click on signin")
    public void click_on_signin() {
        lp.clickLogin();
    }


    @Then("Page Title should be displayed as {string}")
    public void page_title_should_be_displayed_as (String expected) {
        String actual=driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @When("user click on logout link")
    public void user_click_on_logout_link() {
       lp.clickLogout();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be (String expected) {
        String actual=driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Then("close the browser")
    public void close_the_browser() {
       driver.close();
    }


}
