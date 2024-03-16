package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationsTest {

		// TODO Auto-generated method stub

		@Test
		public void CreateOrganizationTest() {
			WebDriver c= new ChromeDriver();
			c.get("http://localhost:8888/");
			
		}
	}

