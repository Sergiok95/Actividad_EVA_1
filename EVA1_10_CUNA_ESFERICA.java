/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_cuna_esferica;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA1_10_CUNA_ESFERICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el radio");
        double r;
        r = input.nextDouble();
        
        System.out.println("Ingrese los grados");
        double n;
        n = input.nextDouble();
        
        double V;
        V = (4 / 3) * (3.14159265359 * (r * r * r) / 360) * (n);
        System.out.println("La medida de la cuña esferica es " + V);
        
    }
    
}
