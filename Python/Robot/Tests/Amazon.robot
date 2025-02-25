*** Settings ***
Documentation       This is some basic info about the whole suite
Resource            Resources/AmazonApp.robot
Resource            Resources/Common.robot
Suite Setup         Insert Testing Data
Test Setup          Begin Web Test
Test Teardown       End Web Test
Suite Teardown      Clean up Testing Data

*** Variables ***
${BROWSER}          edge
${START_URL}        https://www.amazon.com
${SEARCH_TERM}      Ferrari 458
${EMAIL}            Ferrari@gmail.com

*** Test Cases ***
User can search for products
    [Documentation]  This is some basic info about the test
    [Tags]  Smoke
    AmazonApp.Search for Products

User must sign in to buy
    [Documentation]  This is some basic info about the test
    [Tags]  Smoke
    AmazonApp.Search for Products
    AmazonApp.Select Product from Search Results
    AmazonApp.Add Product to list




