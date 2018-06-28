@MortCalc
Feature: Test Script for Mortgage calculator application

Scenario: Verify Monthly payment amount value
Given My WebApp 'MortgageCalc' is open
When I enter '500000' in field 'homeValue'
And I enter '350000' in field 'loanAmount'
And I enter '6' in field 'interestRate'
And I enter '35' in field 'loanTerm'
And I select option 'Jun' in dropdown 'startDateMonth' by 'Text' 
And I select option '2016' in dropdown 'startDateYear' by 'Text'
And I enter '1.25' in field 'propertyTax'
And I enter '0.7' in field 'PMI'
And I click 'calculate'
And I scroll to 'element' - 'MonthlyPayment'
#Then I should see text '$2,599.83' present on page at 'MonthlyPayment'
And I should see text matching regx '(\$)(\d){1,3},(\d){1,3}.(\d){1,4}' present on page at 'MonthlyPayment'
#And I verify screenshot to Baseline of page 'C:\\Users\\user\\Desktop\\base-1.png'