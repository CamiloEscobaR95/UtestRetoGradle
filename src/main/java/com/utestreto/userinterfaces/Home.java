package com.utestreto.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url")
public class Home extends PageObject {

    public static  final Target BTN_UNETE_HOY = Target.the("Boton para crear un nuevo registro").locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");

}
