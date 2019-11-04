/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarrays;

import javax.swing.JOptionPane;

/**
 *
 * @author JDIAZ
 */
public class ArregloCalificaciones  {

   
    private double[] cal;
    int cont;

    public ArregloCalificaciones(int x) {
        cal = new double[x];
        cont = 0;
    }

    public void ColocarCalificaciones(double valor) {
        cal[cont] = valor;
        cont++;
    }

    public double obtenerPromedioGrupal() {
        double prom, suma = 0.0;
        for (int i = 0; i < cal.length; i++) {
            suma += cal[i];
        }
        prom = suma / cal.length;
        return prom;
    }

    public int numeroPromediosMayores() {
        int cantidad = 0;
        for (int i = 1; i < cal.length; i++) {
            if (cal[i] >= 7) {
                cantidad++;
            }
        }

        return cantidad;
    }

    public int numeroPromediosMenores() {
        int cantidad = 0;
        for (int i = 1; i < cal.length; i++) {
            if (cal[i] < 7) {
                cantidad++;
            }
        }

        return cantidad;
    }

    public double procentajePromediosMayores() {
        double num;
        num = (numeroPromediosMayores() * 100) / cal.length;
        return num;
    }

    public double procentajePromediosMenores() {
        double num;
        num = (numeroPromediosMenores() * 100) / cal.length;
        return num;
    }

    public int numeroCalificaciones() {
        int cantidad = 0;
        for (int i = 1; i < cal.length; i++) {
            if (cal[i] >= 8) {
                cantidad++;
            }
        }

        return cantidad;
    }
}
 class PruebaArregloCalificaciones {
 
 public static void main (String [] main){
  ArregloCalificaciones x;
  String texto;
  int n;
  
  texto = JOptionPane.showInputDialog("¿Cuántos alumnos son en total?");
  n = Integer.parseInt(texto);
  x = new ArregloCalificaciones(n);
  
  for (int i = 0; i < n; i++){
   texto = JOptionPane.showInputDialog("Introduce la "+(i+1)+"° calificación: ");
   x.ColocarCalificaciones(Double.parseDouble(texto));
  }
  
  double promGrupo = x.obtenerPromedioGrupal();
  int cantPromediosMayores = x.numeroPromediosMayores();
  int cantPromediosMenores = x.numeroPromediosMenores();
  double porcentajeMayor = x.procentajePromediosMayores();
  double porcentajeMenor = x.procentajePromediosMenores();
  int cantCalificaciones = x.numeroCalificaciones();
  
  JOptionPane.showMessageDialog(null, 
"Promedio del Grupo: "+promGrupo+
"\nNúmero de alumnos aprobados: "+cantPromediosMayores+
"\nNúmero de alumnos reprobados: "+cantPromediosMenores+
"\nNúmero de alumnos cuya calificación fue mayor o igual a 8: "+cantCalificaciones+                           "\n\n\nPorcentaje de alumnos aprobados: "+porcentajeMayor+
"\nPorcentaje de alumnos reprobados: "+porcentajeMenor);
  
 }

}
