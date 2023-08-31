package Test;

import org.openqa.selenium.WebDriver;

import Pages.Employee;
import Pages.Login;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		//FOR CHROME
		WebDriver chromedriver = WebDriverFactory.createChromeDriver();		
		chromedriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		chromedriver.manage().window().maximize();
				
		//FOR EDGE
//		WebDriver edgedriver = WebDriverFactory.createEdgeDriver();
//		edgedriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		edgedriver.manage().window().maximize();
		
		
		//LOGIN TEST
	    Login login = new Login(); // Instantiate the Login class
	  
	    login.performLoginTestChrome(chromedriver); // Call performLoginTest with chromeDriver and edgeDriver instances
	    
	    
	    //TEST ADD EMPLOYEE
//	    Employee addEmployee = new Employee();
//	    addEmployee.performAddEmployeeTestChrome(chromedriver);
	    
	    //TEST SEARCH EMPLOYEE USING SEARCH LIST	    
	    Employee searchEmployeeSearch = new Employee();
	    searchEmployeeSearch.performSearchEmployeeUsingSearchinEmployeeListTestChrome(chromedriver);
	    
	    //TEST SEARCH EMPLOYEE
	    Employee searchEmployee = new Employee();
	    searchEmployee.performSearchEmployeeTestChrome(chromedriver);
	    
	    //TEST UPDATE EMPLOYEE
	    Employee updateEmployee = new Employee();
	    updateEmployee.performUpdateEmployeeTestChrome(chromedriver);

	    chromedriver.quit();

	    		

	}

}