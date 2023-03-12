package com.utestreto.userinterfaces.login;


import net.serenitybdd.screenplay.targets.Target;

public class LoginI {

    public static final Target BTN_LOG_IN = Target.the("Boton para hacer logIn").locatedBy("(//a[contains(text(),'Log In')])[1]");
    public static final Target INPUT_USERNAME = Target.the("Ingreso de username").locatedBy("//input[@name='username']");
    public static final Target INPUT_PASSWORD = Target.the("Ingreso de contraseña").locatedBy("//input[@name='password']");
    public static final Target BTN_SIG_IN = Target.the("Boton sig in").locatedBy("//button[@name='login']");
    public static final Target USER_NAME = Target.the("Label de user name").locatedBy("//span[contains(text(),'{0}')]");
}
//span[contains(text(),'camilonesc@gmial.com')]