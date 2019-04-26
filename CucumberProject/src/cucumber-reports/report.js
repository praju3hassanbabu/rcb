$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/sekeleton/shout.feature");
formatter.feature({
  "name": "Shout Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sean shouts",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Sean is 10 meters away from Lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefnitions.sean_is_meters_away_from_Lucia(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sean shouts \"Free Coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnitions.sean_shouts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia \"listens\" to the message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnitions.lucia_to_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sean shouts",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Sean is 200 meters away from Lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefnitions.sean_is_meters_away_from_Lucia(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sean shouts \"Free Coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnitions.sean_shouts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia \"cannot listen\" to the message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnitions.lucia_to_the_message(String)"
});
formatter.result({
  "status": "passed"
});
});