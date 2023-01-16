package ejercicio08_t3;
import java.util.*;
public class Ejercicio08_T3 {

    public static void main(String[] args) {
        int contador=1;
        System.out.println("Escriba una frase");
        String frase = new Scanner (System.in).nextLine();
        StringTokenizer separador=new StringTokenizer(frase," ");
        while(separador.hasMoreElements()==true){
            System.out.println(separador.nextToken());
            if(separador.hasMoreElements()==true){
                contador++;
            }
        }
        System.out.println("El numero total de palabras es: "+contador);          
    }
    
}
