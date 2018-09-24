/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class JavaApplication6 {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        
       System.out.print("Ingrese la velocidad inicial \n ");
        float vi;
        vi = input.nextFloat();
       
        System.out.print("Ingrese la velocidad final \n ");
        float vf;
        vf = input.nextFloat();
        
        System.out.print("Ingrese el tiempo \n ");
        float tiempo;
        tiempo = input.nextFloat();
        
        float distancia;
        distancia= vi * vf / 2*tiempo;
        
        System.out.print("La distancia que usted recorrió es de "+distancia);
        System.out.print(" km/h");
                
                
    }
    
}
