$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/HomePage.feature");
formatter.feature({
  "name": "Home Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintions.HomepageSteps.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Home page functionalities",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User gets title of the page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefintions.HomepageSteps.user_gets_title_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage title should be \"Zestimcart\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintions.HomepageSteps.homepage_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:Features/orderplacing.feature");
formatter.feature({
  "name": "Order placing",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintions.HomepageSteps.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "placing order",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on a product",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefintions.orderplacingsteps.user_click_on_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Buy now button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintions.orderplacingsteps.click_on_Buy_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login using username as \"banktest@devmail.info\" and password as \"password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintions.orderplacingsteps.login_using_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintions.orderplacingsteps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view checkout page with title \"Checkout\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintions.orderplacingsteps.user_should_be_able_to_view_checkout_page_with_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill details and click on checkout submit",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefintions.orderplacingsteps.user_fill_details_and_click_on_checkout_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "order should be placed and thank you page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintions.orderplacingsteps.order_should_be_placed_and_thank_you_page_should_be_displayed()"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\n\tat StepDefintions.orderplacingsteps.order_should_be_placed_and_thank_you_page_should_be_displayed(orderplacingsteps.java:75)\n\tat ✽.order should be placed and thank you page should be displayed(file:///home/arjun/eclipse-workspace/MerchantSites_Cucumber/Features/orderplacing.feature:13)\n",
  "status": "pending"
});
formatter.after({
  "status": "passed"
});
});