package ejercicio47_t2;
import java.util.Random;
public class Ejercicio42_T2 {

    public static void main(String[] args) {
        int x=29;
        int y = 65;
        Random a= new Random();
        int random=a.nextInt(y - x + 1)+ x;
        System.out.println(random);
    }
    
}
