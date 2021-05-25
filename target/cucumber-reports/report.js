$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/checkbox.feature");
formatter.feature({
  "name": "Test the login functionality on the Infojobs Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the \"Infojobs\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.userIsOnThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the cookie button",
  "keyword": "When "
});
formatter.match({
  "location": "Step.userClicksOnTheCookieButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user should be able to register their data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user enters their correct data",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersTheirCorrectData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userClicksSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.userGetsConfirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "the user should be able to register their data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters name \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters email \u003cemail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters address \u003caddress\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters function \u003cfunction\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user gets confirmation",
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
        "email",
        "password",
        "address",
        "function"
      ]
    },
    {
      "cells": [
        "Mary Smith",
        "mary@testmail.com",
        "marypass",
        "06045-360",
        "developer"
      ]
    },
    {
      "cells": [
        "Alex Green",
        "alex@testmail.com",
        "alexpass",
        "06045-370",
        "engineer"
      ]
    },
    {
      "cells": [
        "John Silva",
        "john@testmail.com",
        "johnpass",
        "06045-380",
        "doctor"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the \"Infojobs\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.userIsOnThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the cookie button",
  "keyword": "When "
});
formatter.match({
  "location": "Step.userClicksOnTheCookieButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user should be able to register their data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user enters name Mary Smith",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email mary@testmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password marypass",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters address 06045-360",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters function developer",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersFunction(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userClicksSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.userGetsConfirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the \"Infojobs\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.userIsOnThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the cookie button",
  "keyword": "When "
});
formatter.match({
  "location": "Step.userClicksOnTheCookieButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user should be able to register their data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user enters name Alex Green",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email alex@testmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password alexpass",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters address 06045-370",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters function engineer",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersFunction(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userClicksSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.userGetsConfirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the \"Infojobs\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.userIsOnThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the cookie button",
  "keyword": "When "
});
formatter.match({
  "location": "Step.userClicksOnTheCookieButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user should be able to register their data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user enters name John Silva",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email john@testmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password johnpass",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters address 06045-380",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters function doctor",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userEntersFunction(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Step.userClicksSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.userGetsConfirmation()"
});
formatter.result({
  "status": "passed"
});
});