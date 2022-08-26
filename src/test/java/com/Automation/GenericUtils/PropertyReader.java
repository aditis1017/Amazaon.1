package com.Automation.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyReader {
static Properties pro = new Properties();
	
	public static void initproperty() throws FileNotFoundException, IOException{
		{
	pro.load(new FileInputStream("C:\\Users\\aditi.singh3\\eclipse-workspace\\Amazaon.1\\src\\test\\resources\\Config\\config.properties"));

	}

}
public static String getProperty(String key) {
	return pro.getProperty(key);
}
	}


