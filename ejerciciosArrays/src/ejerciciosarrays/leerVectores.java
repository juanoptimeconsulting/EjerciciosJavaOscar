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
public class leerVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        /* Elaborar un algoritmo que permita leer un vector de 10 números en un arreglo A, lo mismo para el arreglo B; calcular e imprimir el producto AxB. */
        Scanner leer = new Scanner(System.in);
        int arreglo1[] = new int[11];
        int arreglo2[] = new int[11];
        int multiplicacion = 1;
        for (int i = 0; i < 11; i++) {
            System.out.println("ingrese  un numero del primer arreglo");
            arreglo1[i] = leer.nextInt();
           
            System.out.println("ingrese  un numero del segundo arreglo");
            arreglo2[i] = leer.nextInt();
            
       
        }
        for (int i = 0; i < 11; i++) {
            multiplicacion = (arreglo1[i] * arreglo2[i]);
            System.out.println("la multiplicacion  de AXB es :" + multiplicacion);
        }
    }

}
