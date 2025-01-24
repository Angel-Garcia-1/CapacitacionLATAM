@FeatureLogin
Feature:Ingreso a pagina web

  Como usuario

  # ************************************** Pagina Principal *********************************************** #

  @Ingreso
   #ButtonForgotPasswordSteps
  Scenario: Ingreso a pagina Web
    Given Usuario tiene acceso a la URL


    @ValidarCampos
    #ValidateFieldsSteps
    Scenario: Validar campos de la pagina
        Given Usuario tiene acceso a la URL
        When Usuario visualiza los campos de la pagina
        Then Usuario visualiza los campos de la pagina
            | Campo 1 | Campo 2 |
            | Usuario | Clave   |

    @ValidarBotonIngresar