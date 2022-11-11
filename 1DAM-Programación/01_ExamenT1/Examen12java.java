
package examen12java;

import java.util.Scanner;

public class Examen12java {

    public static void main(String[] args) {
        System.out.println("Dime un año");
        double edad=new Scanner (System.in).nextDouble();
        boolean mayor=edad>=18 ? true:false;        
        System.out.println("Es mayor de edad? "+mayor);
        }
}
    

