package `7_Estructura_repetitiva_while`

/*Escribir un programa que solicite ingresar 10 notas de alumnos y nos
informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.*/
fun main(){
    var x = 0
    var notas_mayores = 0

    var notas_menores = 0
    while (x <= 9) {
        print("Ingrese la nota:")
        var nota = readln().toInt()
        if (nota >= 7)
            notas_mayores = notas_mayores + 1
        else
            notas_menores = notas_menores + 1


        x = x + 1
        nota = 0
    }
println("Las notas mayores a 7 son: $notas_mayores")
println("Las notas menores a 7 son: $notas_menores")

}