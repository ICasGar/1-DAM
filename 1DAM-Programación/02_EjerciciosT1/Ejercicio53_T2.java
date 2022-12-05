package ejercicio53_t2;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio53_T2 {

    public static void main(String[] args) {
        Map mapa=new TreeMap<String,Color>();
        mapa.put("12535ABC","Color Rojo");
        mapa.put("98525KWX","Color Amarillo");
        mapa.put("17632MSE","Color Verde");
        mapa.put("85321ABC","Color Amarillo");
        
        System.out.println(mapa.size());
        System.out.println(mapa.toString());
        
        mapa.values();
        
        String matricula=new Scanner (System.in).nextLine();
        if(mapa.containsKey(matricula)){
            System.out.println("El color del coche es "+mapa.get(matricula));
        
        }
    }
    
}
