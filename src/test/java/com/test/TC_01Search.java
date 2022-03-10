package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basepackage.Testbase;

public class TC_01Search extends Testbase{
	public void search() {
	driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("faucet");
}
}
