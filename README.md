# WebAutomation
BDD Cucumber with Extent Reports

This is a basic web automation POC using BDD Model

Tools used are Selenium with JAVA 8 based on Cucumber, Gherkin model

This also had Reporting and Logging based on Extent Reports on top of TestNG, POM architecture

Code Structure - 
 1. Helper - Get Data Helps from external files like CSV, XLS, XLSX 
 2. Modules - For Various system Modules 
 3. Page Object - For Screen/Page based Object Locating Strategies
 4. Runner - Test Runner to run one or many features
 5. Step Definition - To define the Cucumber + Gherkin feature steps
 6. Features - To define the feature in BDD manner viz.
    Given.... When.... Then...
    
 Reports are generated in output package
 Report contains Overall Feature Test Report along with Screenshots for failed cases linked to corresponding steps. 
