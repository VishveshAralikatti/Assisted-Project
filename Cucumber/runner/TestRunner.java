package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Mphasis\\SL\\Lesson5-CucumberDemo\\src\\test\\java\\feature\\TagsDemo.feature",

glue= {"steps"}, dryRun= false, plugin= {"pretty","html:target/cucumberreport.html"},tags="@all")

public class TestRunner {

}
//D:\\Mphasis\\SL\\Lesson5-CucumberDemo\\src\\test\\java\\java\\feature\\TagsDemo.feature