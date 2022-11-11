package examen11java.pkg1;
import java.util.Scanner;
public class Examen11java1 {

    public static void main(String[] args) {
        System.out.println("Dime un anio");
        int anio=new Scanner (System.in).nextInt();
        if ((anio%400)==0){
            System.out.println("Es un anio bisiesto");
        }
        else if(((anio%4)==0)&&(anio%100)>0){
            System.out.println("Es un anio bisiesto");
            
        }
        else {
            System.out.println("NO es un anio bisiesto");
        }
    }
    
}
