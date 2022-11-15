package ejercicio26_t2;
import java.lang.*;
import java.util.Scanner;
public class Ejercicio26_T2 {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Dime cuantos segundos quieres esperar: ");
        
        long milisegundos=new Scanner(System.in).nextLong();
        long segundos =(milisegundos*1000);
        System.out.println("Esperando...");
        Thread.sleep(segundos);
        System.out.println("Fin del programa");
    }
    
}
