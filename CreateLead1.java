package Week5.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead1 extends BaseClass {
	@Test(dataProvider = "fetchData")
	public void CreateLead(String cname, String fname, String lname) {

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(ele);
		dd.selectByVisibleText("Conference");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raji");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Maha");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Amazing Lead Compsny");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("raji5.mahan@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select wb = new Select(state);
		wb.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
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
