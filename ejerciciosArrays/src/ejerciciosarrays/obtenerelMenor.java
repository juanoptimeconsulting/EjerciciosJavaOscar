/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarrays;

import java.util.Scanner;

/**
 *
 * @author JDIAZ
 */
public class obtenerelMenor {

    public static void main(String[] args) {
        /*De un arreglo de 20 números obtener el menor.*/
        Scanner teclado = new Scanner(System.in);
        int x[], menor;
        int n, i;

        do {

            n = 10;
            
        } while (n <= 0);
        
        x = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("INGRESE EL SIGUENTE VALOR");
            x[i] = teclado.nextInt();
        }

        menor = menor = x[0];
        System.out.println(menor);
        for (i = 0; i < n; i++) {
              if (x[i] < menor) {
                menor = x[i];
            }
        }

  
        System.out.println("El menor es:" + menor);
    }

}
