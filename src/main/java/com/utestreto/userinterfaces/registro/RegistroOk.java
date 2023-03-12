package com.utestreto.userinterfaces.registro;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroOk {
    public static final Target MENSAJE_BIENVENIDA =Target.the("Mensaje de bienvenida").locatedBy("//h1[contains(text(),'Welcome')]");
}
