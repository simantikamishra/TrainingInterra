package trnprg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\simantikam\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
