package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactsTest {

		// TODO Auto-generated method stub

		@Test
		public void CreateContactsTest() {
			WebDriver c= new ChromeDriver();
			c.get("http://www.myntra.com/");
			
		}
	}

