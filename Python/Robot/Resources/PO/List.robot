*** Settings ***
Documentation   User list
Library         SeleniumLibrary

*** Keywords ***
Add to List
    Click Link                              xpath=//*[@id="wishListMainButton"]/span/a

Verify addition to List
    Wait Until Page Contains                Sign in
    Input Text                              id=ap_email    ${EMAIL}