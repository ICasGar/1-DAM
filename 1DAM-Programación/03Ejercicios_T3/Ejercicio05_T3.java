package ejercicio05_t3;
import java.util.Scanner;
public class Ejercicio05_T3 {
    public static void main(String[] args) {
        System.out.println("Cuantas piezas se pueden cazar hoy? 30");
        System.out.println("---Empezamos la caza");
        boolean programa=true;
        int tope=0;
        String fin;
        while(programa){
            System.out.println("Introduzca el nº de piezas cazadas");
            int rep=new Scanner (System.in).nextInt();
            tope+=rep;
            if(tope<=30){
                System.out.println("Usted lleva cazadas "+tope+" piezas "
                        + "de 30 posibles");
            }else if(tope>30){
                System.out.println("Usted ha llegado al limite");
                System.out.println("Pulse una tecla para "
                        + "finalizar el programa");
                fin=new Scanner (System.in).nextLine();
                programa=false;
            }
        }        
    }
    
}
