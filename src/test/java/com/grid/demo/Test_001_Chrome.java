package com.grid.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_001_Chrome {

    @Test
    public void testChrome() throws MalformedURLException {
        
    	System.out.println("---------------------Chrome------------------------");
        DesiredCapabilities capabilities= DesiredCapabilities.chrome();
     //   capabilities.setCapability("browser_version", "latest");
     //   caps.setCapability("os_version", "10");
        
        
        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);

        driver.get("https://frontend.nopcommerce.com/");

        String title = driver.getTitle();
        System.out.println("Title of the page: "+ title + "-> Chrome");

      if(title.equalsIgnoreCase("nopCommerce demo store")) Assert.assertTrue(true);
      else Assert.assertTrue(false);
        
      driver.quit();

    }


}
