package com.pageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPO {

    WebDriver ldriver;

    public loginPO(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id="Email")
    @CacheLookup
    WebElement txtUsername;

    @FindBy(id="Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//button[text()='Log in']")
    @CacheLookup
    WebElement loginButton;

    @FindBy(xpath = "//a[text()='Logout']")
    @CacheLookup
    WebElement logoutButton;



    public void setUsername(String uname) {
       txtUsername.clear();
       txtUsername.sendKeys(uname);
    }
    public void setPassword(String pwd) {
       txtPassword.clear();
       txtPassword.sendKeys(pwd);
    }

    public void clickLogin(){
        loginButton.click();
    }
    public void clickLogout(){
        logoutButton.click();
    }
}
