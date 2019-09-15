#Autor: yulian-guerrero7@hotmail.com
#Crear una historia de usuario

Feature: Comparar producto

  @CompraProducto
  Scenario:Comparar producto y agregarlo en el carro de compras
    Given que el usuario quiere comprar un producto
    When agrega el producto al carro de compras
      | producto  |
      | televisor |
    Then vizualiza que se cargo correctamente con el mensaje Listo para comprar