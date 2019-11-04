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
public class carlos {
    
    
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
          String arreglo1[] = new String[11];
          int contador = 0, i;
          String respuesta = "";
          
         for (  i = 1; i <= 10; i++) {
                   
            System.out.println("ingrese  El nombre de la "+i+" Persona");
            arreglo1[i] = teclado.nextLine();
             System.out.println(arreglo1[i]);
             
            if("Carlos".equals(arreglo1[i])){
              
               contador++;
            }
            
            
     }
         String mayor=(contador>1)?" veces ":" vez ";
         
           System.out.println("Carlos Aprece " + contador + mayor );
         
        
    }
}
