package Mavenselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mavensel {
	WebDriver driver;
	
@BeforeTest
public void  bfrtst() {
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
}
@Test
public void test()
{
	String act=driver.getTitle();
	String exp="facebook";
	if(exp.contains(act))
	{
		System.out.println("facebook title is presence");
	}
	else
	{
		System.out.println("facebook title is not presence");
	}
}
}
