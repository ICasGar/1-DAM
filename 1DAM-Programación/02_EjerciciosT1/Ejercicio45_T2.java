package ejercicio45_t2;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;
public class Ejercicio45_T2 {

    public static void main(String[] args) {
        LocalDate f1=LocalDate.of(2100, Month.FEBRUARY, 28);
        DayOfWeek dia=f1.getDayOfWeek();
        System.out.println("El 28 de febrero de 2100 es: "+dia);
    }
    
}
