Feature: Casos de prueba en la página web JPetStore

  Como Tester automatizador en JPetStore
  Quiero realizar pruebas buscando productos
  Para verificar que la funcionalidad de busqueda esta funcionando correctamente

  @CP01-Search
    #OpenJPetStoreSteps
  Scenario: Probar abrir JPetStore y buscar sin ingresar texto
    Given Angel tiene acceso a la JPetStore
    When da click en buscar