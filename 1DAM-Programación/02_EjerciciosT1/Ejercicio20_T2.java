package ejercicio20_t2;
import java.io.File;
import java.util.Scanner;
public class Ejercicio20_T2 {
    public static void main(String[] args) {
        System.out.println("Que nombre de archivo quieres buscar?");
        String a1=new Scanner (System.in).nextLine();
        File archivo=new File(a1);
        
        if (archivo.exists()==true){
            System.out.println("El tamano del archivo es de "+archivo.length()+". Desea borar el archivo? (si/no)");
            String sino=new Scanner (System.in).nextLine();
            if (sino=="si"){
                archivo.delete();
                if(archivo.exists()==false){
                    System.out.println("Archivo borrado con exito");
                } 
                else{
                    System.out.println("Archivo no borrado");
                }
            }
            else{
                System.out.println("Operacion cancelada");
            }
        }
    }
    
}
