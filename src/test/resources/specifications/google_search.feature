Feature: Search in google
  With Google I can search information in the Internet

  Scenario: I search articles about Selenium in the Internet

    Given Google search is opened in my browser
    When I enter search term "Selenium"
    Then Search results contains links for "Selenium" related resources

  Scenario: When i open search results it should be relevant to my search
    Given Google search is opened in my browser
    When I enter search term "Selenium"
    Then Search results contains links for "Selenium" related resources

    When I click on search result
    Then Opened page contains search term ".Net"
