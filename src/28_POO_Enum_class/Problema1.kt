package `28_POO_Enum_class`

 /*Problema 1
Definir un enum class almacenando como constante los nombres de cinco países de América y como propiedad para cada país la cantidad de habitantes que tiene.
Definir una instancia de este tipo e imprimir la constante y la cantidad de habitantes de dicha instancia*/

enum class Paises(val habitantes: String){
    PANAMA("4.477.000"),
    CANADA("38.800.000"),
    MEXICO("130.000.000"),
    BRAZIL("220.000.000"),
    COSTARICA("5.227.000")
}
fun main(){
    val paises1 = Paises.PANAMA
    println("Pais seleccionado ${paises1.name}")
    println("Sus habitantes son de ${paises1.habitantes}")

    val paises2 = Paises.CANADA
    println("Pais seleccionado ${paises2.name}")
    println("Sus habitantes son de ${paises2.habitantes}")

    val paises3 = Paises.MEXICO
    println("Pais seleccionado ${paises3.name}")
    println("Sus habitantes son de ${paises3.habitantes}")

    val paises4 = Paises.BRAZIL
    println("Pais seleccionado ${paises4.name}")
    println("Sus habitantes son de ${paises4.habitantes}")

    val paises5 = Paises.COSTARICA
    println("Pais seleccionado ${paises5.name}")
    println("Sus habitantes son de ${paises5.habitantes}")
}