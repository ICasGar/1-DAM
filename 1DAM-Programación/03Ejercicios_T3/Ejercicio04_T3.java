package ejercicio04_t3;
import java.util.Scanner;
public class Ejercicio04_T3 {

    public static void main(String[] args) {
        boolean programa=true;
        String si="si";
        String no="no";
        while(programa){
            System.out.println("Eres mayor de edad (si/no)?");   
            String respuesta=new Scanner (System.in).nextLine();
            if(respuesta.equals(si)){
                System.out.println("Eres mayor de edad");
                programa=false;
            }else if(respuesta.equals(no)){
                System.out.println("Eres menor de edad");
                programa=false;
            }else{
                System.out.println("No entiendo");
            }
        }        
    }
    
}
