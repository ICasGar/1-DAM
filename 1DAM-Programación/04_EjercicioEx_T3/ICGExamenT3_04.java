package icgexament3_04;
import java.util.*;
public class ICGExamenT3_04 {
    public static void main(String[] args) {
        int num=1;
        int num2=1;
        System.out.println("Introduce el numero que quieras: ");
        int numero = 0;
        try{
            numero=new Scanner (System.in).nextInt();
        }catch(InputMismatchException e){
            System.out.println("Error: "+e.getMessage());
        }
        while(num<numero){
            while(num2<=num){
                System.out.print(num2);
                num2++;
            }
            num2=1;
            System.out.println(" ");
            num++;
        }
        while(num>=1){
            while(num2<=num){
                System.out.print(num2);
                num2++;
            }
            num2=1;
            System.out.println(" ");
            num--;
        }
    }
    
}
