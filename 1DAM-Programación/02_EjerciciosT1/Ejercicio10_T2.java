package pkg10ejercicio_t2;
import bpc.daw.objetos.*;
public class Ejercicio10_T2 {
    public static void main(String[] args) {
        Caja c=null;
        String m1="Silbatos";
        c=new Caja(m1);
        c.abrirCaja();
        System.out.println("El mensaje de la caja abierta es: "+c.getMensaje());
        c.cerrarCaja();
        m1="Paraguas";
        c=new Caja(m1);
        c.abrirCaja();
        System.out.println("El mensaje de la caja ahora es: "+c.getMensaje());
    }
    
}
