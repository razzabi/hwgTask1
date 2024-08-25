$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/testing.feature");
formatter.feature({
  "name": "Verify that TodoMVC page loads successfully",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@main"
    }
  ]
});
formatter.scenario({
  "name": "filter Task",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@main"
    },
    {
      "name": "@filterTask"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates TodoMVC Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.user_navigates_TodoMVC_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user on todoMVC page user click field what needs to be done",
  "keyword": "When "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.user_on_todoMVC_page_user_click_field_what_needs_to_be_done()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input task \"Go to H Club SCBD\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.user_input_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input task \"Buy a bottle of Singleton\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.user_input_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input task \"Dance the night out!\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.user_input_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mark as completed task one",
  "keyword": "And "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.mark_as_completed_task_one()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "delete task two",
  "keyword": "And "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.delete_task_two()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select filter active",
  "keyword": "And "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.select_filter_active()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "show task \"Dance the night out!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.show_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select filter completed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.select_filter_completed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "show task \"Go to H Club SCBD\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.RegisterMelaka.testingSteps.show_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});