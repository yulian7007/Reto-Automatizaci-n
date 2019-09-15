package com.plazavea.www.tasks;

import com.plazavea.www.models.DatosP;
import com.plazavea.www.userinterfaces.PlazaVeaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class AgregarProducto implements Task {

    private List<DatosP>datosP;

    //Metodo constructor List<DatosP>datosP
    public AgregarProducto(List<DatosP> datosP) {
        this.datosP = datosP;
    }

    //Metodo para ejecutar acciones
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datosP.get(0).getProducto()).into(PlazaVeaHomePage.TXT_Busqueda));
        actor.attemptsTo(Click.on(PlazaVeaHomePage.BTN_Producto));
        actor.attemptsTo(Click.on(PlazaVeaHomePage.BTN_AgregarCarro));
        actor.attemptsTo(Click.on(PlazaVeaHomePage.BTN_CarroDeCompra));

    }

    public static AgregarProducto carroDeCompra(List<DatosP> datosP) {
        return Tasks.instrumented(AgregarProducto.class, datosP);
    }
}

