Feature: Customer

  Scenario: Adding a new customer
    Given User launches the chrome browser
    When User opens the URL "https://admin-demo.nopcommerce.com/login"
    And User enters username as "<string>" and password as "<string>"
    And Click on login button
    Then User can see dashboard
    When User click on customer menu
    And Click on customers menu item
    And Click on Add new button
    Then User can see the Add new customer page
    When User enters customer information
    And Clicks on the save button
    Then User can see the confirmation message like "The new customer has been added successfully"
    And Close the browser




