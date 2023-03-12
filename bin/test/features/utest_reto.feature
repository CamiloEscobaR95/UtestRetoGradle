@CP_GLOBAL
Feature: Yo como usuario de Utest
  quiero llenar un nuevo registro
  para acceder como usuario

  Background:
    Given el usuario ingresa a home page

  @CP_001
  Scenario Outline: Creacion satifactoria de usuario
    When  el usuario crea una cuenta de registro <nombre> <apellido> <correo> <mes> <dia> <ano> <pc> <version_pc> <idioma_pc> <dispositivo> <modelo_dispo> <sistema_dispo> <password> <confirm_pass>
    Then  el usuario vera su nombre de usuario

    Examples:
      | nombre | apellido | correo               | mes    | dia | ano  | pc      | version_pc | idioma_pc | dispositivo | modelo_dispo | sistema_dispo | password   | confirm_pass |
      | camilo | Gonzales | caamilonesssc@gmial.com | August | 12  | 2000 | Windows | 10         | Spanish   | Apple       | iPhone       | "iOS 2.0"     | Camilo123* | Camilo123*   |

  @CP_002
  Scenario Outline: Login de usuario
    When el usuario hace login <correo> <password>
    Then el usuario podra ver su username

    Examples:
      | correo               | password   |
      | Caamilonesssc@gmial.com | Camilo123* |