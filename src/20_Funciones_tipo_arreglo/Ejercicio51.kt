package `20_Funciones_tipo_arreglo`

fun cargar(arreglo: IntArray){
    for (i in arreglo.indices){
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
}
fun imprimir(arreglo: IntArray){
    for (elemento in arreglo)
        println(elemento)
}
fun main(){
    val arre = IntArray (5)
    cargar(arre)
    imprimir(arre)
}