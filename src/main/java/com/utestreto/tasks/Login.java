package com.utestreto.tasks;

import com.utestreto.userinterfaces.login.LoginI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String correo;
    private final String contrasena;

    public Login(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginI.BTN_LOG_IN),
                Enter.theValue(correo).into(LoginI.INPUT_USERNAME),
                Enter.theValue(contrasena).into(LoginI.INPUT_PASSWORD),
                Click.on(LoginI.BTN_SIG_IN)
        );
    }

    public static Login loginCredencialesCorrectas(String correo, String contrasena) {
        return instrumented(Login.class, correo, contrasena);
    }


}
