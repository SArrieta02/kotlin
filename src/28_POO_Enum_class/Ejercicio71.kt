package `28_POO_Enum_class`

enum class Tipocarta{
    DIAMANTE,
    TREBOL,
    CORAZON,
    PICA
}
class Carta(val tipo: Tipocarta, val valor: Int){
    fun imprimir(){
        println("Carta: $tipo y su valor es $valor")
    }
}
fun main(){
    val carta1 = Carta(Tipocarta.PICA, 4)
    carta1.imprimir()
    val carta2 = Carta(Tipocarta.CORAZON, 1)
    carta2.imprimir()
}