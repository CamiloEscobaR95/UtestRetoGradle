package com.utestreto.stepdefinitions.login;

import com.utestreto.questions.registro.InicioSesion;
import com.utestreto.tasks.Login;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.CoreMatchers.equalTo;

public class LoginDefinitions {

    //@Managed(driver = "chrome")
    //WebDriver driver;


    @When("^el usuario hace login (.*) (.*)$")
    public void elUsuarioHaceLogin(String correo, String contrasena) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Login.loginCredencialesCorrectas(correo, contrasena)
        );

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(InicioSesion.validarInicioSesion(correo), equalTo(correo))
        );

    }

    @Then("^el usuario podra ver su username$")
    public void elUsuarioPodraVerSuUsername() {

    }
}
