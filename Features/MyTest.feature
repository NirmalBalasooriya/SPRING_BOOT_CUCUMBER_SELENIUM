Feature: Google page loading and Searching

Scenario: Google page loading and Searching

Given Open the Firefox and launch the application			

When Click on clickable item "//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"

Then Enter the value on "//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input" as "Beautiful Sri Lanka" and press enter

Then click on item with xpath "//*[@id='gb']/div/div[1]/a"

Then Enter the value on "//*[@id='identifierId']" as "validemailid" and press enter

Then Enter the value on "//*[@id='password']/div[1]/div/div[1]/input" as "test" and press enter

Then go back to previous URL

Then go back to previous URL

Then click on item with xpath "//*[@id='logo']/img"