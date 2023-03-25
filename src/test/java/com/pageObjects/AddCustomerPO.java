package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPO {
    public WebDriver ldriver;

    public AddCustomerPO(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    By lnkCustomers_menu= By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
        By lnkCustomers_menuitem = By.xpath("//a[@href='/Admin/Customer/List']/p");
    By btnAddnew = By.xpath("//a[normalize-space()='Add new']");
    By txtEmail =  By.xpath("//input[@id='Email']");
    By txtPassword = By.xpath("//input[@id='Password']");
    By txtCustomerRoles = By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]");

    By lstitemAdministarators = By.xpath("//li[contains(text(),'Administrators')");

    By lstitemRegistered = By.xpath("//li[contains(text(),'Registered')");


    By lstitemGuests = By.xpath("//li[contains(text(), 'Guests')");
    By lstitemVendors = By.xpath("//li[contains(text(), 'Vendors')");

    By drpmgrOfVendor = By.xpath("//*[@id='VendorId']");
    By rdMaleGender = By.id("Gender_Male");
    By rdFemaleGender = By.id("Gender_Female");

    By txtFirstName= By.xpath("//input[@id='FirstName']");
    By txtLastName = By.xpath("//input[@id='LastName']");

    By txtDob  = By.xpath(" ");

    By txtCompanyName = By.xpath("//input[@id='Company']");

    By txtAdminComment = By.xpath("//textarea[@id='AdminComment']");

    By btnSave = By.xpath("//button[@name='save']");








}
