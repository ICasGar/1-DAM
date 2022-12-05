package ejercicio51_t2;
import java.util.Set;
import java.util.HashSet;
public class Ejercicio51_T2 {

    public static void main(String[] args) {
        Set lista = new HashSet();
        lista.add("silla");
        lista.add("niño");
        lista.add("mesa");
        lista.add("casa");
        lista.add("silla");
        lista.add("lápiz");
        System.out.println(lista.size());
        System.out.println(lista.toString());
    }
    
}
