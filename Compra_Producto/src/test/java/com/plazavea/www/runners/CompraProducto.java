package com.plazavea.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//Generar los métodos que deben ser agregados a la StepDefinition
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src\\test\\resources\\com.plazavea.www.features\\compraProducto.feature",
        tags = "@CompraProducto",
        glue = "com\\plazavea\\www\\stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class CompraProducto {
}
