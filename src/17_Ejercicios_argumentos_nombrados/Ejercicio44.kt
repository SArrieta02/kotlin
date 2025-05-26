package `17_Ejercicios_argumentos_nombrados`

fun calcularSueldo(nombre: String, costoHora : Double, cantidadHoras: Int){
    val sueldo = costoHora * cantidadHoras
    println("$nombre trabajó $cantidadHoras horas, se le paga por hora $costoHora por lo tanto le corresponde un sueldo de $sueldo")
}
fun main(){
    calcularSueldo("juan", 10.5, 120)
    calcularSueldo(costoHora = 12.0,cantidadHoras= 40, nombre = "Ana")
    calcularSueldo(cantidadHoras = 90, nombre = "Luis",costoHora = 7.25)
}