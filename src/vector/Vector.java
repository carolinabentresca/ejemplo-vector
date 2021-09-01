/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

public class Vector {

    public static void main(String[] args) {

        vector();
    }

    public static void vector() {
        char[] letras = {'A', 'V', 'A', 'J'};
        for (int i = letras.length - 1; i >= 0; i--) {
            System.out.print(letras[i]);
        }
    }
}
