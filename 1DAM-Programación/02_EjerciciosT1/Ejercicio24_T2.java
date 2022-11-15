package ejercicio24_t2;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
public class Ejercicio24_T2 {

    public static void main(String[] args) {
         File crear = new File("\"C:\\Users\\usuario-tarde\\Desktop\frases.txt");
        try {
            crear.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        PrintWriter jose;
        System.out.println("Dime 2 frases");
        String frase1=new Scanner (System.in).nextLine();
        String frase2=new Scanner (System.in).nextLine();
        
        try{
            jose = new PrintWriter("C:\\Users\\usuario-tarde\\Documents\\prueba\\frases.txt");
            jose.println(frase1);
            jose.println(frase2);
            jose.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
