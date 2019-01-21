$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/datatablesSO.feature");
formatter.feature({
  "name": "Testing datatables website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@datatablesSO"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.step({
  "name": "User should enter firstname \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter lastname \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter position \"\u003cposition\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter office \"\u003coffice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter extension \"\u003cextension\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter start date \"\u003cdate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter salary \"\u003csalary\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters first name \"\u003cfirstname\u003e\" to search box",
  "keyword": "And "
});
formatter.step({
  "name": "User should see first name \"\u003cfirstname\u003e\" is inserted in the table",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test data for datatables",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "position",
        "office",
        "extension",
        "date",
        "salary"
      ]
    },
    {
      "cells": [
        "john",
        "doe",
        "retired",
        "london",
        "314",
        "2019-12-12",
        "125000"
      ]
    },
    {
      "cells": [
        "joe",
        "wong",
        "worjing",
        "chicago",
        "312",
        "2019-11-01",
        "150000"
      ]
    },
    {
      "cells": [
        "serdar",
        "kapurov",
        "studebt",
        "new york",
        "412",
        "2019-11-01",
        "100000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatablesSO"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "DatatablesDefSteps.user_is_on_the_datatables_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter firstname \"john\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_enter_firstname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter lastname \"doe\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_enter_lastname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter position \"retired\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_enter_position(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter office \"london\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter extension \"314\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter start date \"2019-12-12\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter salary \"125000\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters first name \"john\" to search box",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_enters_first_name_to_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see first name \"john\" is inserted in the table",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatablesSO"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "DatatablesDefSteps.user_is_on_the_datatables_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter firstname \"joe\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_enter_firstname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter lastname \"wong\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_enter_lastname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter position \"worjing\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_enter_position(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter office \"chicago\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter extension \"312\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter start date \"2019-11-01\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter salary \"150000\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters first name \"joe\" to search box",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_enters_first_name_to_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see first name \"joe\" is inserted in the table",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatablesSO"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "DatatablesDefSteps.user_is_on_the_datatables_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter firstname \"serdar\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_enter_firstname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter lastname \"kapurov\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_enter_lastname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter position \"studebt\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_enter_position(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter office \"new york\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter extension \"412\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter start date \"2019-11-01\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter salary \"100000\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesDefSteps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters first name \"serdar\" to search box",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesDefSteps.user_enters_first_name_to_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see first name \"serdar\" is inserted in the table",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});