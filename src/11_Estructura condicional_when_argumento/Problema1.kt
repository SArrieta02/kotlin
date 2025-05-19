package `11_Estructura condicional_when_argumento`

/*Realizar la carga de la cantidad de hijos de 10 familias. Contar cuántos tienen 0,1,2 o más hijos. Imprimir dichos contadores.*/
fun main(){
    var h0 = 0
    var h1 = 0
    var h2 = 0
    var hi = 0
    for (i in 1 .. 10) {
        print("Cuantos hijos tiene su familia:")
        val fam = readln().toInt()
        when (fam) {
            0 -> h0 ++
            1 -> h1 ++
            2 -> h2 ++
            else -> hi ++
        }
    }
    println("Familias con 0 hijos: $h0")
    println("Familias con 1 hijo: $h1")
    println("Familias con 2 hijos: $h2")
    println("Familias con más de 2 hijos: $hi")
}