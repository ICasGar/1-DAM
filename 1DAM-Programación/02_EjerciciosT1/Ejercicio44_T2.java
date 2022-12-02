package ejercicio44_t2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Ejercicio44_T2 {
    public static void main(String[] args) {
        LocalDate dia=LocalDate.now();
        DateTimeFormatter fecha1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fecha2=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Fecha: "+dia.format(fecha1));
        System.out.println("Fecha: "+dia.format(fecha2));
        
    }
     
}
