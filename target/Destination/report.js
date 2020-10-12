$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Registeration.feature");
formatter.feature({
  "line": 2,
  "name": "User is register successfully",
  "description": "",
  "id": "user-is-register-successfully",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    },
    {
      "line": 1,
      "name": "@REG"
    }
  ]
});
formatter.before({
  "duration": 12913772700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to register successfully",
  "description": "",
  "id": "user-is-register-successfully;user-should-be-able-to-register-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on My Account and Register Button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter all required registration detail",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_Home()"
});
formatter.result({
  "duration": 985986300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_My_Account_and_Register_Button()"
});
formatter.result({
  "duration": 2377032200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enter_all_required_registration_detail()"
});
formatter.result({
  "duration": 3845985600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_be_able_to_register_successfully()"
});
formatter.result({
  "duration": 995744600,
  "status": "passed"
});
formatter.after({
  "duration": 497032200,
  "status": "passed"
});
});