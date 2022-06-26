package stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;





public class stepping {
	WebDriver driver = hooksclass.driver;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		driver.get("http://retailm1.upskills.in/admin/index.php?route=common/login");
	}

  @When("user enter valid username and password")
public void user_enter_valid_username_and_password() {
	  
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
	}

	@And("user click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}


		@Then("user enters into home page")
		public void user_enters_into_home_page() {
		System.out.println("user entered into homepage");
	    
	}

	@When("user click the left menu bar")
	public void user_click_the_left_menu_bar() {
		
	}

	@When("user click the category section")
	public void user_click_the_category_section() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='button-menu']/i")).click();
        Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='menu-catalog']/a")).click();
	    //Thread.sleep(3000);
	    
	}

	@When("user click on the recurring profiles section")
	public void user_click_on_the_recurring_profiles_section() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Recurring Profiles'])[1]")).click();

	}

	@Then("user enters the recurring profile page")
	public void user_enters_the_recurring_profile_page() {
		
		System.out.println("User entered into recurring profile page");
	}
	
	@When("user click the add recuuring profile section")
	public void user_click_the_add_recuuring_profile_section() {
		
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/a")).click();
	}
	
	@And("user fillup the details in add recurring profiles section")
	public void user_fillup_the_details_in_add_recurring_profiles_section() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='recurring_description[1][name]']")).sendKeys("Dinesh");
		
		driver.findElement(By.xpath("//input[@id='input-price']")).clear();
		driver.findElement(By.xpath("//input[@id='input-price']")).sendKeys("23");
		
		driver.findElement(By.xpath("//input[@id='input-cycle']")).clear();
	    driver.findElement(By.xpath("//input[@id='input-cycle']")).sendKeys("1");
	    Thread.sleep(3000);
	    
	    WebElement din = driver.findElement(By.xpath("//select[@id='input-frequency']"));
        Select obj = new Select(din);
        obj.selectByValue("semi_month");
        Thread.sleep(2000);
        
        WebElement din1 = driver.findElement(By.xpath("//select[@id='input-status']"));
        Select obj1 = new Select(din1);
        obj1.selectByValue("1");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@name='trial_price']")).clear();
        driver.findElement(By.xpath("//*[@name='trial_price']")).sendKeys("25");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@name='trial_cycle']")).clear();
	    driver.findElement(By.xpath("//*[@name='trial_cycle']")).sendKeys("1");
	    Thread.sleep(1000);
	    
	    WebElement din2 = driver.findElement(By.xpath("//select[@name='trial_frequency']"));
        Select obj2 = new Select(din2);
        obj2.selectByValue("month");
        Thread.sleep(2000);
        
	  //driver.findElement(By.xpath("//input[@id='input-frequency']")).sendKeys("23");
        WebElement din3 = driver.findElement(By.xpath("//select[@id='input-trial-status']"));
        Select obj3 = new Select(din3);
        obj3.selectByValue("1");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id='input-sort-order']")).clear();
	    driver.findElement(By.xpath("//*[@id='input-sort-order']")).sendKeys("1");
	    Thread.sleep(2000);
	}

	
	@And("user click on the save button")
	public void user_click_on_the_save_button() throws InterruptedException {
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(2000);
	}

	
	@Then("the details are now saved and the profile is added")
	public void the_details_are_now_saved_and_the_profile_is_added() {
		driver.quit();
		System.out.println("The details are saved");
	}
	
	@When("user select a profile to edit")
	public void user_select_a_profile_to_edit() throws InterruptedException {
		
		//driver.findElement(By.xpath("(//td[text()='Dinesh'])[1]")).isSelected();
		driver.findElement(By.xpath("//*[@id='form-recurring']/div/table/tbody/tr[1]/td[4]/a")).click();
		Thread.sleep(2000);
	}

	@And("user edits the details")
	public void user_edits_the_details() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='input-cycle']")).clear();
	    driver.findElement(By.xpath("//input[@id='input-cycle']")).sendKeys("2");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button")).click();
	    Thread.sleep(4000);
	    
	}

	@Then("the profile details are now edited")
	public void the_profile_details_are_now_edited() {
		driver.quit();
	    System.out.println("The profile details are edited");
	}

	@When("user select a profile to delete")
	public void user_select_a_profile_to_delete() {
		
		driver.findElement(By.xpath("(//td[text()='Dinesh'])[1]")).isSelected();
	
	}
	
	@And("user click the delete button")
	public void user_click_the_delete_button() {
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	}
	
	@And("accept the delete alert")
	public void accept_the_delete_alert() throws InterruptedException{
		Alert obj4 = driver.switchTo().alert();
		obj4.accept();
		Thread.sleep(2000);
		
	}

	@Then("the profile is now deleted")
	public void the_profile_is_now_deleted() {
	    driver.quit();
		System.out.println("The profile is deleted");
	}
	@When("user select a profile to copy")
	public void user_select_a_profile_to_copy() {
	   
		driver.findElement(By.xpath("(//td[text()='Dinesh'])[1]")).isSelected();
		
	}
	
	@And("user click the copy button")
	public void user_click_the_copy_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	}

	@Then("the profile is now copied")
	public void the_profile_is_now_copied() {
		driver.quit();
		System.out.println("The profile is copied");
	    
		
	}
}
