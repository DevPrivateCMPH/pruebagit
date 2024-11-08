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
public class NumeroValles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("numerovalles: " + numeroValles("UDUDDUUUDUDUDUUDUUDDDDDUDUDDDDUUDDUDDUUUUDUUDUDDDDUDUDUUUDDDUUUDUDDUUDDDUUDDUDDDUDUUDUUDUUDUDDDUUUUU"));
    }

    public static Integer numeroValles(String cadena) {
        int valle = 0, step = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'U') {
                step += 1;
            } else if (cadena.charAt(i) == 'D') {
                step -= 1;
            }
            if (step == 0 && cadena.charAt(i) == 'U') {
                valle += 1;
            }
        }
        return valle;
    }
}
