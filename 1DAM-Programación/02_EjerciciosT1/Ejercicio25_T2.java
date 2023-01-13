package javaapplication74;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class Ejercicio25T2 {

    public static void main(String[] args) {
        FileReader archivo;
        BufferedReader lector;
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
        try {
            archivo = new FileReader("C:\\Users\\usuario-tarde\\Documents\\prueba\\frases.txt");
            if (archivo.ready()){
                lector = new BufferedReader(archivo);
                String cadena;
                while ((cadena = lector.readLine())!=null){
                    System.out.println(cadena);
                }
            }else{
                System.out.println("No se lee");
            }
        }catch (Exception e){
            System.out.println("Error"+ e.getMessage());
        }
        
    }
    
}
