package GithubJenkinsPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GithubJenkinsDemo
{
	@Test
	public void testA()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		Reporter.log("Opening gmail....",true);
		driver.close();
	}

}
