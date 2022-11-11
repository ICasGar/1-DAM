package examen03java;
import java.util.Scanner;
public class Examen03java {

    public static void main(String[] args) {
        System.out.println("Dime horas, minutos y segundos");
        double horas=new Scanner (System.in).nextDouble();
        double minutos=new Scanner (System.in).nextDouble();
        double segundos=new Scanner (System.in).nextDouble();
        double min_horas=horas*60;
        double min_seg= (min_horas+minutos)*60;
        double seg_tot= segundos+min_seg;
        System.out.println("Son un total de "+seg_tot+" segundos");
    }
    
}
