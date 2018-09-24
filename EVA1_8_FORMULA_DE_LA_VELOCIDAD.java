
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Homar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input  = new Scanner (System.in);
        
        System.out.println("INTRODUCIR VELOCIDAD INICIAL");
        double rVEL1;
        
        rVEL1 = input . nextDouble();
        System.out.println("INTRODUCIR LA VELOCIDAD FINAL");
        double rVEL2;
        
        rVEL2 = input.nextDouble();
        System.out.println("INTRODUCCIR EL TIEMPO");
        double rTIEMPO;
        
        rTIEMPO = input.nextDouble();
        System.out.println("LA DISTANCIA RECORRIDA ES ");
        double rDISTANCIA;
        
        rDISTANCIA = (rVEL2 + rVEL1) / 2 * rTIEMPO;
        System.out.println(rDISTANCIA);
    }
}

    
    

