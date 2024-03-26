package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class AppTest_02 {
    protected WebDriver driver;
    @Test
    public void selenium() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "..\\ProyectoSelenium-3\\Drivers\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        String Titulo = "Google";
        String aTitulo = "";
        //Lanzar Chrome y redirecciona a la base URL
        driver.get("http://www.google.com");
        //Maximizar la ventana del navegador
        driver.manage().window().maximize();
        //Aca obtiene el valor actual con el titulo esperado
        aTitulo = driver.getTitle();
        if (aTitulo.equals(Titulo))
        {
            System.out.println("La prueba ha pasado");
        }
        else {
            System.out.println("La prueba ha fallado");
        }
        WebElement txtGoogle;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        txtGoogle= wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        txtGoogle= driver.findElement(By.name("q"));
        txtGoogle.sendKeys("Tutorial selenium");
        driver.close();
    }
}
