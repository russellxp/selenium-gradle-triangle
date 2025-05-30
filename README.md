# CRITERIOS
## 1. Pruebas Realizadas
Considero que la parte más crucial es la comparación con los resultados esperados. Gracias al uso de Scenario Outline con Examples, podemos cubrir múltiples casos de prueba de manera eficiente. Tuve dificultades para capturar directamente el resultado, por lo que opté por extraerlo desde la consola, donde se muestra el mensaje según la lógica implementada.

## 2. Casos de Prueba
Se consideraron tanto escenarios Happy Path (casos esperados y válidos) como Unhappy Path (casos negativos o inválidos).

## 3. Caso a Automatizar
El escenario definido en el proyecto mediante Scenario Outline permite cubrir prácticamente todas las casuísticas posibles relacionadas con la clasificación de triángulos.

## 4. Criterios de Aceptación
- Acceso a internet habilitado.
- La página debe estar disponible.
- Se deben poder ingresar los tres lados del triángulo.

## 5. Ejecución de Casos de Prueba
- Abrir una terminal desde el proyecto o el IDE.
- Ejecutar el siguiente comando: **gradle** **test**
- Al finalizar, se genera un reporte. La ruta del reporte aparece en la terminal al terminar la ejecución

## 6. Sugerencias
- Se identificó que el mensaje de resultado se imprime en consola a través de un console.log.
- El servicio parece funcionar como una operación tipo GET, pero no devuelve nada en el response, solo el código 200 OK.
- Se sugiere que el sistema devuelva un mensaje más claro indicando éxito o error, que pueda ser capturado directamente desde el HTML (no solo en consola).



## **NOTA**
- Se dejo un workflow en github Action 
### Parece que bloqueé o saturé la página de pruebas. Actualmente ya no me carga en ningún dispositivo. 😕
- Capturea:
https://prnt.sc/lqv7Npd4MerZ

- Pagina original
https://www.developsense.com/triangle/triangle.html




