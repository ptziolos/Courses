*** Settings ***
Documentation    Amazon product
Library          SeleniumLibrary

*** Keywords ***
Select Product
    Click Link    xpath=//*[@id="search"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div[1]/span/a

Verify Product
    Wait Until Page Contains    See All Buying Options