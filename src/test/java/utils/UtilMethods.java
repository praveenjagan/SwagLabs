package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import data.DataReader;

public class UtilMethods {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		LaunchBrowser();
	}
	
	
	@DataProvider // Getting data from json and then to has map
	public Object[][] getData() throws IOException {
		DataReader read = new DataReader();
		List<HashMap<String, String>> data = read
				.getJsonData(System.getProperty("user.dir") + "\\src\\test\\java\\data\\TestData.json");
		return new Object[][] { { data.get(0) } };
	}

	public static void LaunchBrowser() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\GlobalData.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("URL");

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\PRAVEEN\\eclipse-workspace\\com.SwagLabs\\drivers\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user.dir") + "\\drivers\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
}
