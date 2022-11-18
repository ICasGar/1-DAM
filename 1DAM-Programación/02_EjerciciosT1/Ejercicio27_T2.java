package ejercicio27_t2;
import java.net.*;
import static java.net.InetAddress.getByName;
import java.util.Scanner;
public class Ejercicio27_T2 {

    public static void main(String[] args) {
        
        System.out.println("Escriba una dirección IP: ");
        String IP=new Scanner(System.in).nextLine();
        System.out.println("Escriba el tiempo de  Time Out(milisegundos): ");
        int TO=new Scanner(System.in).nextInt();
        long mls=TO;
        InetAddress ia = null;
        try{
            ia = ia.getByName(IP);
            try{
                boolean resp = ia.isReachable(TO);
                System.out.println("Haciendo ping a "+IP+"..."+resp);
                } catch (Exception e){
                    System.out.println("Error");
                }
            }catch (Exception e){
            System.out.println("Error"+ e.getMessage());
        }
    }
    
}
