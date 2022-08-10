package com.grid.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_002_Firefox {

	@Test
    public void testFirefox() throws MalformedURLException {
        
    	System.out.println("---------------------Firefox-----------------------");
        DesiredCapabilities capabilities= DesiredCapabilities.firefox();
        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);

        driver.get("https://frontend.nopcommerce.com/");

        String title = driver.getTitle();
        System.out.println("Title of the page: "+ title + "-> Firefox");

      if(title.equalsIgnoreCase("nopCommerce demo store")) Assert.assertTrue(true);
      else Assert.assertTrue(false);
        
      driver.quit();

    }
}
