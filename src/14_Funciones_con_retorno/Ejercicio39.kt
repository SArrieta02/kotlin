package `14_Funciones_con_retorno`

fun largo(nombre: String): Int {
    return nombre.length
}
fun main(){
    print("Ingrese un nombre:")
    val nombre1 = readln()
    print("Ingrese otro nombre:")
    val nombre2 = readln()
    if (largo(nombre1) == largo (nombre2))
        print("Los nombres: $nombre1 y $nombre2 tienen la misma cantidad de caracteres")
    else
        if (largo(nombre1) > largo(nombre2))
            print("$nombre1 es más largo")
        else
            print("$nombre2 es más largo")
}