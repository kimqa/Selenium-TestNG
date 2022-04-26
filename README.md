# Set Up
Install selenoid https://aerokube.com/selenoid/latest/

Install allure brew install allure _brew install allure_

# Run test
_mvn -Ptestng clean test -Dbrowser=chrome_ (Check capabilities BaseTest.java:58)

# Generate report 
_allure serve target/surefire-reports/_