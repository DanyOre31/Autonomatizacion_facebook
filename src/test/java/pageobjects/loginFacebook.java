package pageobjects;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;


public class loginFacebook extends util {
    @FindBy(name = "email") protected WebElement txtEmail;
    @FindBy(name = "pass") protected WebElement txtPass;
    @FindBy(name = "login") protected WebElement btnLogin;

    @FindBy(name = "global_typeahead") protected WebElement txtBuscar;

    public loginFacebook() {
        PageFactory.initElements(driver, this);
    }
    public void clickIniciarSesion(){
        wait.until(ExpectedConditions.elementToBeClickable(txtEmail));
        txtEmail.sendKeys("20144737@sistemasunica.edu.pe");
        txtPass.sendKeys("tu_contraseña");
        btnLogin.click();
    }
    public void  buscarPerfil(){
        //Alert alert = driver.switchTo().alert();
        //alert.accept();
        System.out.println("hola");
        txtBuscar.sendKeys("Freddy VP");
    }
}
