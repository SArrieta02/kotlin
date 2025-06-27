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
        val nota = IntArray (5)
        var condicion: String
        var NA: Int = 0
        var NB: Int = 100
        val promedio : Double
        var Aprobados = 0
        var Reprobados = 0
        // pedimos los nombres
        for (i in 0 .. 4){
        println("Digite el nombre del estudiante:")
        val nombre = readln().toString()
        nombres[i] = nombre
            nota[i] = registrarNota()
            sumaDenotas += nota[i]
            // definimos la condicion del estudiante
            when{
                nota[i] in 90 .. 100 ->{
                    condicion = "Excelente"
                    Aprobados ++}
                nota[i] in 80 .. 89 ->{
                    condicion = "Buena"
                    Aprobados ++}
                nota[i] in 70 .. 79 ->{
                    condicion = "Aprobada"
                    Aprobados ++}
                else ->{
                    condicion = "Reprobado"
                    Reprobados ++}
            }
            // vemos cual nota es más alta y màs baja
            if (NA<nota[i]){
                NA = nota[i]
            }
            if (NB > nota[i]){
                NB = nota[i]
            }
            println("La nota de ${nombres[i]} es: ${nota[i]}")
            println("La condicion de ${nombres[i]} es : $condicion")
    }
        // sacamos el promedio
        promedio = sumaDenotas / 5
        //enseñamos la nota más alta, nota màs baja y el promedio
        println("El promedio de las notas es: $promedio")
        println("La nota más alta es: $NA")
        println("La nota más baja es: $NB")
        println("La cantidad de estudiantes Aprobados son: $Aprobados")
        println("La cantidad de estudiantes reprobados son: $Reprobados")

}