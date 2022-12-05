package ejercicio50_t2;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio50_T2 {

    public static void main(String[] args) {
        List msg=new ArrayList();
        msg.add("Pachinco");
        msg.add("Pericia");
        msg.add("Poliedro");
        msg.add("Pulianas");
        msg.add("Pistacho");
        System.out.println(msg.size());
        System.out.println(msg.get(2));
        System.out.println(msg.toString());
        msg.remove(0);
        System.out.println(msg.size());
        System.out.println(msg.get(2));
        System.out.println(msg.toString());
    }
    
}
