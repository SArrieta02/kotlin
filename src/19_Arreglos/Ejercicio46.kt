package `19_Arreglos`

// se deseea guardar los sueldos de 5 operarios
fun main(){
    val sueldos: IntArray
    // se define 5 espacios de sus elementos por teclado
    sueldos = IntArray (5)
    // carga de sus elementos por teclado
    for (i in 0 .. 4){
        print("Ingrese el sueldo:")
        sueldos[i] = readln().toInt()
    }
    //Impresion de sus elementos
    for (i in 0 .. 4){
        println(sueldos[i])
    }
}