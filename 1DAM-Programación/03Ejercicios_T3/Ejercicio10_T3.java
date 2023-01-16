package ejercicio10_t3;
import java.util.*;
import java.io.*;
public class Ejercicio10_T3 {
    public static void main(String[] args) {
        String r;
        System.out.println("Introduzca una ruta");
        Scanner ruta = new Scanner (System.in);
        r = ruta.nextLine();
        ruta.close();
        try {
            BufferedReader leer = new BufferedReader 
        (new FileReader(r));
            String l;
            while ((l=leer.readLine())!=null){
                System.out.println("");
            }
            leer.close();
        }catch (IOException e){
            System.out.println("Error: "+e);
        }
    }
    
}
