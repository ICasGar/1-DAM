package ej08;

public class Ej08 {

    public static void main(String[] args) {
        String[] vocales={"a","e","i","o","u"};
        String[] leng={"java","html","json"};
        String[] decimales={"4.5","7.25","8.6","10.7","6.11"};
        leng[0]="Cobol";
        System.out.println("La ultima vocal es: "+vocales[4]);
        System.out.println("El ultimo decimal es: "+decimales[4]);
        System.out.println("El ultimo lenguaje de programacion es: "+leng[3]);
        System.out.println("El primer lenguaje de programacion es: "+leng[0]);
    }
    
}
