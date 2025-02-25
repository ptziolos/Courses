*** Settings ***
Documentation    Amazon top navigation
Library          SeleniumLibrary


*** Variables ***
${TOPNAV_SEARCH_BAR}        id=twotabsearchtextbox
${TOPNAV_SEARCH_BUTTON}     id=nav-search-submit-button


*** Keywords ***
Search Product
    Enter Search Term
    Submit Search
    Verify Search Completed

Enter Search Term
    Input Text     ${TOPNAV_SEARCH_BAR}     ${SEARCH_TERM}

Submit Search
    Click Button    ${TOPNAV_SEARCH_BUTTON}

Verify Search Completed
    Wait Until Page Contains    results for "Ferrari 458"