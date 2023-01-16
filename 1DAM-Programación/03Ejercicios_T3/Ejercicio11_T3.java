package ejercicio11_t3;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Ejercicio11_T3 {
    public static void main(String[] args) {
        boolean empieza = true;
        String Menu;
        String DNI;
        String nombre;
        String direccion;
        long numero;
        
        do{
            System.out.println("Menu:");
            System.out.println("1.   Añadir nuevo alumno");
            System.out.println("2.   Ver los datos de un alumno");
            System.out.println("3.   Salir");
            Menu = new Scanner (System.in). nextLine();
            
            
            switch(Menu){
                case "1":
                    System.out.println("Dime el DNI del alumno");
                    DNI = new Scanner (System.in). nextLine();
                    System.out.println("Dime el nombre del alumno");
                    nombre = new Scanner (System.in). nextLine();
                    System.out.println("Dime la direccion del alumno");
                    direccion = new Scanner (System.in). nextLine();
                    System.out.println("Dime el telefono del alumno");
                    numero = new Scanner (System.in). nextLong();
                    
                    File archivo = new File(DNI + ".txt");
                    PrintWriter escribir = null;
                    try{
                        escribir = new PrintWriter(archivo);
                        escribir.println(nombre);
                        escribir.println(direccion);
                        escribir.println(numero);
                        escribir.close();
                    }catch(Exception e){
                        System.out.println("Error "+ e.getMessage());
                    }
                    break;
                case "2":
                    System.out.println("Cual es el DNI del alumno?");
                    String alumno = new Scanner (System.in). nextLine();
                    String ruta = alumno+".txt";
                try {
                    BufferedReader lee = new BufferedReader(new FileReader(ruta));
                    String linea;
                    while((linea = lee.readLine()) != null) {
                        System.out.println(linea);
                    }
                    lee.close();
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo " + ruta);
                }
                    break;
                case "3":
                    empieza = false;
                    break;
                default:
                    System.out.println("Te equivocaste maquina pon 1, 2 o 3");
            }
        }while(empieza==true);
        System.out.println("El programa ya ha terminado");
    }
    
}
