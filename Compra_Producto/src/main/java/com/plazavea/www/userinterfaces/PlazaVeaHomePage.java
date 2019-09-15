package com.plazavea.www.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//Definir la Url
@DefaultUrl("https://www.plazavea.com.pe/")

public class PlazaVeaHomePage extends PageObject {

    //Identificación de los objetos
    public static final Target TXT_Busqueda = Target.the("Campo busqueda de productos").located(By.id("search_box"));
    public static final Target BTN_Ofertas = Target.the("Boton para rechazar ofertas").located(By.id("onesignal-popover-cancel-button"));
    public static final Target BTN_Producto = Target.the("Boton Producto a comprar").located(By.xpath("//body[@class='PWA F-MainHome h-no-scroll']/div[@class='GeneralWrapper']/header[@class='Header']/div[@class='Header__top']/section[@class='Header__top__search']/div[@id='search']/div[@id='search']/div[@class='Search__content']/div[@class='Search__result']/div[@class='Search__result__content']/div[@class='SuggestionList']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@class='simplebar-content-wrapper']/div[@class='simplebar-content']/div[@class='SuggestionList__content']/div[@class='SuggestionList__block']/div[@class='SuggestionList__grid']/div[@class='SuggestionList__group']/div[2]/div[2]/a[1]"));
    public static final Target BTN_AgregarCarro = Target.the("Boton para agregar al carro de compra").located(By.id("ProductCard__add-to-cart"));
    public static final Target BTN_CarroDeCompra = Target.the("Boton para visualizar el carro de compa").located(By.xpath("//div[@class='cart__number']"));

    public static final Target LBL_ValidacionCarroCOmpra = Target.the("Label donde se encuentra el mensaje de agregado al carro de compra").located(By.xpath("//div[@class='minicart__alert chk']"));

}
