package `29_POO_Objeto_nombrado`

object Matematica{
    val PI = 3.1416
    fun aleatorio(minimo: Int, maximo: Int)=
        ((Math.random() * (maximo + 1 - minimo))+minimo).toInt()
}
fun main(){
    println("El valor de PI es ${Matematica.PI}")
    println("Un valor aleatorio entre 5 y 10:")
    println(Matematica.aleatorio(5, 10 ))
}