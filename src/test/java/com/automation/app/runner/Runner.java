package com.automation.app.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleWrapper;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CucumberOptions(
        plugin = {
                "pretty"
                , "html:target/Reports/Cucumber-Reports/AutomationReport.html"
        }
        , features = "classpath:features"
        , glue = {"com/automation/app/stepdefinitions"}
        , tags = "@test"
        , monochrome = true
        , dryRun = false
)
public class Runner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider
    public Object[][] scenarios() {
        return filterScenarios(super.scenarios());
    }

    public Object[][] filterScenarios(Object[][] scenarios){
        int length = scenarios.length;
        System.out.println("Processing Scenarios: "+ length);
        List<Object[]> filteredScenarios = new ArrayList<>();
        System.out.println(Arrays.deepToString(scenarios));

        for(Object[] scenario : scenarios){
            PickleWrapper pickleWrapper = (PickleWrapper) scenario[0];
            pickleWrapper.getPickle().getName();
            List<String> tags = pickleWrapper.getPickle().getTags();
            if(!tags.contains("@final")){
                filteredScenarios.add(scenario);
            }
        }

        return filteredScenarios.toArray(new Object[0][]);
    }
}
