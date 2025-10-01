*** Settings ***
Documentation       This is some basic info about the whole suite
Library             SeleniumLibrary

#Run the script:
#robot -d results tests/crm.robot

*** Variables ***

while True:
*** Test Cases ***
Should be able to add new customer
    [Documentation]                 This is some basic info about the test
    [Tags]                          1006    Smoke   Contacts
    #Initialize Selenium
    Set selenium speed              .3s
    Set selenium timeout            10s

    #open the browser
    log                             Starting the test case!
    open browser                    https://automationplayground.com/crm/       edge
    Maximize Browser Window

    # resize browser window for recording
#    Set window position             x=0   y=0
#    Set window size                 width=1920  height=1080
    
    Page Should Contain             Customers Are Priority One
    
    Click Link                      id=SignIn
    Page Should Contain             Login
    
    Input Text                      id=email-id    admin@robotframeworktutorial.com
    Input Text                      id=password    qwe
    Click Button                    id=submit-id
    
    Page Should Contain             Our Happy Customers
    
    Click Link                      id=new-customer
    Page Should Contain             Add Customer
    
    Input Text                      id=EmailAddress    janedoe@gmail.com
    Input Text                      id=FirstName       jane
    Input Text                      id=LastName        Doe
    Input Text                      id=City            Dallas
    Select From List By Value       id=StateOrRegion   TX
    Select Radio Button             gender             female
    Select Checkbox                 name=promos-name
    Click Button                    Submit

    sleep                           5s
    close browser

*** Keywords ***