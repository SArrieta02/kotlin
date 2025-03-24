package `1_Tipos_de_variables`

fun main() {
    // Todas las variable val son inmutables
    // Variable inmutable de tipo entero
    val edad: Int
    edad = 48
    // Variable inmutable de tipo decimal
    val sueldo: Float
    sueldo = 1200.55f // siempre lleva una "f al final del valor"
    // Variable inmutable de tipo decimal
    val total: Double
    total = 70000.24
    // Variable inmutable de tipo alfanumerico
    val titulo: String
    titulo = "Sistema de ventas"
    // Variable mutable, las variables mutables empiezan con "var"
    var mes: Int
    mes = 1
    // Algunas lineas mas de codigo
    mes = 2
    // Variable de tipo Char, almacena un unico caracter
    var continua: Char = 's'
    // Variable de tipo Booleano, True o false
    var fin: Boolean = false
    print("Steven\n")
    print("Jesus\n")
    println("Ballestero")
    println("Arrieta")
}