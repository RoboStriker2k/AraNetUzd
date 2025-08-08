@noprettier

# Praktisais uzdevums

```

Write test automation scripts for web page using Selenium framework.
Page url: https://www.saucedemo.com/

Scenarios for implementation:
•	Successful login
    o	open page
    o	type username into username field
    o	type password into password field
    o	click login button
    o	validate that login was successful
•	Wrong password
    o	open page
    o	type username into username field
    o	type wrong password into password field
    o	click login button
    o	validate error-message


Requirements:
•	programming language: Java
•	testing framework: any (jUnit, TestNG, Cucumber)
	demonstrate use of different locators: id, class, css selector, xpath

```

# Tasks done

- [x] Setting up the enviroment

- [x] Implementing scenarios

  - [x] Succesfull login

  - [x] Wrong password

# Requirements to setup
-Maven 
-Java Preferably 17 and up
# Setting up the project
```
cd .\App\demo\
mvn install
```
# Testing

To start a test 
``` 
cd .\App\demo\
run mvn test
```