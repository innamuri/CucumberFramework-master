@HDSupply
Feature: HD Supply White Cap site shopping cart features 

Scenario: Add a Product to cart and verify product in cart
Given My WebApp 'HDSupply' is open
And I should see element 'HomePageLogo' present on page
And I wait for '3' seconds
When I click 'ShopByCategory'
And I click 'CategorySelect_Electric&Lighting'
Then I should see element 'PageHeader' present on page
And I click 'Product_Battery'
Then I should see text 'Batteries' present on page at 'PageHeader'
And I click 'Product_Battery_item'
Then I should see element 'Product_EnergizerD' present on page
And I should see text 'Prod.# 309EN95' present on page at 'Product_Details'
And I should see text '$17.39' present on page at 'Product_offerPrice'
And I click 'AddToCart_Btn'
And I wait for '7' seconds
Then I should see element 'Cart_AddSuccessMsg' present on page
And I should see element 'ProductInCart' present on page
Then I click 'GoToCart'
And I should see element 'ProductLogo' present on page
And I should see element 'Product_Weight' present on page_
And I should see element 'Product_availability' present on page
And I should see element 'Product_EachPrice' present on page
And I should see element 'Product_TotalPrice' present on page

Scenario: Remove product from Cart and verify
Given I should see element 'ProductLogo' present on page 
When I click 'Product_RemoveFromCart'
Then I should see element 'ProductCard_Empty' present on page