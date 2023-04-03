package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.test.ui.MensajeTheApp.INPUT_MSJ;
import static com.test.ui.SetMensajeTheApp.INPUT_TEXTO;


public class SetEscribirMensajeTask implements Task {
    private String mensaje;
    public SetEscribirMensajeTask conElMsj(String mensaje){
        this.mensaje=mensaje;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(INPUT_TEXTO),
                Enter.theValue(mensaje).into(INPUT_TEXTO)
        );
    }

    public static SetEscribirMensajeTask  setEscribirMensajeTask() {return new SetEscribirMensajeTask();}
}