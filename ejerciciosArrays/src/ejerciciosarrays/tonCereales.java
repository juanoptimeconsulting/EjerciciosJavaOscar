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
public class tonCereales {

    public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
        double arreglo[], mayor, menor, suma=0;
         int n, j;
       
        do{
            System.out.println("Ingrese Cantidad de Elementos del arreglo:");
            n= teclado.nextInt();
        } while(n<=0);
        arreglo = new double[n];
          for(j=0;j<n;j++)
          {
              System.out.println("x["+j+"]=");
              arreglo[j]= teclado.nextDouble();
          }
         
          System.out.println("Elemento del Arreglo:");
          for(j=0;j<n;j++)
          {
              System.out.println("x["+j+"]="+arreglo[j]);  
          }
   
        int cant = arreglo.length;
        //------
        float total = 0;
        for (int i = 0; i < arreglo.length; i++) {
            total += arreglo[i];
        }
        float promedio = total / cant; //promedio de todos los valores del arreglo
        //-------
        int cantMesesConValorSuperiorAlPromedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio) {
                cantMesesConValorSuperiorAlPromedio++;
                  System.out.println(cantMesesConValorSuperiorAlPromedio);
            }
        }
      
        //-------
        int cantMesesConValorInferiorAlPromedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < promedio) {
                cantMesesConValorInferiorAlPromedio++;
                  System.out.println(cantMesesConValorInferiorAlPromedio);
            }
        }
        
    }
}
