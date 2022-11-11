
package examen14java;

import java.util.Scanner;

public class Examen14java {

    public static void main(String[] args) {
        System.out.println("Dime una cantidad de dinero");
        double dinero=new Scanner (System.in).nextDouble();
        double quin=dinero/500;
        double cien=dinero/100;
        double cinc=dinero/50;
        double veint=dinero/20;
        double diez=dinero/10;
        double dos=dinero/2;
        double uno=dinero/1;
        System.out.println("En billetes de 500 serian: "+quin);
        System.out.println("En billetes de 100 serian: "+cien);
        System.out.println("En billetes de 50 serian: "+cinc);
        System.out.println("En billetes de 20 serian: "+veint);
        System.out.println("En billetes de 10 serian: "+diez);
        System.out.println("En monedas de 2 euros serian: "+dos);
        System.out.println("En monedas de 1 euro serian: "+uno );
        
        
        
    }
    
}
