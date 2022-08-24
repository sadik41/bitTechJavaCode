package com.bit.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {

	//when we need multiple methods with same name in the same class, we can use method overloading concept
	// we have to each method unique by changing the parameter size or type or sequence
	
	// method access modifier can be same or different
	// return can be same or different
	// compile time polymorphism
	
	ChromeDriver dr;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		dr = new ChromeDriver();
	}
	

	public void myWait(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}

	public void closeBrowser() throws InterruptedException {
		myWait(5000);
		dr.quit();
	}
	
	public void goToAnyWebSite(String url) {
		dr.get(url);
	}

	public void clickOnElmenet(By by) {
		
		dr.findElement(by).click();
	}
	
	public void clickOnElmenet(WebElement ele) {
		
		ele.click();
	}
	
	public void clickOnElmenet(String xpathExpression) {
		
		dr.findElement(By.xpath(xpathExpression)).click();
		
	}
	
	//my own create methods:
	
	public void getData(int a, String n) {
 
		System.out.println("This are int and String");
	}

	public void getData(double d) {

		System.out.println("This is a double");
	}

	public void getData(String n, byte b) {

		System.out.println("This are String and byte");
	}

	public void getData(boolean b, short s) {

		System.out.println("This are Boolean and Short");
	}

	public void getData(float f, long l) {
		
		System.out.println("This are Float and Long");
	}


	public void getData() {
		System.out.println("This is not papameterized");
	}
}
