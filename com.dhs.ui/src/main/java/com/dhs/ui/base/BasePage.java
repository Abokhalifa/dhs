package com.dhs.ui.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage<T> {

	protected WebDriver driver;
	protected long Wait;

	
	//constructor
	protected BasePage(WebDriver driver)
	{
		this.driver = driver;
		Wait = 5000;
	}

	@SuppressWarnings("unchecked")
	protected T launchPage(String URL){
		driver.get(URL);
		return(T) this;
	}

	protected void type(String text, By element){
		find(element).sendKeys(text);
	}

	protected void click(By element){
		find(element).click();
	}
	
	protected void clear(By element){
		find(element).clear();
	}

	private WebElement find(By element) {
		new WebDriverWait(driver,Wait).until(ExpectedConditions.visibilityOfElementLocated(element));
		return driver.findElement(element);
	}

	public String getTitle(){
		return driver.getTitle();
	}

	public void visit(String url)
	{
		driver.navigate().to(url);
	}
	
	
	protected String readText(By element){
		return find(element).getText();
	}

}