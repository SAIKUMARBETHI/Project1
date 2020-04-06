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
  "line": 33,
  "name": "Special offers in opencart website",
  "description": "",
  "id": "demo.opencart-website;special-offers-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@tc04_Special"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "the user to open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "the user clicks on the specials",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "the user will see the specials and add to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "the user close the site and browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Opencart_Specialssd.the_user_to_open_browser_chrome()"
});
formatter.result({
  "duration": 7451892400,
  "status": "passed"
});
formatter.match({
  "location": "Opencart_Specialssd.the_user_clicks_on_the_specials()"
});
formatter.result({
  "duration": 13007468600,
  "status": "passed"
});
formatter.match({
  "location": "Opencart_Specialssd.the_user_will_see_the_specials_and_add_to_the_cart()"
});
formatter.result({
  "duration": 3087292500,
  "status": "passed"
});
formatter.match({
  "location": "Opencart_Specialssd.the_user_close_the_site_and_browser()"
});
formatter.result({
  "duration": 3542579400,
  "status": "passed"
});
});