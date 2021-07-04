package SeccionEmpleos;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Choucairtest {
	
	private WebDriver driver;
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	@Test
	public void testChouair() {
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.clear();
		
		searchbox.sendKeys("https://www.choucairtesting.com/empleos-testing/");
		
		
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit. SECONDS);
		
		assertEquals("https://www.choucairtesting.com/empleos-testing/ - Google Search");
		
	}
	private void assertEquals(String string) {
		// TODO Auto-generated method stub
		
	}
	@After
	
	public void tearDown() {
	
		driver.quit();
		
		
		
	}

	
}
