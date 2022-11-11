
package examen10java;

import java.util.Scanner;
public class Examen10java {


    public static void main(String[] args) {
        System.out.println("Dime 3 numeros enteros");
        double num1=new Scanner (System.in).nextDouble();
        double num2=new Scanner (System.in).nextDouble();
        double num3=new Scanner (System.in).nextDouble();
        if (num1>num2 && num1>num3){
            System.out.println("El primer numero es mayor");      
        }
        else if (num2>num1 && num2>num3){
            System.out.println("El segundo numero es mayor");
        }
        else if (num3>num1 && num3>num2){
            System.out.println("El tercer numero es mayor");
        } 
        else if (num1 ==num2 && num3==num2 && num3==num1){
            System.out.println("Son todos iguales");
        }
    }
    
}
