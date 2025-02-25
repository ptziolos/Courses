*** Settings ***
Documentation   Amazon page
Library         SeleniumLibrary

*** Keywords ***
Load
    Go To    ${START_URL}

Verify Page Loaded
    Wait Until Page Contains    All




