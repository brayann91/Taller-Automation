package com.test.automation.runner;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/test.feature",
			tags = "@Login",
			glue = "com.test.automation.stepDefinitions",
			snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}
