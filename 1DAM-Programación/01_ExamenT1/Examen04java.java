package examen04java;
import java.util.Scanner;
public class Examen04java {

    public static void main(String[] args) {
        System.out.println("Dime las edades de dos personas:");
        double edad1=new Scanner (System.in).nextDouble();
        double edad2=new Scanner (System.in).nextDouble();
        boolean mayored1= edad1>=18;
        boolean mayored2= edad2>=18;
        System.out.println("La primera persona es mayor de edad? "+mayored1);
        System.out.println("La primera persona es mayor de edad? "+mayored2);
        boolean mayor1_menor2= edad1>edad2;
        System.out.println("La primera persona es mayor que la segunda? "+mayored1);
    }
    
}
