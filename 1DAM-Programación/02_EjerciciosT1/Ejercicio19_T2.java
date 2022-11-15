package ejercicio19_t2;
import java.util.Scanner;
import java.io.File;
public class Ejercicio19_T2 {
    public static void main(String[] args) {
        System.out.println("Que nombre de archivo quieres buscar?");
        String nombre=new Scanner (System.in).nextLine();
        File archivo=new File(nombre);
        System.out.println("Son "+archivo.length()+" bytes");
        int megas=(int) (archivo.length()/1000000);
        System.out.println("Son "+megas+" megas");
        
    }
    
}
