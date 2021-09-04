Feature: Cusis Automation POC

  @Regression
Scenario Outline: SOA Application Automating

  Given User enter the "<url>"
  Then User enters the "<username>" , "<password>" and click on Signin 

  Examples:
    | url | username | password |
    | Application_URL | userName | Password |

  @Smoke
  Scenario Outline: SOA Application Automating2

    Given User enter the "<url>"
    Then User enters the "<username>" , "<password>" and click on Signin

    Examples:
      | url | username | password |
      | Application_URL | userName | Password |


