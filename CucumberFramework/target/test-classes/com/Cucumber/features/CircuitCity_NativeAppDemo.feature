Feature: Demo Script

@appium1
Scenario: Trial Steps
Given My NativeApp 'CircuitCity_NativeApp' is open
When I enter 'Test' in field 'CC_Search'
And I click 'MenuIcon'
And I wait for '30' seconds