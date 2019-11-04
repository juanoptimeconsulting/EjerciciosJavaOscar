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
public class menosPeso {
     public static void main(String[] args) {
         
         Scanner teclado = new Scanner(System.in);
         
          String arreglo1[] = new String[6];
          //int arreglo2[] = new int[6];
          
          int[][]matriz={};
          
          int peso;
          int i;
          
          
 
          
          
         for (  i = 1; i <= 5; i++) {
                   
            System.out.println("ingrese  El nombre de la "+i+" Persona");
            arreglo1[i] = teclado.nextLine();
            
            
     } 
                   
         for (  i = 1; i <= 5; i++) {
                   
             System.out.println("Ingrese le Peso de "+arreglo1[i]);
             matriz[i] = teclado.nextInt();
          
        }
         for(int j=0; j<matriz[0].length; j++){
 
if(matriz[i][j]>mayor){
mayor=matriz[i][j]; 
} 
 
}
         

            // System.out.println(arreglo1[i]);
            
         
         
     }
}
