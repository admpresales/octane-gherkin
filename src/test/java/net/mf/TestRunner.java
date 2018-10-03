package net.mf;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)

// The line below line will use all feature files (*.feature) which have the tag '@web'
// if the feature file does not have '@web' it will be ignored.
// You can override this at run time using the --tags
//
// For all feature files with feature @mobile tag
// mvn  clean test -Dcucumber.options="--tags @mobile"
//
// For all scenarios that are @mobile AND @slow AND @ignore
// mvn  clean test -Dcucumber.options="--tags @mobile --tags @slow --tags @ignore"
//
// For all scenarios that are @mobile AND (@slow OR @fast)
// mvn  clean test -Dcucumber.options="--tags @mobile --tags @slow,@fast"
//
// For all scenarios that are @mobile AND @slow AND NOT @ignore
// mvn  clean test -Dcucumber.options="--tags @mobile --tags @slow --tags ~@ignore"
@CucumberOptions(plugin = {"pretty", "junit:junitResults.xml","html:target/cucumber-pretty-report"},
        features = ".",
        tags = {"@web"})

public class TestRunner {

}