package `22_POO_Constructor`

class Persona1 (var nombre: String, var edad: Int){

    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }
    fun esMayorEdad(){
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}
fun main() {
    val persona1 = Persona1("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()

    val persona2 = Persona1("Ana", 50)
    persona2.imprimir()
    persona2.esMayorEdad()
}