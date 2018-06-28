$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SampleApp.feature");
formatter.feature({
  "line": 2,
  "name": "Test The Sample MVC application",
  "description": "",
  "id": "test-the-sample-mvc-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SampleMVCAppTest"
    }
  ]
});
formatter.before({
  "duration": 243156,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Validate text on page",
  "description": "",
  "id": "test-the-sample-mvc-application;validate-text-on-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Validate_HomePageLoad"
    },
    {
      "line": 4,
      "name": "@ValidateResultPage"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "My WebApp \u0027SampleMVC\u0027 is open",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should see element \u0027Count\u0027 present on page_",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SampleMVC",
      "offset": 11
    }
  ],
  "location": "CommonSteps.my_webapp_is_open(String)"
});
formatter.result({
  "duration": 1597289990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Count",
      "offset": 22
    }
  ],
  "location": "CommonSteps.I_should_see_on_page_AndScreenshot(String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 1753720075,
  "status": "passed"
});
formatter.after({
  "duration": 127894,
  "status": "passed"
});
formatter.before({
  "duration": 104210,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify Word count function",
  "description": "",
  "id": "test-the-sample-mvc-application;verify-word-count-function",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@ValidateResultPage"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I enter \u0027TestWord!\u0027 in field \u0027EnterWord\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click \u0027Count\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see text \u0027The word TestWord! has 9 characters.\u0027 present on page at \u0027Result\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click link \u0027back\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I should see element \u0027Count\u0027 present on page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TestWord!",
      "offset": 9
    },
    {
      "val": "EnterWord",
      "offset": 30
    }
  ],
  "location": "CommonSteps.I_enter_in_field(String,String)"
});
formatter.result({
  "duration": 352813213,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Count",
      "offset": 9
    }
  ],
  "location": "CommonSteps.I_click(String)"
});
formatter.result({
  "duration": 307854149,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The word TestWord! has 9 characters.",
      "offset": 19
    },
    {
      "val": "Result",
      "offset": 77
    }
  ],
  "location": "CommonSteps.I_should_see_text_present_on_page_At(String,String)"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 1545035051,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "back",
      "offset": 14
    }
  ],
  "location": "CommonSteps.I_click_link(String)"
});
formatter.result({
  "duration": 501774529,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Count",
      "offset": 22
    }
  ],
  "location": "CommonSteps.I_should_see_on_page(String)"
});
formatter.result({
  "duration": 451224841,
  "status": "passed"
});
formatter.after({
  "duration": 39079,
  "status": "passed"
});
});