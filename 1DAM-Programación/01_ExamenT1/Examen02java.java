package examen02java;
import java.util.Scanner;
public class Examen02java {


    public static void main(String[] args) {
        System.out.println("*******************");
        System.out.println("*                 *");
        System.out.println("*  Ivan Castro    *");
        System.out.println("*                 *");
        System.out.println("*******************");
        System.out.println("Dime 1 variable tipo int: ");
        int v1=new Scanner (System.in).nextInt();
        System.out.println("Dime 1 variable tipo long: ");
        long v2=new Scanner (System.in).nextLong();
        System.out.println("Dime 1 variable tipo String: ");
        String v3=new Scanner (System.in).nextLine();
        System.out.println("Dime 1 variable tipo double: ");
        double v4=new Scanner (System.in).nextDouble();
        System.out.println("Dime 1 variable tipo boolean: ");
        boolean v5=new Scanner (System.in).nextBoolean();
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        
    }
    
}
