package `26_POO_Metodos_set_y_get`

class Jardin() {
    // Variables que se utilizan en todo el codigo

    private val manodeobra: Double = 500.0
    var costozacate: Int = 0
    var subtotal: Double = 0.0
    var impuestoventa: Double = 0.0
    var total: Double = 0.0
    var totalmanodeobra: Double = 0.0
    var area: Double = 0.0

    var tipozacate: Int = 0
        set(valor) {
            if (valor == 1 || valor == 2 || valor == 3) {
                field = valor
            } else {
                field = 1
            }
        }
    var descripcionzacate: String = " "
        get() = when (tipozacate) {
            1 -> "CRIOLLO"
            2 -> "AMERICANO"
            3 -> "SINTETICO"
            else -> "CRIOLLO"
        }
    var largo: Double = 0.0
        set(valor) {
            if (valor <= 0) {
                field = 1.0
            } else {
                field = valor
            }
        }
    var ancho: Double = 0.0
        set(valor) {
            if (valor <= 0) {
                field = 1.0
            } else {
                field = valor
            }
        }

    // La unica funcion publica

    fun imprimir(){
        println("Las dimensiones del jardín son: de largo es de $largo y de ancho es de $ancho")
        area()
        println("El tipo de zacate elegido es de $descripcionzacate")
        manodeobra()
        Subtotal()
        impuesto()
        total()

    }
    // Todas las funciones privadas

    private fun area (){
        area = ancho * largo
        println("El area total a enzacatar es de $area")
    }
    //*****************
    private fun manodeobra(){
        when (tipozacate) {
            1 -> costozacate = 1000
            2 -> costozacate = 1500
            3 -> costozacate = 2000
        }
        totalmanodeobra = area * manodeobra
        println("El costo de mano de obra es de ₡$totalmanodeobra")
        println("El costo del zacate $descripcionzacate es de ₡$costozacate")
    }
    //*****************
    private fun Subtotal() {
        subtotal = costozacate * area + totalmanodeobra
        println("El sub total es de ₡$subtotal")
    }
    //*****************
    private fun impuesto(){
        impuestoventa = subtotal * 0.13
        println("El impuesto total de venta es de ₡$impuestoventa")
    }
    //*****************
    private fun total(){
        total = impuestoventa + subtotal
        println("El total a pagar del cliente es de ₡$total")
    }
}

fun main() {
    // Pedimos los valores
    println("Cual es el tipo de zacate")
    println("Digite el número del tipo de zacate")
    println("1 Criollo")
    println("2 Americano")
    println("3 Sintetico")
    var tipoZacate: Int = readln().toInt()
    println("Digite el largo del jardin")
    var largo: Double = readln().toDouble()
    println("Digite el ancho del jardin")
    var ancho: Double = readln().toDouble()
    // Invocamos la clase
    val jardin1 = Jardin()
    // Enviamos los valores
    jardin1.tipozacate = tipoZacate
    jardin1.largo = largo
    jardin1.ancho = ancho
    // Imprimimos el desglose
    jardin1.imprimir()
}