#Autor: yulian-guerrero7@hotmail.com

Feature: Comparar producto

  @CompraProducto
  Scenario:Comparar producto
    Given que el usuario quiere comprar un producto
    When agrega el producto al carro de compras
      | producto  |
      | televisor |
    Then vizualiza que se cargo correctamente con el mensaje Listo para comprar