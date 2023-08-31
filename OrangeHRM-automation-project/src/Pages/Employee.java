package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.TestConfig;

public class Employee {
	
	public void performAddEmployee (WebDriver driver) throws InterruptedException {
		
		//NAVIGATE TO PIM
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.oxd-main-menu-item[href='/web/index.php/pim/viewPimModule']")));		
		driver.findElement(By.cssSelector("a.oxd-main-menu-item[href='/web/index.php/pim/viewPimModule']")).click();               
        System.out.println("Clicked on PIM element.");
        
        //NAVIGATE TO ADD EMPLOYEE
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("header[class='oxd-topbar'] li:nth-child(3) a:nth-child(1)")));
        driver.findElement(By.cssSelector("header[class='oxd-topbar'] li:nth-child(3) a:nth-child(1)")).click();
        System.out.println("Clicked on add employee element.");
        
        //ADDING EMPLOYEE
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(TestConfig.addEmpFname);
        driver.findElement(By.cssSelector("input[name='middleName']")).sendKeys(TestConfig.addEmpMname);
        driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(TestConfig.addEmpLname);
        driver.findElement(By.cssSelector("div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")).sendKeys(TestConfig.addEmpId);
        driver.findElement(By.cssSelector("span[class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
        
        driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys(TestConfig.username);
        driver.findElement(By.cssSelector("div[class='oxd-grid-item oxd-grid-item--gutters user-password-cell'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']")).sendKeys(TestConfig.password);
        driver.findElement(By.cssSelector("div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']")).sendKeys(TestConfig.confpassword);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        System.out.println("add employee complete.");
	}
	
	public void performSearchEmployee (WebDriver driver) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));        	
		driver.findElement(By.cssSelector("a.oxd-main-menu-item[href='/web/index.php/pim/viewPimModule']")).click();
				
                
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'0024')]")));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;       
        WebElement elementToClick = driver.findElement(By.xpath("//div[contains(text(),'0024')]"));
        jsExecutor.executeScript("arguments[0].click();", elementToClick);
        

        System.out.println("search employee complete");
	}
	
	public void performUpdateEmployeeDetails (WebDriver driver) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='orangehrm-custom-fields'] button[type='submit']")));
        
		driver.findElement(By.cssSelector("div[class='orangehrm-horizontal-padding orangehrm-vertical-padding'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2) input:nth-child(1)"))
		.sendKeys(TestConfig.nickname);
		driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > div:nth-child(2) > input"))
		.sendKeys(Keys.chord(Keys.CONTROL,"a"),TestConfig.otherID);
		
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"))
		.sendKeys(Keys.chord(Keys.CONTROL,"a"),TestConfig.DLicenseNumber);
		
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)"))
		.sendKeys(Keys.chord(Keys.CONTROL,"a"),TestConfig.lExpiryDate);
		
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"))
		.sendKeys(Keys.chord(Keys.CONTROL,"a"),TestConfig.ssnNumber);
		
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"))
		.sendKeys(Keys.chord(Keys.CONTROL,"a"),TestConfig.sinNumber);
		
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"))
		.click();
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"))
		.sendKeys(TestConfig.nationality);
		
		
		System.out.println("update employee complete");
	}
	
	 public void performSearchEmployeeUsingSearchinEmployeeList(WebDriver driver) throws InterruptedException {
	    	
		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.oxd-main-menu-item[href='/web/index.php/pim/viewPimModule']")));
			driver.findElement(By.cssSelector("a.oxd-main-menu-item[href='/web/index.php/pim/viewPimModule']")).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")));
			driver.findElement(By.cssSelector("div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")).sendKeys(TestConfig.sEmpId);;
			driver.findElement(By.cssSelector("button[type='submit']")).click();		
			
			System.out.println("search employee UsingSearch complete");
	    }
	
//    public void performAddEmployeeTestChrome(WebDriver chromeDriver) throws InterruptedException {
//    	
//    	performAddEmployee(chromeDriver);
//    	Thread.sleep(5000);
//    }
	 
	 public void performSearchEmployeeUsingSearchinEmployeeListTestChrome(WebDriver chromeDriver) throws InterruptedException {
	    	
		 performSearchEmployeeUsingSearchinEmployeeList(chromeDriver);
	    Thread.sleep(5000);
	 }

    public void performSearchEmployeeTestChrome(WebDriver chromeDriver) throws InterruptedException {
    	
    	performSearchEmployee(chromeDriver);
    	Thread.sleep(5000);
    }
    
    public void performUpdateEmployeeTestChrome(WebDriver chromeDriver) throws InterruptedException {
    	
    	performUpdateEmployeeDetails(chromeDriver);
    	Thread.sleep(5000);
    }
}