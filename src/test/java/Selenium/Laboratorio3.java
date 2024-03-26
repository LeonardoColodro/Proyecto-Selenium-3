package Selenium;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import javax.sound.sampled.SourceDataLine;

public class Laboratorio3 {
    WebDriver driver;
    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "..\\ProyectoSelenium-3\\Drivers\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @BeforeTest
    public void irUrl(){

    }

    @BeforeClass
    public void maxVentana(){

    }

    @Test(priority=1, description="Prueba Test")
    public void pruebaTest(){

    }


}
