package examen13java;
import java.math.*;
import java.util.Scanner;
public class Examen13java {

    public static void main(String[] args) {
        System.out.println("Este programa calcula el area de un circulo");
        System.out.println("Dime el radio del circulo");
        double radio=new Scanner (System.in).nextDouble();
        final double pi=3.14;
        double elevado=Math.pow(radio,2);
        double area=(radio)*pi;
        System.out.println("El area es "+area);
    }
    
}
