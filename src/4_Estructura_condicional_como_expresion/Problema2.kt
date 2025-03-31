package `4_Estructura_condicional_como_expresion`

/*Solicita al usuario que ingrese su edad. Almacena una descripción en una variable usando una expresión if:
Si es menor de 13, asigna "Niño".
Si está entre 13 y 17 inclusive, asigna "Adolescente".
Si es 18 o más, asigna "Adulto".
Luego, imprime la descripción correspondiente.
*/
fun main() {
    print("Ingrese su edad:")
    val edad = readln().toInt()
   val descripcion = if (edad < 13) {
         "Niño"
   } else if (edad>= 13 && edad<= 17) {
       "Adolecente"
   }else {
       "Adulto"
   }
  print(descripcion)
}

