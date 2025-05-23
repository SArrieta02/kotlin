package `14_Funciones_con_retorno`

/*En la función main del programa cargar los lados de dos rectángulos y luego mostrar cual de los dos tiene una superficie mayor.
*/
fun Mayor(v1 : Double, v2: Double, v3: Double , v4: Double): Double{
    val t1 = v1 * v2
    val t2 = v3 * v4
    if (t1 > t2) {
        print("El rectángulo con la superficie mayor es el primero con: $t1")
        return t1
    }else {
        print("El rectángulo con la superficie mayor es el segundo con: $t2")
        return t2
    }
}
fun main (){
    println("Ingrese los lados del primer rectángulo")
    print("Ingrese el primero lado:")
    val lado1 = readln().toDouble()
    print("Ingrese el segundo lado:")
    val lado2 = readln().toDouble()
    println("Ingrese los lados del segundo rectángulo")
    print("Ingrese el primero lado:")
    val lado3 = readln().toDouble()
    print("Ingrese el segundo lado:")
    val lado4 = readln().toDouble()
    Mayor(lado1, lado2, lado3, lado4)
}