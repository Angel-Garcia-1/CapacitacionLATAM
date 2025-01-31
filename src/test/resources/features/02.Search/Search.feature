@Search
Feature: Casos de prueba en la página web JPetStore

  Como Tester automatizador en JPetStore
  Quiero realizar pruebas buscando productos
  Para verificar que la funcionalidad de busqueda esta funcionando correctamente

  @CP01-Search
    #OpenJPetStoreSteps
  Scenario: Probar abrir JPetStore y buscar sin ingresar texto
    Given Angel tiene acceso a la JPetStore
    When da click en buscar

  @CP02-Search
    #SuccessSearchSteps
  Scenario: Probar el correcto funcionamiento del cuadro de texto y botón "Buscar"
    Given Angel tiene acceso a la JPetStore
    When ingresa un texto en el cuadro de búsqueda
      | Persian |
    Then verificar que se presente el codigo del producto
      | FL-DLH-02 |
