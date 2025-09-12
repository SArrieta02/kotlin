package `29_POO_Objeto_nombrado`

/*object Mayor {
tres métodos llamados "maximo" y con dos parámetros cada método. Los métodos difieren en que uno recibe tipos de datos Int,
otro de tipos Float y finalmente el último recibe tipos de datos Double. Los tres métodos deben retornar el mayor de los dos datos que reciben.
*/
object Mayor{
    fun maximo1(valor1: Int, valor2: Int): Int{
        var mayor: Int = 0
        if (valor1 > valor2){
            mayor = valor1
        }else{
            mayor = valor2
        }
        return mayor
    }
    fun maximo2(valor1: Float, valor2: Float): Float{
        var mayor: Float = 0f
        if (valor1 > valor2){
            mayor = valor1
        }else{
            mayor = valor2
        }
        return mayor
    }
    fun maximo3(valor1: Double, valor2: Double): Double{
        var mayor: Double = 0.0
        if (valor1 > valor2){
            mayor = valor1
        }else{
            mayor = valor2
        }
        return mayor
    }
}
fun main(){
    println("El mayor es ${Mayor.maximo1(9, 20)}")
    println("El mayor es ${Mayor.maximo2(14f, 60f)}")
    println("El mayor es ${Mayor.maximo3(50.89, 45.78)}")
}