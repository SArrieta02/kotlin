package `16_Funciones_parametro_por_defecto`

/*Confeccionar una función que reciba entre 2 y 5 enteros. La misma nos debe retornar la suma de dichos valores. Debe tener tres parametros por defecto*/
fun suma(n : Int = 2, sumInicial : Int = 0, num1: Int = 0): Int     {
    var total = sumInicial + num1
    for ( i in 1 .. n) {
        println("Digite un valor:")
        val num = readln().toInt()
        total += num
    }
    return total
}
fun main(){
    println ("Digite entre 2 y 5 digitos")
    println("Cuantos digitos desea ingresar:")
    val num = readln().toInt()
    if (num < 2){
        print("Digite 2 o más valores")
    }else {
        val total= suma(num)
        println("La suma total de todos los digitos es: $total")
    }
}