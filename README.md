# Selenium-Cucumber with Serenity 


## Choice of Tool
Serenity is an easy to use, plug and play framework which provides seemless integration with Selenium and Cucumber.

	+ It provides easy options to switch between multiple environment
	+ Easy reporting structure with screenshots on each steps or on failure (configurable)
	+ Easy Browser compatibility
	+ Easy Parallel Execution - just a click [configuration] away.
	+ Page Object are often very minimal, storing just the object of the page in itself.
	
The real advantage is in the use of many small, stable classes, each of which focuses on a single job, this application of the Single Responsibility Principle goes a long way to making the test code more stable, easier to understand, and easier to maintain.

### The project directory structure
The project has build scripts for Maven, and follows the standard directory structure:
```Gherkin
src
  + main
  + test
    + java                          Test runners and supporting code
    + resources
      + features                    Feature files
        + search                    Feature file subdirectories 
          contact_us.feature  
      + webdriver                   Bundled webdriver binaries
        + linux
        + mac
        + windows
          chromedriver.exe          OS-specific Webdriver binaries
          geckodriver.exe


### Generating Random Data
JavaFaker is a library that can be used to generate a wide array of real-looking data from addresses to popular culture references.


## Executing the tests
To run the sample project, you can either just run the `CucumberTestSuite` test runner class, or run either `mvn verify` from the command line.

By default, the tests will run using Chrome. 
```Json
$ mvn clean verify
```
To rum them in Firefox/IE override the `driver` system property [Have not tested this!!]

### Reporting
	+ The test results will be recorded in the `target/site/serenity/index.html` file.
	+ Screenshots are available by default for all steps executed. [ Click on Feature and then select the link under "Scenario details"

### Troubleshooting
	+ Make sure the driver and the browser are compatible. [Currently compatible with chromedriver 78].
	+ If your settings.xml has a different repository configured, maven will not be able to download files.
	Have only 



