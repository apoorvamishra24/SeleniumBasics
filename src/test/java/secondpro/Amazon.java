package secondpro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)  throws InterruptedException {
		

	
		{
			//WebDriver driver;
			//driver.get("https://www.amezon.in");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\secondpro\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Thread.sleep(10000);
			driver.navigate().to("https://www.amazon.in");
			String actualTitle = driver.getTitle();
			driver.manage().window().maximize();
			String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			if(actualTitle.equalsIgnoreCase(expectedTitle))
				System.out.println("Title Matched");
				else
				System.out.println("Title didn't match");
			driver.close();
			driver.quit();
			}
			
		}

	}


