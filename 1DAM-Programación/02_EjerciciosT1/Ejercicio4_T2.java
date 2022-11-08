package ej4t2;
import bpc.daw.mario.*; 
import bpc.daw.mario.Luigi;
public class Ejercicio4_T2 {
    public static void main(String[] args) {
        Mario m1= null;
        Luigi l1= null;
        
        m1=new Mario(500,500);
        l1=new Luigi (m1 ,0);
        
        double distancia = m1.getDistanciaOrigen();
        System.out.println("Se encuestra a "+distancia);
    }
    
}
