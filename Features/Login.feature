Feature: Login

  Scenario: Successful login with valid credentials
    Given User launches the chrome browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    Then user enters username as "admin@yourstore.com" and password as "admin"
    Then click on signin
    Then Page Title should be displayed as "Dashboard / nopCommerce administration"
    When user click on logout link
    Then Page Title should be "Your store. Login"
    And close the browser

Scenario Outline: Login Data Driven
    Given User launches the chrome browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    Then user enters username as "<username>" and password as "<password>"
    Then click on signin
    Then Page Title should be displayed as "Dashboard / nopCommerce administration"
    When user click on logout link
    Then Page Title should be "Your store. Login"
    And close the browser

    Examples:
    | username | password |
    | admin@yourstore.com    | admin |
    |admin1@yourstore.com    | admin123 |