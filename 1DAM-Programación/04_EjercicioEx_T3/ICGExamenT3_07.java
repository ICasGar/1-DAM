package icgexament3_07;
import java.util.ArrayList;
import java.util.*;
public class ICGExamenT3_07 {
    public static void main(String[] args) {
        int max=4;
        int n=0;
        String respuesta = null;
        ArrayList lista=new ArrayList();
        for(int i=0; i<=max;i++){
            System.out.println("Introduce el valor que quieras (hasta 5): ");
            respuesta=new Scanner (System.in).nextLine();
            lista.add(respuesta);
        }
        System.out.println("Forma 1:");
        while(n<=max){
        System.out.println(lista.get(n));
        n++;
        }
        System.out.println("Tamaño: ");
        System.out.println(lista.size());
        System.out.println(lista.indexOf(respuesta));
        System.out.println(lista.lastIndexOf(respuesta));
    }
}