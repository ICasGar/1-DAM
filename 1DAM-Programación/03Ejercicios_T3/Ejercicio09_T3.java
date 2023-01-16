package ejercicio09_t3;
import java.lang.*;
import java.util.*;
public class Ejercicio09_T3 {
    public static void main(String[] args) {
        double S=1;
        double A=1;
        boolean prog=true;
        System.out.println("Dime un numero para hacer la raiz cuadrada");
        double N = new Scanner (System.in).nextDouble();
        if(N>=0){
            while (prog){
                S=(0.5)*(A+(N/A));
                if((Math.abs(S-A))<0.000001){
                    System.out.println("Si: "+S);
                    prog=false;
                }else{
                    A=S;
                }
            }
        }
    }
    
}
