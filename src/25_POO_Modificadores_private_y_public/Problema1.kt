package `25_POO_Modificadores_private_y_public`

/*Problema 1
CuentaBancaria — Encapsular estado y validar operaciones
¿Qué se busca?
Proteger el saldo para que nadie lo modifique directamente.
Exponer solo operaciones válidas: depositar, retirar, consultar.

Pasos para hacerlo
Estado privado: crea private var saldo: Int = 0.

API pública mínima:
depositar(monto: Int): verifica que monto > 0. Si no, mensaje de error.
retirar(monto: Int): verifica que monto > 0 y que saldo >= monto. Si no, mensaje.
consultarSaldo(): imprime el saldo actual.

Helpers(Métodos) privados:
montoValido(monto: Int): devuelve true si monto > 0.
puedeRetirar(monto: Int): devuelve true si alcanza el saldo.
(Opcional) registrarOperacion(texto: String): centraliza impresiones de auditoría.
Demostración: en main, haz un flujo de operaciones: dos depósitos, un retiro válido, un retiro inválido, y consulta final.*/

class CuentaBancaria{
    private var saldo: Int = 1000

    fun depositar (){
        var monto: Int = 0
        print("Cuanto deseea depositar?")
        monto = readln().toInt()
        var validacion: Boolean = montoValido(monto)
        if (validacion == true){
        saldo += monto
        }else{
            println("Error no se puede depositar esa cantidad")
            println("**********")
        }
    }

    fun retirar(){
        var monto: Int = 0
        print("Cuanto deseea retirar?")
        monto = readln().toInt()
        var validacion: Boolean = puedeRetirar(monto)
        if (validacion == true){
            saldo -= monto
        }else{
            println("Error no puede retirar esa cantidad")
            println("**********")
        }
    }

    fun consultarSaldo(){
        println("Su saldo es de ₡$saldo")
        println("**********")
    }

    private fun montoValido(monto: Int): Boolean {
        var validacion: Boolean
        if (monto > 0) {
            validacion = true
        }else{
            validacion = false
        }
        return validacion
    }

    private fun puedeRetirar(monto: Int ): Boolean{
        var validacion: Boolean
        if (monto > 0 && saldo >= monto){
            validacion = true
        }else{
            validacion = false
        }
        return validacion
    }

}
fun main(){
    val cuentabancaria1 = CuentaBancaria()
    var menu: Int = 0
    do {
        println("Digite 1 para depositar")
        println("Digite 2 para retirar")
        println("Digite 3 para consultar saldo")
        println("Digite 4 para salir")
        menu = readln().toInt()
        if(menu == 1){
            cuentabancaria1.depositar()
        }
        if(menu == 2){
            cuentabancaria1.retirar()
        }
        if(menu == 3){
            cuentabancaria1.consultarSaldo()
        }
    }while(menu != 4)

}
