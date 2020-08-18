$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/GetPost.feature");
formatter.feature({
  "line": 1,
  "name": "Check status code of API",
  "description": "",
  "id": "check-status-code-of-api",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3099901200,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify post author",
  "description": "",
  "id": "check-status-code-of-api;verify-post-author",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User performs GET operation for \"/posts\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User should see status code as 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "/posts",
      "offset": 33
    }
  ],
  "location": "getPostStepDefinition.user_performs_GET_operation_for(String)"
});
formatter.result({
  "duration": 1495312100,
  "status": "passed"
});
formatter.match({
  "location": "getPostStepDefinition.user_should_see_author_name_as()"
});
formatter.result({
  "duration": 278812400,
  "status": "passed"
});
});