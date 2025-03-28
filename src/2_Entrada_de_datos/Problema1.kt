package `2_Entrada_de_datos`

/*Escribir un programa en el cual se ingresan cuatro números enteros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.*/
fun  main () {
    print ("Digite el primer numero:")
    val num1: Int = readln() .toInt()
    print ("Digite el segundo numero:")
    val num2: Int = readln() .toInt()
    print ("Digite el tercer numero:")
    val num3: Int = readln() .toInt()
    print ("Digite el cuarto numero:")
    val num4: Int = readln() .toInt()
    val suma: Int = num1 + num2
    println ("La suma de $num1 + $num2 es: $suma")
    val producto: Int = num3 * num4
    println("El producto de $num3 y $num4 es: $producto")
}
