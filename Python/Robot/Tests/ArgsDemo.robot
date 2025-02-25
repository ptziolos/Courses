*** Settings ***
Library  SeleniumLibrary

*** Variables ***


*** Test Cases ***
#User can search for products1
#    # Here we pass variable input data to a user-defined keyword
#    # Try it: Change the URL and/or browser input values (ie, chrome, firefox, etc.)
#    Begin Web Test1  http://www.amazon.com  edge

User can search for products2
    # Here we pass variable input data to a user-defined keyword
    # Try it: Change the URL and/or browser input values (ie, chrome, firefox, etc.)
    @{url_and_browser}  Create List  http://www.amazon.com  edge
    FOR    ${i}    IN RANGE    20
        Begin Web Test2  @{url_and_browser}
    END
    


For Test
    FOR    ${i}    IN RANGE    999999
           Exit For Loop If    ${i} == 9
           Log    ${i}
    END

*** Keywords ***
#Begin Web Test1
#    [Arguments]  ${url}  ${browser}
#    Open Browser  ${url}  ${browser}
#    Close Browser

Begin Web Test2
    [Arguments]  @{url_and_browser}
    Open Browser  ${url_and_browser}[0]  ${url_and_browser}[1]
    Close Browser
