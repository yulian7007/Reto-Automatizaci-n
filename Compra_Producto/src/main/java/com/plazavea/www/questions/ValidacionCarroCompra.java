package com.plazavea.www.questions;

import com.plazavea.www.userinterfaces.PlazaVeaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidacionCarroCompra implements Question<String> {


    public static ValidacionCarroCompra es() {
    return new ValidacionCarroCompra();
    }

    //Metodo para ejecutar acciones
    @Override
    public String answeredBy(Actor actor) {
        //Obtener el String
        return Text.of(PlazaVeaHomePage.LBL_ValidacionCarroCOmpra).viewedBy(actor).asString();
    }
}
