# Selenium-Cucumber with Serinity 


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

By default, the tests will run using Chrome. You can run them in Firefox by overriding the `driver` system property, e.g.
```Json
$ mvn clean verify -Ddriver=firefox
```

The test results will be recorded in the `target/site/serenity/index.html` file.

