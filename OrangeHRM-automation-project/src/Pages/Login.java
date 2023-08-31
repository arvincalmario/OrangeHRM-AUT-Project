package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.TestConfig;

public class Login {
	
	 private void performLogin(WebDriver driver) throws InterruptedException {
	    	
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set your desired timeout	        
	        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
	        

	        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(TestConfig.validUsername);
	        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(TestConfig.validPassword);
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        Thread.sleep(3000);
	    }

	    public void performLoginTestChrome(WebDriver chromeDriver) throws InterruptedException {
	    	
	        performLogin(chromeDriver);
	    }

}
