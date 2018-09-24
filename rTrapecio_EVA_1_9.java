
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la altura");
        double h;
        h = input.nextDouble();
        
        System.out.println("Ingrese la Base Mayor");
        double B;
        B = input.nextDouble();
        
        System.out.println("Ingrese la base menor");
        double b;
        b = input.nextDouble();
        
        double A;
        A = h * (B + b) / 2;
        
        System.out.println("El area del trapecio es de " + A);
    }
    
}
