Feature: Tags Demo

  @SmokeTest
  Scenario: login into Free CRM
    Given I am on freecrm webpage to check free crm details

  @RegressionTest
  Scenario: check contact details
    Given I am on freecrm webpage to check free contact details

  @EndToEndTest
  Scenario: check Free CRM Deals
    Given I am on freecrm webpage to check free crm Deals details

  @SmokeTest @RegressionTest
  Scenario: check Free CRM price details
    Given I am on freecrm webpage to check free crm price details

  @SmokeTest @RegressionTest
  Scenario: check Free CRM stock details
    Given I am on freecrm webpage to check free crm stock details

  @EndToEndTest
  Scenario: check Free CRM weather reports
    Given I am on freecrm webpage to check  weather reports

  @RegressionTest
  Scenario: check Free CRM email contacts
    Given I am on freecrm webpage to check email contacts

  @RegressionTest
  Scenario: check Free CRM pricing
    Given I am on freecrm webpage to check pricing details

  @EndToEndTest
  Scenario: check Free CRM companies
    Given I am on freecrm webpage to check companies

  @EndToEndTest
  Scenario: check Free CRM Tasks
    Given I am on freecrm webpage to check Tasks

  @RegressionTest @EndToEndTest
  Scenario: check Free CRM Deals Summary
    Given I am on freecrm webpage to check Deals Summary
