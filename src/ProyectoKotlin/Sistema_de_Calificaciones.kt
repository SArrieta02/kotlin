package ProyectoKotlin
// se registra la nota
fun registrarNota(): Int {
    var nota: Int = 0
    do {
        println("Ingrese la nota del estudiante (0 a 100):")
        nota = readln().toInt()
        if (nota > 100) {
            println("Nota invalida ingrese la nota nuevamente.")
        }
    } while (nota !in 0..100)
    return (nota)
}
    // *************************
fun main() {
        //definimos las variables
        val nombres = arrayOfNulls<String>(5)
        var sumaDenotas: Double = 0.0
        var nota : Int = 0
        var condicion: String
        var NA: Int = 0
        var NB: Int = 100
        val promedio : Double
        // pedimos los nombres
        for (i in 0 .. 4){
        println("Digite el nombre del estudiante:")
        val nombre = readln().toString()
        nombres[i] = nombre
        nota = registrarNota()
            sumaDenotas += nota
            // definimos la condicion del estudiante
            when{
                nota in 90 .. 100 -> condicion = "Excelente"
                nota in 80 .. 89 -> condicion = "Buena"
                nota in 70 .. 79 -> condicion = "Aprobada"
                else -> condicion = "Reprobado"
            }
            // vemos cual nota es más alta y baja
            if (NA<nota){
                NA = nota
            }
            if (NB > nota){
                NB = nota
            }
            println("La nota de ${nombres[i]} es: $nota")
            println("La condicion de ${nombres[i]} es : $condicion")
    }
        // sacamos el promedio
        promedio = sumaDenotas / 5
        //enseñamos la nota más alta y baja y el promedio
        println("El promedio de las notas es: $promedio")
        println("La nota más alta es: $NA")
        println("La nota más baja es: $NB")

}