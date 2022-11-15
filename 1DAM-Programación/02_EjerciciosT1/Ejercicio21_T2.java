package ejercicio21_t2;
import bpc.daw.objetos.*;
import java.net.*;
public class Ejercicio21_T2 {

    public static void main(String[] args) {
        TarjetaCredito t1=null;
        t1=new TarjetaCredito(5000,1111);
        try{
        t1.getSaldo(1111);
        System.out.println("El saldo es de: "+t1.getSaldo(1111)+" €");
        }catch(Exception e){
            System.out.println("ERROR 404 NOT FOUND");
        }
        try{
        t1.sacarDinero(2000,1111);
        System.out.println("El saldo ahora es de: "+t1.getSaldo(1111)+" €");
        }catch(Exception e){
            System.out.println("ERROR 404 NOT FOUND");
        }
    }
    
}
