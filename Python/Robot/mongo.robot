*** Settings ***
Library   RobotMongoDBLibrary.Insert
Library   RobotMongoDBLibrary.Update
Library   RobotMongoDBLibrary.Find
Library   RobotMongoDBLibrary.Delete


*** Variables ***
# CONNECT WITH CONNECTION STRING CLUSTER
&{MONGODB_CONNECT_TRANSMISSION_STRING}   connection=mongodb://192.168.56.100:27017/    database=db   collection=T2
&{MONGODB_CONNECT_RECEPTION_STRING}   connection=mongodb://192.168.56.200:27017/    database=db   collection=R1


*** Test Cases ***
#robot -d results -t "Test find characteristic 1" mongo.robot
Test find characteristic 1
    &{FILTER}     Create Dictionary    data_items.characteristic=${1}
    ${RESULTS}     Find    ${MONGODB_CONNECT_RECEPTION_STRING}    ${FILTER}
    Should Not Be Empty    ${RESULTS}
    Log To Console    results :
    Log To Console    ${RESULTS}
#    FOR    ${RESULT}    IN    @{RESULTS}
#           Log To Console    ${RESULT["_id"]}
#    END


#robot -d results -t "Test find characteristic 2" mongo.robot
Test find characteristic 2
    &{FILTER}     Create Dictionary    data_items.characteristic=${2}
    ${RESULTS}     Find    ${MONGODB_CONNECT_RECEPTION_STRING}    ${FILTER}
    Should Not Be Empty    ${RESULTS}
    Log To Console    results :
    Log To Console    ${RESULTS}


#robot -d results -t "Test not find characteristic 1" mongo.robot
Test not find characteristic 1
    &{TIMESTAMP} =    Create Dictionary    $gt=2024-06-20T13:35:23.007174Z
    &{FILTER}     Create Dictionary    rx_timestamp=${TIMESTAMP}   data_items.characteristic=${1}
    ${RESULTS}     Find    ${MONGODB_CONNECT_RECEPTION_STRING}    ${FILTER}
    Should Be Empty    ${RESULTS}
    Log To Console    results :
    Log To Console    ${RESULTS}


#robot -d results -t "Test find characteristic 3" mongo.robot
Test find characteristic 3
    &{FILTER}     Create Dictionary    data_items.characteristic=${3}
    ${RESULTS}     Find    ${MONGODB_CONNECT_RECEPTION_STRING}    ${FILTER}
    Should Not Be Empty    ${RESULTS}
    Log To Console    results :
    Log To Console    ${RESULTS}