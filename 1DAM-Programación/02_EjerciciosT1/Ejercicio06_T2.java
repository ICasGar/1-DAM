package pkg06_ejerciciot2;
import bpc.daw.mario.*; 
import java.util.Scanner;
public class Ejercicio6_T2 {

    public static void main(String[] args) {
        Mario m= null;
        System.out.println("Dime las coordenadas X e Y (en ese orden) de Mario");
        int X=new Scanner (System.in).nextInt();
        int Y=new Scanner (System.in).nextInt();
        m=new Mario(X,Y);
    }
    
}
