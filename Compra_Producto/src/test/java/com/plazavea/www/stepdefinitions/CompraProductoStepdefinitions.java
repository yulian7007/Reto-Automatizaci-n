package com.plazavea.www.stepdefinitions;

import com.plazavea.www.models.DatosP;
import com.plazavea.www.questions.ValidacionCarroCompra;
import com.plazavea.www.tasks.Abrir;
import com.plazavea.www.tasks.AgregarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CompraProductoStepdefinitions {

    //Crear Actores y configuración Inicial
    @Managed (driver = "chrome")
    private WebDriver herBrowser;
    private Actor usuario = Actor.named("Usuario");

    //Habilidad de navegar a nuestro actor
    @Before
    public void setUp(){
        usuario.can(BrowseTheWeb.with(herBrowser));
        herBrowser.manage().window().maximize();
    }

    @Given("^que el usuario quiere comprar un producto$")
    public void queElUsuarioQuiereComprarUnProducto() {
        usuario.wasAbleTo(Abrir.laPaginaPlazavea());
    }


    @When("^agrega el producto al carro de compras$")
    public void agregaElProductoAlCarroDeCompras(List<DatosP> datosP) {
        usuario.attemptsTo(AgregarProducto.carroDeCompra(datosP));
    }


    @Then("^vizualiza que se cargo correctamente con el mensaje (.*)$")
    public void vizualizaQueSeCargoCorrectamente(String textoValidacion) {
    usuario.should(GivenWhenThen.seeThat(ValidacionCarroCompra.es(), Matchers.containsString(textoValidacion)));
    }



}
