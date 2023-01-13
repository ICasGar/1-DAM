package pkg08_ejerciciot2;
import bpc.daw.objetos.DepositoAgua;
public class Ejercicio8_T2 {

    public static void main(String[] args) {
        DepositoAgua d1,d2=null;
        d1=new DepositoAgua(15,20);
        d2=new DepositoAgua(5,20);
        System.out.println("Los depositos antes: ");
        d1.dibujar();
        d2.dibujar();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d2.añadirLitro();
        d2.añadirLitro(); 
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        System.out.println("Los depositos despues: ");
        d1.dibujar();
        d2.dibujar();
        
        double capacidad=(50*15)/100;
        System.out.println("El porcentaje de ocupacion es "+capacidad);
    }
    
}
