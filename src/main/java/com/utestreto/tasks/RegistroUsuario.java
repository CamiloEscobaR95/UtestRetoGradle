package com.utestreto.tasks;

import com.utestreto.models.CreacionDeUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.utestreto.userinterfaces.Home.BTN_UNETE_HOY;
import static com.utestreto.userinterfaces.registro.Address.BTN_SIG_ADDR;
import static com.utestreto.userinterfaces.registro.Complete.*;
import static com.utestreto.userinterfaces.registro.Devices.*;
import static com.utestreto.userinterfaces.registro.Personal.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistroUsuario implements Task {

    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String mes;
    private final String dia;
    private final String ano;
    private final String pc;
    private final String versionPc;
    private final String idiomaPc;
    private final String dispositivo;
    private final String modelo_dispositivo;
    private final String sistema_dispo;
    private final String password;
    private final String confirmPass;


    public RegistroUsuario(String nombre, String apellido, String correo, String mes, String dia, String ano, String pc, String versionPc, String idiomaPc, String dispositivo, String modelo_dispositivo, String sistema_dispo, String password, String confirmPass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
        this.pc = pc;
        this.versionPc = versionPc;
        this.idiomaPc = idiomaPc;
        this.dispositivo = dispositivo;
        this.modelo_dispositivo = modelo_dispositivo;
        this.sistema_dispo = sistema_dispo;
        this.password = password;
        this.confirmPass = confirmPass;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(BTN_UNETE_HOY),
                Enter.theValue(nombre).into(INPUT_NAME),
                Enter.theValue(apellido).into(INPUT_APELLIDO),
                Enter.theValue(correo).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(mes).from(SELECT_MES),
                SelectFromOptions.byVisibleText(dia).from(SELECT_DIA),
                SelectFromOptions.byVisibleText(ano).from(SELECT_ANO),
                WaitUntil.the(BTN_SIGUIENTE, isVisible()),    // espera de elemento cvisible
                Click.on(BTN_SIGUIENTE)


        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Click.on(BTN_SIG_ADDR)
        );

        actor.attemptsTo(
                Click.on(YOUR_COMPUTER),
                Click.on(SISTEMA_OPERA.of(pc)),
                Click.on(BTN_VERSION),
                Click.on(VERSION.of(versionPc)),
                Click.on(BTN_IDIOMA),
                Click.on(IDIOMA.of(idiomaPc)),
                Click.on(BTN_DISPOSITIVO),
                Click.on(DISPOSITIVO.of(dispositivo)),
                Click.on(BTN_MODEL),
                Click.on(MODELO.of(modelo_dispositivo)),
                Click.on(BTN_OPERATING_SYSTEM),
                Click.on(SISTEMA_DISPO.of(sistema_dispo)),
                Click.on(BTN_SIG_DEVICE)
        );

        actor.attemptsTo(
                Click.on(INPUT_PASS),
                Enter.theValue(password).into(INPUT_PASS),
                Click.on(INPUT_CONFIRM_PASS),
                Enter.theValue(confirmPass).into(INPUT_CONFIRM_PASS),
                Click.on(CHECK_ONE),
                Click.on(CHECK_TWO),
                Click.on(BTN_COMPLETE)
        );

    }

    public static RegistroUsuario registrarUsuario(String nombre, String apellido, String correo, String mes, String dia,
                                                   String ano, String pc, String versionPc, String idiomaPc, String dispositivo,
                                                   String modelo_dispo, String sistema_dispo, String password, String confirmPass) {

        return instrumented(RegistroUsuario.class, nombre, apellido, correo, mes, dia, ano, pc, versionPc, idiomaPc, dispositivo, modelo_dispo,
                sistema_dispo, password, confirmPass);
    }
}