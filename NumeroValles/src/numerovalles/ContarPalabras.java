package numerovalles;

import java.util.HashMap;
import java.util.Map;

/**
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 * lo resuelvan automáticamente.
 */
public class ContarPalabras {
    private static Map<String, Integer> map = new HashMap<>();

    public static void palabrasRepetidas(String texto) {
        for (String s : cleanTexto(texto).split(" ")) {
            if (map.containsKey(s))
                map.put(s, map.get(s).intValue() + 1);
            else
                map.put(s, 1);
        }
        map.entrySet().forEach(System.out::println);
    }

    public static String cleanTexto(String texto) {
        return texto.toLowerCase().replaceAll("[^a-z0-9 ]", "").trim();
    }
}
