Feature: I as a user want to book a ticket to travel to space


  Scenario: login in the pages
    Given Luis open the pages the space
    When i  enter the credentials and click on the login button
      | username | password |
      | Luis     | 12345    |
    Then login correctly to the page