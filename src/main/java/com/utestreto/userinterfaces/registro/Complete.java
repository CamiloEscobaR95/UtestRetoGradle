package com.utestreto.userinterfaces.registro;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Complete {

    public static final Target INPUT_PASS =Target.the("Input pass").locatedBy("//input[@id='password']");
    public static final Target INPUT_CONFIRM_PASS =Target.the("Input Confirm pass").locatedBy("//input[@id='confirmPassword']");
    public static final Target CHECK_ONE =Target.the("Input pass").locatedBy("(//span[@class='checkmark signup-consent__checkbox error'])[1]");
    public static final Target CHECK_TWO =Target.the("Input pass").locatedBy("//span[@ng-class='{error: userForm.privacySetting.$error.required}']");
    public static final Target BTN_COMPLETE =Target.the("Input pass").located(By.id("laddaBtn"));
}
