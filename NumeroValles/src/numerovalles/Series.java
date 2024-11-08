/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerovalles;

/**
 *
 * @author comet
 */
public class Series {

    public static void main(String[] agrs) {
        for (int i = 1; i <= 100; i++) {
            String salida = "";
            if ((i % 3) == 0) {
                salida = "Fizz";
                System.out.println(salida);
            }

            if ((i % 5) == 0) {
                salida = "Buzz";
                System.out.println(salida);
            }

            if ((i % 3) == 0 && (i % 5) == 0) {
                salida = "FizzBuzz";
                System.out.println(salida);
            }
            System.out.println(salida.equals("") ? i: salida);
        }
    }

}
