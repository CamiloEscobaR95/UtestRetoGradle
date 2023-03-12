package com.utestreto.userinterfaces.registro;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {
    public static final Target YOUR_COMPUTER =Target.the("Boton Computer").locatedBy("(//div[@class='ui-select-box'])[1]");
    public static final Target SISTEMA_OPERA =Target.the("Sitema operativo lista").locatedBy("//div[contains(text(), '{0}')]");

    public static final Target BTN_VERSION =Target.the("Boton Computer").locatedBy("(//div[@class='ui-select-box'])[2]");
    public static final Target VERSION =Target.the("Sitema operativo lista").locatedBy("//div[contains(text(), '{0}')]");

    public static final Target BTN_IDIOMA =Target.the("Boton Computer").locatedBy("(//div[@class='ui-select-box'])[3]");
    public static final Target IDIOMA =Target.the("Sitema operativo lista").locatedBy("//div[contains(text(), '{0}')]");

    public static final Target BTN_DISPOSITIVO =Target.the("Boton Computer").locatedBy("(//div[@class='ui-select-box'])[4]");
    public static final Target DISPOSITIVO =Target.the("Sitema operativo lista").locatedBy("//div[contains(text(), '{0}')]");

    public static final Target BTN_MODEL =Target.the("Boton Computer").locatedBy("(//div[@class='ui-select-box'])[5]");
    public static final Target MODELO =Target.the("Sitema operativo lista").locatedBy("//div[contains(text(), '{0}')]");

    public static final Target BTN_OPERATING_SYSTEM =Target.the("Boton Computer").locatedBy("(//div[@class='ui-select-box'])[6]");
    public static final Target SISTEMA_DISPO =Target.the("Sitema operativo lista").locatedBy("//div[contains(text(), '{0}')]");

    public static final Target BTN_SIG_DEVICE =Target.the("Sitema operativo lista").locatedBy("//a[@class='btn btn-blue pull-right']");

}
