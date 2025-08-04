package `24_POO_Colaboracion_clases`

/*Problema 3
Objetivo:
Simular el encendido de un motor y el comportamiento de un carro que solo puede conducirse si el motor está encendido.
🔹 Clase Motor
Atributos:
encendido: Boolean → indica si el motor está activo.
Métodos:
encender()
Cambia el estado a true y muestra un mensaje.
apagar()
Cambia el estado a false y muestra un mensaje.
estado()
Muestra si el motor está encendido o apagado.

🔹 Clase Carro
Atributos:
motor: Motor → instancia de la clase Motor.
Métodos:
conducir()
Solo permite "conducir" si el motor está encendido.
Si está apagado, impide avanzar e imprime un mensaje.
estadoGeneral()
Muestra el estado actual del motor llamando al método estado().


🔹 Lógica de colaboración:
El Carro depende del comportamiento del Motor, lo que demuestra una clara relación de composición, donde una clase contiene y controla a otra.
*/

class Motor(var encendido: Boolean){
    fun encender(){
        encendido = true
        println("El motor se a encendido")
        println("Si puede conducir")
    }
    fun apagar(){
        encendido = false
        println("El motor esta apagado")
        println("No puede conducir")
        encender()
    }
    fun estado(){
        if (encendido == true){
            println("El estado del motor es encendido")
        }else{
            println("El estado del motor es apagado")
        }
    }
}
class Carro{
    val motor: Motor = Motor(false)

    fun conducir(){
        motor.apagar()
    }
    fun estadoGeneral(){
        motor.estado()
    }
}
fun main(){
    val carro = Carro()
    carro.conducir()
    carro.estadoGeneral()
}