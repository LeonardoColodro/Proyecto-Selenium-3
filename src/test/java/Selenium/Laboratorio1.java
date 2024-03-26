package Selenium;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class Laboratorio1 {
    @Test @Ignore
    public void lab1_test(){
        System.out.println("Prueba jdk");
    }
    @Test @Ignore
    public void lab1_E1(){
        System.setProperty("webdriver.chrome.driver", "..\\ProyectoSelenium-3\\Drivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions opcitions=new ChromeOptions();
        opcitions.addArguments("remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(opcitions);
        driver.get("http://www.automationpractice.pl/index.php");
        //driver.navigate().to("http://www.automationpractice.pl/index.php"); //Opcion navigete
        driver.manage().window().maximize();
        driver.close();
    }
    @Test @Ignore
    public void lab2_E3(){
        System.setProperty("webdriver.chrome.driver", "..\\ProyectoSelenium-3\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.automationpractice.pl/index.php");
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        WebElement txtBuscar=  driver.findElement(By.id("search_query_top"));
        txtBuscar.clear();
        txtBuscar.sendKeys("Blouse");
        txtBuscar.sendKeys(Keys.ENTER);
        driver.close();
    }

    @Test @Ignore
    public void lab2_E3b(){
        System.setProperty("webdriver.chrome.driver", "..\\ProyectoSelenium-3\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.automationpractice.pl/index.php");
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        WebElement txtBuscar=  driver.findElement(By.name("search_query"));
        txtBuscar.clear();
        txtBuscar.sendKeys("Blouse");
        txtBuscar.sendKeys(Keys.ENTER);
        driver.close();
    }

    @Test
    public void lab2_E3c(){
        System.setProperty("webdriver.chrome.driver", "..\\ProyectoSelenium-3\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.automationpractice.pl/index.php");
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        WebElement txtBuscar=  driver.findElement(By.cssSelector("#search_query_top"));
        txtBuscar.clear();
        txtBuscar.sendKeys("Blouse");
        txtBuscar.sendKeys(Keys.ENTER);
        driver.close();
    }
}
