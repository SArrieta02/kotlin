package `19_Arreglos`

fun main(){
    val arreglo =  IntArray(10)
    for ( i in arreglo.indices){
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    println("Primera componente del arreglo ${arreglo[0]}")
    println("Ultimo componente del arreglo ${arreglo[arreglo.lastIndex]}")
}