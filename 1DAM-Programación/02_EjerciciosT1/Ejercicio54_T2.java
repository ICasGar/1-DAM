package ejercicio54_t2;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio54_T2 {

    public static void main(String[] args) {
        ArrayList Lista=new ArrayList();
        Lista.add("Titi");
        Lista.add("Gatas");
        Lista.add("Bote");
        Lista.add("Cinco");
        Lista.add("Danza");
        Lista.add("Radio");
        Lista.add("Navidad");
        Lista.add("Mon");
        Lista.add("Caramelo");
        Lista.add("Dolor");
        System.out.println(Lista.toString());
        Collections.sort(Lista);
        System.out.println(Lista.toString());
    }
    
}
