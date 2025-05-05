package `8_Estructura_Repetitiva_doWhile`

/* En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce:
número de cuenta y saldo actual.
El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
Estado de la cuenta	'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.

b) La suma total de los saldos acreedores.

*/
fun main() {
    var cuenta = 0
    var acreedor = 0
    var saldo = 0
    do {
        println("Escriba el número de cuenta:")
        val cuenta = readln().toInt()
        if (cuenta > 0) {
            print("Escriba el saldo actual de la cuenta:")
            saldo = readln().toInt()
        }
        if (cuenta > 0) {
            println("El número de cuenta es: $cuenta")
            println("El saldo de la cuenta es: $saldo")
        } else {
            println("No existe ese número de cuenta")
        }
        if (cuenta > 0)
            if (saldo > 0) {
                println("El estado de la cuenta es Acreedor")
                acreedor += saldo
            } else if (saldo < 0) {
                println("El estado de la cuenta es Deudor")
            } else {
                println("El saldo es Nulo")
            }
    } while (cuenta >= 0)
    println("El total de las cuentas de acreedor es: $acreedor")
}