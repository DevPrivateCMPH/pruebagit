package numerovalles;

/**
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class Anagrama {

    public static void anagrama(String cadUno, String cadDos) {
        int contador2 = 0;
        if (cadUno.length() == cadDos.length()) {
            for (int contador = 0; contador < cadUno.length(); contador++) {
                for (int contador1 = 0; contador1 < cadUno.length(); contador1++) {
                    if (cadUno.toLowerCase().charAt(contador) == cadDos.toLowerCase().charAt(contador1)) {
                        ++contador2;
                    }
                }
            }
        }
        if (contador2 == cadUno.length())
            System.out.println("Es anagrama");
        else
            System.out.println("No es anagrama");
    }
}
