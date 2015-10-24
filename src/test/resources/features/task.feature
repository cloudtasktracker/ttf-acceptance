@Feature-Task
Feature: Task manipulation
  User can be able to add a new task, mark the task as done and delete the task

  @list-task
  Scenario: List tasks
    Given I am an authenticated user to tta-api
    When I use the list task operation
    Then the result contains a list of tasks

  @add-task
  Scenario: Add a new task
    Given I am an authenticated user to tta-api
    When I add the task "Test task from ttf-acceptance"
    Then I get the message "Task added"