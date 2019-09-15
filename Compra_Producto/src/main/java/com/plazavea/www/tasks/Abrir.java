package com.plazavea.www.tasks;

import com.plazavea.www.userinterfaces.PlazaVeaHomePage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

private PlazaVeaHomePage plazaVeaHomePage;

    //Metodo para ejecutar acciones
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(plazaVeaHomePage));
    }


    public static Abrir laPaginaPlazavea() {
        return Tasks.instrumented(Abrir.class);
    }
}
