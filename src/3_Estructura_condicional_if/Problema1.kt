package `3_Estructura_condicional_if`

/*Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".*/
fun main () {
    print("Ingrese su primera nota:")
    val nota1: Int = readln() .toInt()
    print("Ingrese su segunda nota:")
    val nota2: Int = readln() .toInt()
    print("Ingrese su tercera nota:")
    val nota3: Int = readln() .toInt()
    val promedio: Int = nota1 + nota2+ nota3 /3
    if (nota1 > 7) {
        print("Promocionado")
    }

}

