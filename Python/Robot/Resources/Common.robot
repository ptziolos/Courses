*** Settings ***
Documentation   This is some basic info about the whole suite
Library         SeleniumLibrary

*** Keywords ***
Begin Web Test
#    set selenium timeout  30 seconds
    Open Browser                            about:blank    ${BROWSER}
    Maximize Browser Window

End Web Test
    sleep                                   3s
    Close Browser

Insert Testing Data
    Log    Inserting Data...

Clean up Testing Data
    Log    Cleaning up Data...


