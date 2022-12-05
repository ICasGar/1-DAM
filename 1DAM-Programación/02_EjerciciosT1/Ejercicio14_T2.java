package ejercicio14_t2;
import java.lang.String;
import java.util.Scanner;
public class Ejercicio14_T2 {

    public static void main(String[] args) {
        String frase=new Scanner (System.in).nextLine();
        frase.length();
        double m= (frase.length()/2);
        System.out.println("La letra del medio es: "+frase.charAt((int) m)+".");
    }
    
}
