package ejercicio01_t3;
import java.util.Scanner;
public class Ejercicio01_T3 {

    public static void main(String[] args) {
        System.out.println("Canciones:");
        System.out.println("1 - Tebote Remix.mp3");
        System.out.println("2 - Ven Y Sana Mi Dolor|Goku Y Veggeta(REMIX).mp3");
        System.out.println("3 - Mariano Rajoy Bizarrap Session.mp3");
        System.out.println("4 - Donde Estan Las Gatas|Daddy Yankee.mp3");
        System.out.println("5 - Intro Doraemon (Versión Española).mp3");
        System.out.println("Pon el numero de la cancion que quieras reproducir");
        String num=new Scanner(System.in).nextLine();
         switch(num){
            case "1":   
                System.out.println("Reproduciendo: Tebote Remix.mp3...");
                break;
            case "2":   
                System.out.println("Reproduciendo: DVen Y Sana Mi Dolor|Goku Y Veggeta(REMIX).mp3...");
                break;
            case "3":   
                System.out.println("Reproduciendo: Mariano Rajoy Bizarrap Session.mp3...");
                break;   
            case "4":   
                System.out.println("Reproduciendo: Donde Estan Las Gatas|Daddy Yankee.mp3...");
                break;
            case "5":   
                System.out.println("Reproduciendo: Intro Doraemon (Versión Española).mp3...");
                break;
             default:
                System.out.println("El numero escogido no esta en la lista");
         }
    }
    
}
