package hooks;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import BaseDetails.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class SampleHooks extends Base {

	// ------To Print The Scenario Name--------

	@Before
	public void beforeScenario(Scenario s) {

		String name = s.getName();
		System.out.println("Scenario Name:  " + name);

	}

	@After
	public void screenshot(Scenario s) {  //---> Take ScreenShot  for Failure Test case 

		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");

		} else {
			TakesScreenshot tk = (TakesScreenshot) driver;        //----> Take Screenshot For Anything
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");

		}

		// ---------------------Order----------------------

		/*
		 * @Before(order = 2) public void beforeScenario1() {
		 * System.out.println("Scenario-1....."); }
		 * 
		 * @Before(order = 1) public void beforeScenario2() {
		 * System.out.println("Scenario-2......"); }
		 */

		// -------------------------Conditional Hooks--------------------------------

		/*
		 * 
		 * @Before("@sanity") public void beforeScenario() {
		 * System.out.println("Hooks Title"); }
		 * 
		 * @Before("@smoke") public void beforeScenario1() {
		 * System.out.println("Hooks Url"); }
		 */

		// --------------------------------------------------------------------------------------------------------------

		// ----------------Scenario Hooks----------------------

		/*
		 * @Before public void beforeScenario() { System.out.println("Hooks--Before..");
		 * 
		 * }
		 * 
		 * @After public void afterScenario() { System.out.println("Hooks--After"); }
		 * 
		 * //--------------------Step Hooks-----------------------------
		 * 
		 * @BeforeStep public void beforeStep() { System.out.println("Before--Step"); }
		 * 
		 * @AfterStep public void afterStep() { System.out.println("After--Step"); }
		 */
	}
}
