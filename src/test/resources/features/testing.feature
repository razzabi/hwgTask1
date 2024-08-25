@main
Feature: Verify that TodoMVC page loads successfully

  @openURL
  Scenario: User opens TodoMVC page
    Given user navigates TodoMVC Page
    Then the page should load successfully with title "todos"

  @addTask
  Scenario: add task
    Given user navigates TodoMVC Page
    When user on todoMVC page user click field what needs to be done
    And user input task "Go to H Club SCBD"
    And user input task "Buy a bottle of Singleton"
    And user input task "Dance the night out!"
    Then show in list task "Go to H Club SCBD"
    Then show in list task "Buy a bottle of Singleton"
    Then show in list task "Dance the night out!"
    Then show total task "3 items left!"

  @completeTask
  Scenario: complete Task
    Given user navigates TodoMVC Page
    When user on todoMVC page user click field what needs to be done
    And user input task "Go to H Club SCBD"
    And user input task "Buy a bottle of Singleton"
    And user input task "Dance the night out!"
    And mark as completed task one
    Then show total task "2 items left!"

  @deleteTask
  Scenario: delete Task
    Given user navigates TodoMVC Page
    When user on todoMVC page user click field what needs to be done
    And user input task "Go to H Club SCBD"
    And user input task "Buy a bottle of Singleton"
    And user input task "Dance the night out!"
    And mark as completed task one
    And delete task two
    Then show total task "1 item left!"

  @filterTask
  Scenario: filter Task
    Given user navigates TodoMVC Page
    When user on todoMVC page user click field what needs to be done
    And user input task "Go to H Club SCBD"
    And user input task "Buy a bottle of Singleton"
    And user input task "Dance the night out!"
    And mark as completed task one
    And delete task two
    And select filter active
    Then show task "Dance the night out!"
    And select filter completed
    Then show task "Go to H Club SCBD"







