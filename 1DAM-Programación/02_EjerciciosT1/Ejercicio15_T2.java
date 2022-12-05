package ejercicio15_t2;
import java.lang.String;
import java.util.Scanner;
public class Ejercicio15_T2 {

    public static void main(String[] args) {
        String contraseña="clave";
        System.out.println("Introduzca la contraseña:");
        String txt=new Scanner (System.in).nextLine();
        if(txt == null ? contraseña == null : txt.equals(contraseña)){
            System.out.println("Muy buena");
        }else{
            System.out.println("Eres tonto?");
        }
    }
    
}
