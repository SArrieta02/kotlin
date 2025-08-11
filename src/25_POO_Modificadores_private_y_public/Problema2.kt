package `25_POO_Modificadores_private_y_public`

/*Problema 2
SensorTemperatura
Objetivo
Modelar un sensor que mide temperaturas en °C, protegiendo el valor interno y permitiendo solo operaciones controladas.


📌 Requerimientos
Clase SensorTemperatura con:
Propiedad privada temperatura: Double que almacene el valor actual del sensor.

Método público configurarTemperatura(valor: Double):
Debe usar un método privado validarRango(valor: Double) para permitir solo valores entre -50 y 150.
Si es válido, actualizar la temperatura.
Si es inválido, mostrar mensaje de error.

Método público aumentar(delta: Double):
Suma delta a la temperatura actual.
Antes de asignar, pasa por validarRango.

Método público disminuir(delta: Double):
Resta delta de la temperatura actual.
Antes de asignar, pasa por validarRango.

Método público mostrar():
Imprime la temperatura con 1 decimal.

Método privado validarRango(valor: Double): Boolean:
Retorna true si está dentro del rango permitido (-50 a 150), false en caso contrario.

*/