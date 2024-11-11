package numerovalles;

/**
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class ReversoCadena {
    public static void cadenaInversa(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
           System.out.print(cadena.charAt(cadena.length() - (i + 1)));
        }        
    }
}
