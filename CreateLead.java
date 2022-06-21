package Week7.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(dataProvider = "fetchData")
	public void CreateContact1(String fname, String lname, String dept) {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Rajalakshmi");
		driver.findElement(By.id("lastNameField")).sendKeys("Mahalingam");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(fname);
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys(lname);
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys(dept);
		driver.findElement(By.id("createContactForm_description")).sendKeys("Amazing leading Company");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("raji5.maha@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select wb = new Select(state);
		wb.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Amazing Selenium");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("Title of Web Page is :" + driver.getTitle());

	}

	@DataProvider
	public String[][] fetchData() {
		String[][] data = new String[2][3];
		data[0][0] = "Rajalakshmi";
		data[0][1] = "Mahalingam";
		data[0][2] = "CSE";
		data[1][0] = "RameshKumar";
		data[1][1] = "Balakrishnan";
		data[1][2] = "PHYSICS";
		return data;

	}
}
