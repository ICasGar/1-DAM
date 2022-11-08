package pkg13ejercicio_t2;
import java.util.Scanner;
import java.lang.*;
public class Ejercicio13_T2 {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre");
        String nombre=new Scanner (System.in).nextLine();
        System.out.println(nombre);
        System.out.println("Tu nombre en mayusculas: "+nombre.toUpperCase());
        System.out.println("Tu nombre en minusculas: "+nombre.toLowerCase());
        System.out.println("Total de caracteres de tu nombre: "+nombre.length());
    }
    
}
