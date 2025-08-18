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

class SensorTemperatura{

    private var temperatura: Double = 0.0

    fun configurarTemperatura(){
        var menu: Int = 0
        print("Digite la temperatura:")
        temperatura = readln().toDouble()
        val validacion: Boolean = validarRango(temperatura)
        if(validacion == true){
            do {
                println("Digite 1 para aumentar la temperatura")
                println("Digite 2 para disminuir la temperatura")
                println("Digite 3 para mostrar la temperatura")
                println("Digite 4 para salir")
                menu = readln().toInt()
                when(menu){
                    1 -> aumentar()
                    2 -> disminuir()
                    3 -> mostrar()
                }
            }while (menu != 4)
        }else{
            print("Error")
        }

    }

    fun aumentar(){
        var delta: Double = 0.0
        println("Cuanto deseea aumentar")
        delta = readln().toDouble()
        val validacion: Boolean = validarRango(delta)
        if (validacion == true){
            temperatura += delta
        }else{
            print("Error no se puede aumentar la temperatura")
        }
    }

    fun disminuir(){
        var delta: Double = 0.0
        println("Cuanto deseea disminuir")
        delta = readln().toDouble()
        val validacion: Boolean = validarRango(delta)
        if (validacion == true){
            temperatura -= delta
        }else{
            print("Error no se puede disminuir la temperatura")
        }
    }


    fun mostrar(){
        println("La temperatura es de °C$temperatura")
    }

    private fun validarRango(valor:Double): Boolean{
        if(valor >= -50.0 && valor <= 150.0){
            return true
        }else{
            return false
        }
    }
}

fun main(){
    val Sensor = SensorTemperatura()
    Sensor.configurarTemperatura()
}