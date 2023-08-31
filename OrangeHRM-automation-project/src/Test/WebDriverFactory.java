package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {
	
	public static WebDriver createChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arvin Almario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        return new ChromeDriver();
	}
	
    public static WebDriver createEdgeDriver() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Arvin Almario\\Documents\\edgedriver_win64\\msedgedriver.exe");
        return new EdgeDriver();
    }

}
