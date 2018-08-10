/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author ivann
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int lista[] = {4,5,6,9,7};
        int suma = sumatory(lista);
        int min = minimo(lista);
        int max = maximo(lista);
        System.out.println(suma);
        System.out.println(min);
        System.out.println(max);
    }
    public static int sumatory (int a[]){
        int suma = 0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            suma += a[i];
        }
    return suma;
    }
    public static int minimo (int a[]){
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]){min = a[i];}
        }
        
    return min;
    }
    public static int maximo (int a[]){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]){max = a[i];}
        }
    return max;
    }
    
}
