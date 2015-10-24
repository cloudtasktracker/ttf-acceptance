$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("task.feature");
formatter.feature({
  "line": 2,
  "name": "Task manipulation",
  "description": "User can be able to add a new task, mark the task as done and delete the task",
  "id": "task-manipulation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature-Task"
    }
  ]
});
formatter.before({
  "duration": 246887611,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "List tasks",
  "description": "",
  "id": "task-manipulation;list-tasks",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@list-task"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am an authenticated user to tta-api",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I use the list task operation",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result contains a list of tasks",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskSteps.i_am_an_authenticated_user_to_tta_api()"
});
formatter.result({
  "duration": 108769943,
  "status": "passed"
});
formatter.match({
  "location": "TaskSteps.i_use_the_list_task_operation()"
});
formatter.result({
  "duration": 1815957658,
  "status": "passed"
});
formatter.match({
  "location": "TaskSteps.the_result_contains_a_list_of_tasks()"
});
formatter.result({
  "duration": 76266,
  "status": "passed"
});
formatter.after({
  "duration": 33415,
  "status": "passed"
});
formatter.before({
  "duration": 9157078,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Add a new task",
  "description": "",
  "id": "task-manipulation;add-a-new-task",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@add-task"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am an authenticated user to tta-api",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I add the task \"Test task from ttf-acceptance\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I get the message \"Task added\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskSteps.i_am_an_authenticated_user_to_tta_api()"
});
formatter.result({
  "duration": 68171,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test task from ttf-acceptance",
      "offset": 16
    }
  ],
  "location": "TaskSteps.i_add_the_task(String)"
});
formatter.result({
  "duration": 5281089,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat steps.TaskSteps.i_add_the_task(TaskSteps.java:50)\n\tat ✽.When I add the task \"Test task from ttf-acceptance\"(task.feature:14)\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "Task added",
      "offset": 19
    }
  ],
  "location": "TaskSteps.i_get_the_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 49786,
  "status": "passed"
});
});