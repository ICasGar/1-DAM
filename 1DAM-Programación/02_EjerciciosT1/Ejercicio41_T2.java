package ejercicio41_t2;//*(0.38*4.93)-0.36 
import static java.lang.Math.*;
public class Ejercicio41_T2 {

    public static void main(String[] args) {
        System.out.println("Vamos a calcular esta cuenta: (0.38*4.93)^(-0.36)");
        double c1=(0.38*4.93);
        double c2=(-0.36);
        double r1=pow(c1,c2);
        int redondear;
        redondear=(int)round(r1);
        System.out.println("El resultado es: "+r1);
        System.out.println("Sin decimales es: "+redondear);
    }
    
}
