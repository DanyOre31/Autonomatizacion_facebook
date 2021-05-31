package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pageobjects.loginFacebook;

public class facebookDefinition {
    loginFacebook login;

    public facebookDefinition() {
        login = new loginFacebook();
    }

    @Dado("que tenemos el login correcto en facebook")
    public void queTenemosElLoginCorrectoEnFacebook() {
        hooks.driver.get("https://www.facebook.com/");
        login.clickIniciarSesion();
    }

    @Cuando("buscamos a un amigo en facebook")
    public void buscamosAUnAmigoEnFacebook() {
        login.buscarPerfil();
        login.mostrarPerfil();
    }
}
