@PM_Beta_Trial
Feature: Product Management Beta page trial script

Scenario: Login to eCommerce Admin portal as an Admin user
Given My WebApp 'eCom_PM' is open
And I login to IHS-eCommerce Admin portal as Administrator 
Then I should see element 'PageHeader' present on page

Scenario: Navigate to Product Management Beta page and verify 
Given I navigate to 'ProductManagementBeta' page
And I should see text 'Products (Beta)' present on page at 'ProductsBetaHeader'

Scenario: Validate a single product 
When I Click 'selectItem_cog' with reference to '2000005693'
And I click 'ValidateLink'
And I wait for '4' seconds
And I click 'ValidationPopUp_Close'
And I wait for '5' seconds

Scenario: Validate multiple product at once
When I Click 'selectItem_checkBox' with reference to '2000005696'
And I Click 'selectItem_checkBox' with reference to '2000005694'
And I Click 'selectItem_checkBox' with reference to '2000005693'
And I Click 'selectItem_cog' with reference to '2000005693'
And I click 'ValidateLink'
And I wait for '10' seconds
And I click 'ValidationPopUp_Close'

Scenario: Search for a Product using SKU number in search field and verify result
Given I should see element 'ProductsBetaHeader' present on page
And I wait for '5' seconds
When I enter '2000005696' in field 'searchField'
And I wait for '5' seconds
And I click 'searchButton'
And I wait for '5' seconds
Then I should see text '2000005696' present on page at 'SKU'
And I should see text 'US Solar Power Market Study 2011-2025' present on page at 'Title'

#When I Click 'selectItem_checkBox' with reference to '2000005696'