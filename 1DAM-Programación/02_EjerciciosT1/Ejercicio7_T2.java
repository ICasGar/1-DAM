package pkg07_ejerciciot2;
import bpc.daw.objetos.DepositoAgua;
public class Ejercicio7_T2 {

    public static void main(String[] args) {
        DepositoAgua deposito=null;
        deposito=new DepositoAgua(15,50);
        deposito.dibujar();
        double capacidad=(50*15)/100;
        System.out.println("El porcentaje de ocupacion es "+capacidad);
    }
    
}
