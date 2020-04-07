$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/DemoOpencart.feature");
formatter.feature({
  "line": 2,
  "name": "Demo.Opencart website",
  "description": "",
  "id": "demo.opencart-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Registering valid details",
  "description": "",
  "id": "demo.opencart-website;registering-valid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_register"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user launch the browser for valid register",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the  user opens opencart register page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user enters the valid register details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the user close the register page",
  "keyword": "Then "
});
formatter.match({
  "location": "Opencart_Registersd.the_user_launch_the_browser_for_valid_register()"
});
formatter.result({
  "duration": 9722213700,
  "status": "passed"
});
formatter.match({
  "location": "Opencart_Registersd.the_user_opens_opencart_register_page()"
});
formatter.result({
  "duration": 2029474700,
  "status": "passed"
});
formatter.match({
  "location": "Opencart_Registersd.the_user_enters_the_valid_register_details()"
});
formatter.result({
  "duration": 5893978600,
  "status": "passed"
});
formatter.match({
  "location": "Opencart_Registersd.the_user_close_the_register_page()"
});
formatter.result({
  "duration": 467614200,
  "status": "passed"
});
});