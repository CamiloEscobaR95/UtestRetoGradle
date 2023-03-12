package com.utestreto.questions.registro;

import com.utestreto.userinterfaces.login.LoginI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class InicioSesion implements Question<String> {

    private final String correo;

    public InicioSesion(String correo) {
        this.correo = correo;
    }

    public static InicioSesion validarInicioSesion(String correo) {

        return new InicioSesion(correo);
    }


    @Override
    public String answeredBy(Actor actor) {
        String strCorreo;
        strCorreo = Text.of(LoginI.USER_NAME.of(correo.toLowerCase())).viewedBy(actor).asString();
        strCorreo.toLowerCase();
        return strCorreo;
    }
}
