package `20_Funciones_tipo_arreglo`

/*Cargar un arreglo de n elementos. Imprimir el menor elemento y un mensaje si se repite dentro del arreglo.
*/
fun elemento(): IntArray{
    print("Cuantos elementos deseea ingresar:")
    val contador = readln().toInt()
    val elementos = IntArray (contador)
    for (i in elementos.indices){
        print("Ingrese el elemento:")
        elementos[i] = readln().toInt()
    }
    return elementos
}
fun main(){
    val numeros = elemento()
    var suma = 0
    var NB: Int = 100
    for (i in numeros.indices){
        if(NB > numeros[i]) {
            NB = numeros[i]
        }
    }
    println("El número menor es: $NB")
    for (i in numeros.indices){
        if (NB == numeros[i]){
            suma ++
        }
    }
    if (suma >= 1){
        println("El número menor se repite")
    }


}