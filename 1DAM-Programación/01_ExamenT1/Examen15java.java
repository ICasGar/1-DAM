package examen15java;

public class Examen15java {

    public static void main(String[] args) {
        boolean X=true;
        boolean Y=false;
        boolean Z=true;
        boolean operacion1= X|Y|X&!Z&!Y;
        System.out.println("La primera operacion es "+operacion1);
        boolean operacion2=(X|!Y)&(!X|Z);
        System.out.println("La segunda operacion es "+operacion2);
        boolean operacion3=!X|!Y|Z&X&!Y;
        System.out.println("La tercera operacion es "+operacion3);
    }
    
}
