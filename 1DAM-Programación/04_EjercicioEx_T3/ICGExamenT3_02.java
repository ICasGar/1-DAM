package icgexament3_02;
import java.util.*;
public class ICGExamenT3_02 {
    public static void main(String[] args) {
        int contador=0;
        int Nindefinido=0;
        for(int i=0;i<=1000;i +=Nindefinido){
            try{
            System.out.println("Introduce numeros: ");
            Nindefinido=new Scanner (System.in).nextInt();
            contador++;
            }catch(InputMismatchException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        System.out.println("Fin");
        System.out.println("Total de numeros introducidos: "+contador);
    }
    
}
