package `5_Estructura_condicionales_anidadas`

/*Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo(cero) o negativo.*/
fun main(){
    print("Ingrese un numero:")
    val num= readln(). toInt()
    if (num<0)
        print("El numero es negativo")
    else if (num==0)
        print("El numero es nulo")
    else
        print("El numero es positivo")
}
