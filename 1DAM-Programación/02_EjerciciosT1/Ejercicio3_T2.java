package pkg03_ejerciciost3;
import bpc.daw.mario.*; 
public class Ejercicio3_T2 {

    public static void main(String[] args) {
        Mario m1, m2= null;
        Seta s1= null;
        Luigi l1= null;
        Planta p1= null;
        Cañon c1= null;
        Disparo d1= null;
         
        m1=new Mario(100);
        m2=new Mario(640,320);
        m2=new Mario(250,200);
        Luigi l= new Luigi(200,200); 
        Seta s=new Seta(200,0);
        Cañon c=new Cañon(100,320);
        Planta pl1=new Planta(400,500);
        Planta pl2=new Planta(450,500);
        Planta pl3=new Planta(500,500);
        
        s.andarHacia(0,0); 
        m2.saltar();
        d1=new Disparo(100,320, 200,200 );
        pl1.comer(true);
        pl2.comer(true);
        pl3.comer(true);
    }
    
}
