Commands
............................................................................................
# Run test
robot -d amazon.robot

# Run test and save output in results folder
robot -d results amazon.robot

# Run "User must sign in to check out" test case from test and save output in results folder
robot -d results -t "User must sign in to check out" amazon.robot