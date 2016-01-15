$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post_A_Ride.feature");
formatter.feature({
  "id": "publish-a-ride-.",
  "description": "As an employee of  bank i need my car details to be shared to all the bank employees \r\nwho want to share car rides.",
  "name": "Publish a ride .",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "publish-a-ride-.;the-employee-post-correct-data-mentioned-below.",
  "description": "",
  "name": "The employee post correct data mentioned below.",
  "keyword": "Scenario",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "employee Person No. is 22222222 , Phone No. is 1234567890, Email Id is \"ankit@gmail.com\" , origin is \"Gurgaon\", destination is \"Noida\", Ride Type is \"Car\", Seats Offered is 4, Start Time is \"13/01/2016:18:00:00\"",
  "keyword": "Given ",
  "line": 12
});
formatter.step({
  "name": "click on \"Submit\"",
  "keyword": "When ",
  "line": 13
});
formatter.step({
  "name": "Display Message \"Publish Successful\"",
  "keyword": "Then ",
  "line": 14
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "publish-a-ride-.;the-employee-post-data",
  "description": "",
  "name": "The employee post data",
  "keyword": "Scenario",
  "line": 17,
  "type": "scenario"
});
formatter.step({
  "name": "time less that current time",
  "keyword": "And ",
  "line": 18
});
formatter.step({
  "name": "employee Person No. 22222222 , Phone No. 1234567890, Email Id \"ankit@gmail.com\" , origin \"Gurgaon\", destination \"Noida\", Ride Type \"Car\", Seats Offered 4, Start Time \"12/01/2016:11:00:00\"",
  "keyword": "Given ",
  "line": 19
});
formatter.step({
  "name": "click on \"Submit\"",
  "keyword": "When ",
  "line": 20
});
formatter.step({
  "name": "Display Message \"Please enter correct Date and Time\"",
  "keyword": "Then ",
  "line": 21
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "publish-a-ride-.;mandatory-field-is-missing",
  "description": "",
  "name": "Mandatory field is missing",
  "keyword": "Scenario",
  "line": 25,
  "type": "scenario"
});
formatter.step({
  "name": "employee Person No. , Phone No. 1234567890, Email Id \"ankit@gmail.com\" , origin \"Gurgaon\", destination \"Noida\", Ride Type \"Car\", Seats Offered 4, Start Time \"12/01/2016:11:00:00\"",
  "keyword": "Given ",
  "line": 26
});
formatter.step({
  "name": "click on \"Submit\"",
  "keyword": "When ",
  "line": 27
});
formatter.step({
  "name": "Display Message \"Mandatory field left blank\"",
  "keyword": "Then ",
  "line": 28
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});