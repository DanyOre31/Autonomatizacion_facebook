package pageobjects;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class loginFacebook extends util {
    @FindBy(name = "email") protected WebElement txtEmail;
    @FindBy(name = "pass") protected WebElement txtPass;
    @FindBy(name = "login") protected WebElement btnLogin;

    @FindBy(name = "global_typeahead") protected WebElement txtBuscar;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/ul/li[1]") protected WebElement lblBusqueda;

    @FindBy(id = "mount_0_0_KV") protected WebElement pagPerfil;


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
        wait.until(ExpectedConditions.elementToBeClickable(txtBuscar));
        txtBuscar.sendKeys("Freddy VP");
        wait.until(ExpectedConditions.elementToBeClickable(lblBusqueda));
        lblBusqueda.click();
    }
    public void mostrarPerfil(){
        wait.until(ExpectedConditions.visibilityOf(pagPerfil));
    }
}
