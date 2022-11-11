package examen05java;
import java.util.Scanner;
public class Examen05java {

    
    public static void main(String[] args) {
        System.out.println("Dime un valor de numero entero");
        double num=new Scanner (System.in).nextDouble();
        System.out.println("El numero que has puesto es "+num);
        num+=5;
        System.out.println(num+" aumentado en 5 es "+num);
        num-=4; 
        System.out.println("El disminuido en 4 es "+num);
        
    }
    
}
