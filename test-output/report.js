$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CusisApplicationPoc.feature");
formatter.feature({
  "line": 1,
  "name": "Cusis Automation POC",
  "description": "",
  "id": "cusis-automation-poc",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "SOA Application Automating",
  "description": "",
  "id": "cusis-automation-poc;soa-application-automating",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User enter the \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters the \"\u003cusername\u003e\" , \"\u003cpassword\u003e\" and click on Signin",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "cusis-automation-poc;soa-application-automating;",
  "rows": [
    {
      "cells": [
        "url",
        "username",
        "password"
      ],
      "line": 10,
      "id": "cusis-automation-poc;soa-application-automating;;1"
    },
    {
      "cells": [
        "Application_URL",
        "userName",
        "Password"
      ],
      "line": 11,
      "id": "cusis-automation-poc;soa-application-automating;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3400503300,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "SOA Application Automating",
  "description": "",
  "id": "cusis-automation-poc;soa-application-automating;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User enter the \"Application_URL\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters the \"userName\" , \"Password\" and click on Signin",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Application_URL",
      "offset": 16
    }
  ],
  "location": "CuteApplicationLoginPageStepDefinition.user_enter_the(String)"
});
formatter.result({
  "duration": 9389923500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "userName",
      "offset": 17
    },
    {
      "val": "Password",
      "offset": 30
    }
  ],
  "location": "CuteApplicationLoginPageStepDefinition.user_enters_the_and_click_on_Signin(String,String)"
});
formatter.result({
  "duration": 10425358900,
  "status": "passed"
});
formatter.after({
  "duration": 4361791200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "SOA Application Automating2",
  "description": "",
  "id": "cusis-automation-poc;soa-application-automating2",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User enter the \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User enters the \"\u003cusername\u003e\" , \"\u003cpassword\u003e\" and click on Signin",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "cusis-automation-poc;soa-application-automating2;",
  "rows": [
    {
      "cells": [
        "url",
        "username",
        "password"
      ],
      "line": 20,
      "id": "cusis-automation-poc;soa-application-automating2;;1"
    },
    {
      "cells": [
        "Application_URL",
        "userName",
        "Password"
      ],
      "line": 21,
      "id": "cusis-automation-poc;soa-application-automating2;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1949298300,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "SOA Application Automating2",
  "description": "",
  "id": "cusis-automation-poc;soa-application-automating2;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User enter the \"Application_URL\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User enters the \"userName\" , \"Password\" and click on Signin",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Application_URL",
      "offset": 16
    }
  ],
  "location": "CuteApplicationLoginPageStepDefinition.user_enter_the(String)"
});
formatter.result({
  "duration": 9062990800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "userName",
      "offset": 17
    },
    {
      "val": "Password",
      "offset": 30
    }
  ],
  "location": "CuteApplicationLoginPageStepDefinition.user_enters_the_and_click_on_Signin(String,String)"
});
formatter.result({
  "duration": 1574020600,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton value\u003d\"1\" class\u003d\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\" name\u003d\"login\" data-testid\u003d\"royal_login_button\" type\u003d\"submit\" id\u003d\"u_0_d_PM\"\u003e...\u003c/button\u003e is not clickable at point (1047, 304). Other element would receive the click: \u003cdiv class\u003d\"_3ixn\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d91.0.4472.124)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ITINBAC-DW0001\u0027, ip: \u002710.62.7.147\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\arunv\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51878}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: ad8af23fda10afa37d7385e5c1235845\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat automation.UI.PageObject.Cute.LoginPage.CuteApplicationLoginPage.enterValues(CuteApplicationLoginPage.java:36)\r\n\tat automation.UI.StepDefinition.Cute.LoginPage.CuteApplicationLoginPageStepDefinition.user_enters_the_and_click_on_Signin(CuteApplicationLoginPageStepDefinition.java:27)\r\n\tat ✽.Then User enters the \"userName\" , \"Password\" and click on Signin(CusisApplicationPoc.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 632738900,
  "status": "passed"
});
});