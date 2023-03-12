package com.utestreto.stepdefinitions;

import com.utestreto.models.CreacionDeUsuario;
import com.utestreto.questions.registro.Registro;
import com.utestreto.tasks.RegistroUsuario;
import com.utestreto.userinterfaces.Home;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class UtestRetoDefinitions {


    private Home homePage = new Home();
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Camilo");
    }

    @Given("^el usuario ingresa a home page$")
    public void elUsuarioIngresaAHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(homePage));

    }

    @When("^el usuario crea una cuenta de registro (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) \"([^\"]*)\" (.*) (.*)$")
    public void elUsuarioCreaUnaCuentaDeRegistro(String nombre, String apellido, String correo, String mes, String dia,
                                                 String ano, String pc, String versionPc, String idiomaPc, String dispositivo,
                                                 String modelo_dispo, String sistema_dispo, String password, String confirmPasswor
                                                    )  {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                RegistroUsuario.registrarUsuario(nombre, apellido, correo, mes, dia, ano, pc, versionPc, idiomaPc, dispositivo,
                                                modelo_dispo, sistema_dispo, password, confirmPasswor

                )
        );



    }

    @Then("^el usuario vera su nombre de usuario$")
    public void elUsuarioVeraSuNombreDeUsuario()  {
        OnStage.theActorInTheSpotlight().should(
                seeThat(Registro.validarRegistro(true),
                        equalTo(true))
        );
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
