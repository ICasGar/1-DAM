package pruba;
import java.util.ArrayList;
import java.util.Scanner;
public class Pruba {
    public static void main(String[] args) {
        ArrayList cosas=new ArrayList();
        double cosa=0;
        boolean programa=true;
        System.out.println("Dime 5 nombres:");
        while(programa){
            String nombre=new Scanner (System.in).nextLine();
            cosas.add(nombre);
            cosa++;
        if(cosa==5){
            System.out.println("Los nombres fueron: "+cosas.toString());
            programa=false;
        }
        }
    } 
}
