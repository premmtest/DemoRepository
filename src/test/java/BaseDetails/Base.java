package BaseDetails;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static void browserLaunch(String url) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void outputText(WebElement element) {
		System.out.println(element.getText());
	}

	public static void buttonClick(WebElement element) {
		element.click();

	}

	public static void quit() {
		driver.quit();
	}

}
