package Selenium;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Laboratorio2 {
    @Test
    public void lab2_E1Test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "..\\ProyectoSelenium-3\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();

        WebElement txtEmail = driver.findElement(By.id("email_create"));
        txtEmail.sendKeys("micorreo" + Math.random() + "@correo.com");
        WebElement btnCreate = driver.findElement(By.id("SubmitCreate"));
        btnCreate.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement btnGender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
        btnGender.click();

        WebElement txtCustomerName = driver.findElement(By.name("customer_firstname"));
        txtCustomerName.sendKeys("Juan");

        WebElement txtPassword = driver.findElement(By.id("passwd"));
        txtPassword.sendKeys("pass1237");

        Select drpMonths = new Select(driver.findElement(By.id("months")));
        drpMonths.selectByValue("4");

        WebElement btnRegister = driver.findElement(By.id("submitAccount"));
        btnRegister.click();

        //Validando que la pagina actual sea contra lo que el driver considere que sea la pagina actualmente donde esta parado
        Assert.assertEquals("http://www.automationpractice.pl/index.php?controller=authentication",driver.getCurrentUrl());

        //driver.quit(); // Usar quit() en lugar de close() para cerrar todas las ventanas del navegador
    }
}
