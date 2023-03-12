package com.utestreto.userinterfaces.registro;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {

    public static final Target INPUT_NAME =Target.the("Input para nombre de usuario").locatedBy("//input[@id='firstName']");
    public static final Target INPUT_APELLIDO =Target.the("Input para apellido de usuario").locatedBy("//input[@id='lastName']");
    public static final Target INPUT_EMAIL =Target.the("Input para email de usuario").locatedBy("//input[@id='email']");
    public static final Target SELECT_MES =Target.the("Select mes de nacimiento").locatedBy("//select[@id='birthMonth']");
    public static final Target SELECT_DIA =Target.the("Select dia de nacimiento").locatedBy("//select[@id='birthDay']");
    public static final Target SELECT_ANO =Target.the("Select año de nacimiento").locatedBy("//select[@id='birthYear']");
    public static final Target BTN_SIGUIENTE =Target.the("Boton siguiente").locatedBy("//a[@class='btn btn-blue']");
}
