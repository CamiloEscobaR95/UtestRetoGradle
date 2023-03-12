package com.utestreto.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/utest_reto.feature",
        glue = "com.utestreto.stepdefinitions",
        tags = "@CP_002",
        snippets = SnippetType.CAMELCASE
)
public class Runner {
}
