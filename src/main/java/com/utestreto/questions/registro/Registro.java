package com.utestreto.questions.registro;

import com.utestreto.userinterfaces.registro.RegistroOk;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;


public class Registro implements Question<Boolean> {

    private static Boolean respuesta = false;

    public Registro(boolean respuesta) {
        Registro.respuesta = respuesta;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(Visibility.of(RegistroOk.MENSAJE_BIENVENIDA).viewedBy(actor).asBoolean()) {
        respuesta = true;
        }else {
            respuesta = false;
        }
        return respuesta;
    }

    public static Registro validarRegistro(boolean respuesta) {
        return  new Registro(respuesta);
    }
}
