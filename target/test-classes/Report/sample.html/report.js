$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/loginpage.feature");
formatter.feature({
  "name": "Facebook page validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login page with invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on facebook page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on loginpage",
  "keyword": "And "
});
formatter.step({
  "name": "User verify the error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Hello",
        "12345"
      ]
    },
    {
      "cells": [
        "prem",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login page with invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"Hello\" and \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on loginpage",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_the_error_message()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat com.steps.StepDefinition.user_verify_the_error_message(StepDefinition.java:54)\r\n\tat ✽.User verify the error message(file:src/test/resources/features/loginpage.feature:12)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login page with invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"prem\" and \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on loginpage",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_the_error_message()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat com.steps.StepDefinition.user_verify_the_error_message(StepDefinition.java:54)\r\n\tat ✽.User verify the error message(file:src/test/resources/features/loginpage.feature:12)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});