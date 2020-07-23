package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = "",
        features ="src/test/resources/features",
        dryRun = false,
        glue = "com/cybertek/step_definitions",
        tags = "@loginAsLibrarian"




        )
public class CukesRunner {


}
