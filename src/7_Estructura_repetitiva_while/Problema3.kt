package `7_Estructura_repetitiva_while`

/* En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
Además el programa deberá informar el importe que gasta la empresa en sueldos al personal.
 */
fun main(){
    print("Cuantos empleados son:")
    val n = readln(). toInt()
    var x = 1
    var sueldo1 = 0
    var sueldo2 = 0
    var resta = 0
    while (x<=n) {
        print("Escriba el sueldo del empleado:")
        val sueldo = readln(). toInt()
        if(sueldo <= 300) {
            sueldo1 = sueldo1 + 1
            resta = resta + sueldo
        }else{
            sueldo2 = sueldo2 + 1
            resta = resta + sueldo
        }
        x = x + 1
    }
    println("Los empleados que cobran entre $100 y $300 son: $sueldo1")
    println("Los empleados que cobran más de $300 son: $sueldo2")
    println("Lo que gasta la empresa en sueldos es: $resta")
}