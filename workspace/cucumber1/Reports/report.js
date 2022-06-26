$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/elearning.feature");
formatter.feature({
  "name": "elearning login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "login with unauthorised user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user enter invalid username \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "validation message",
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
        "dinesh",
        "dfghjk"
      ]
    }
  ]
});
formatter.background({
  "name": "background case",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepping.user_is_on_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "login with unauthorised user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user enter invalid username \"dinesh\" and \"dfghjk\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepping.user_enter_invalid_username_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepping.user_click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validation message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepping.validation_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "background case",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepping.user_is_on_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "login with authorised user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user enter valid username",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepping.user_click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validation message occurs",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});