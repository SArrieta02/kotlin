package `22_POO_Constructor`

/*Crear una clase llamada Producto con las propiedades nombre, precio y stock. Utilizar el constructor principal para inicializar estas propiedades.
Implementar un bloque init que verifique que ni el precio ni el stock sean negativos. Si alguno es negativo, establecer su valor en 0.
Agregar los siguientes métodos:
mostrarInfo(): muestra los datos del producto.
hayStock(): retorna un mensaje indicando si el producto está disponible (stock > 0).*/

class Producto constructor(var stock: Int, val nombre: String, var precio: Int){

    init{
        if(precio < 0) {
            precio = 0
        }
        if (stock < 0){
            stock = 0
        }
    }

    fun mostrarInfo(){
        println("El producto $nombre tiene un precio de $precio")
    }
    fun hayStock(){
        if (stock > 0){
            println("Si hay stock del producto $nombre")
            println("Hay de stock la cantidad de $stock")
        }
        if (stock <= 0){
            println("No hay stock")
        }
    }
}
fun main(){

    println("Digite el nombre del producto:")
    val nombre = readln().toString()
    println("Digite el precio del producto:")
    val precio = readln().toInt()
    println("Digite el stock del producto:")
    val stock = readln().toInt()

    val Producto1 = Producto(stock,nombre,precio)
    Producto1.mostrarInfo()
    Producto1.hayStock()
}

