package pkg11ejercicio_t2;
import bpc.daw.objetos.*;
public class Ejercicio11_T2 {
    public static void main(String[] args) {
        Caja c1, c2=null;
        String m1="Piedra";
        String m2="Arena";
        c1=new Caja(m1);
        c2=new Caja(m2);
        c1.abrirCaja();
        System.out.println("El mensaje de la caja 1 es: "+c1.getMensaje());
        c2.abrirCaja();
        System.out.println("El mensaje de la caja 2 es: "+c2.getMensaje());
        c1.cerrarCaja();
        c2.cerrarCaja();
        c1=new Caja(m2);
        c2=new Caja(m1);
        c1.abrirCaja();
        System.out.println("El mensaje de la caja 1 ahora es: "+c1.getMensaje());
        c2.abrirCaja();
        System.out.println("El mensaje de la caja 2 ahora es: "+c2.getMensaje());
        
    }
    
}
