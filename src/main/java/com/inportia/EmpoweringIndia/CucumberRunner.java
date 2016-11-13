package com.inportia.EmpoweringIndia;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = "D:\\EmpoweringIndia\\src\\test\\java\\com\\inportia\\EmpoweringIndia\\Features",
	glue     = "com\\inportia\\EmpoweringIndia\\stepDefs"
)
public class CucumberRunner 
{


}
