Feature: Api example
  Como usuario de la API, quiero ejecutar una solicitud para obtener las respuestas adecuadas.

  Background:
    Given Mi cuenta creada en clockify y mi Api-Key generada
    And un workspace-id valido

  @PROJECT1
  Scenario Outline: Obtener las horas registradas en un proyecto
    And un user-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And status code <statusCode> is obtained
    Then valido que los campos no sean nulos

    Examples:
      | jsonName                    | statusCode | operation | entity     |
      | IntegradorApi/rqTimeEntries | 200        | GET       | INTEGRADOR |

  @PROJECT1
  Scenario Outline: Agregar horas a un proyecto resultado exitoso
    And un id de proyecto
    And una descripcion de las horas agregadas <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And status code <statusCode> is obtained
    And guardo el id de las horas agregadas
    Then Obtengo el nombre de las horas agregadas al proyecto <name>

    Examples:
      | operation | entity                   | name       | jsonName                       | statusCode |
      | POST      | INTEGRADOR_AGREGAR_HORAS | Prueba Api | IntegradorApi/rqAddTimeEntries | 201        |

  @PROJECT1
  Scenario Outline: Editar horas en un proyecto
    And un nuevo horario de comienzo <startTime>
    And un nuevo horario de finalizacion <endTime>
    And una descripcion de las horas agregadas <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And status code <statusCode> is obtained
    Then Obtengo el nombre de las horas modificadas al proyecto <name>

    Examples:
      | operation | entity                     | startTime            | endTime              | jsonName                          | name                | statusCode |
      | PUT       | INTEGRADOR_MODIFICAR_HORAS | 2021-11-06T14:00:37Z | 2021-11-06T20:01:41Z | IntegradorApi/rqUpdateTimeEntries | Prueba Api  modifie | 200        |


  @PROJECT1
  Scenario Outline: Eliminar horas registradas en un proyecto
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And status code <statusCode> is obtained
    Then no se obtuvo ningun response

    Examples:
      | jsonName                          | operation | entity                    | statusCode |
      | IntegradorApi/rqDeleteTimeEntries | DELETE    | INTEGRADOR_ELIMINAR_HORAS | 204        |
