package ejercicio_dni;
import ejercicio_dni.DNI;
import java.time.LocalDate;
import java.time.Month;

public class Persona {
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    
    //CONSTRUCTORES
    public Persona(String n, DNI d) {
        dni = d;
        nombre = n;
        sueldo = 900;
        fechaNacimiento = LocalDate.of(2003, 
                Month.JANUARY, 31);
    }
    
    public Persona(String n, int numDni, char letraDni, double s, LocalDate f) {
        String dni2 = "";
        String num = dni2.substring(0,7);
        int numero = Integer.parseInt(num);
        char letra = dni2.charAt(dni2.length()-1);
        dni = new DNI(numDni, letraDni);
        sueldo = s;
        fechaNacimiento = f;
        nombre = n;
    }
    
    public Persona(String n, int numDNI, char letraDNI) {
        String dni2 = "";
        String num = dni2.substring(0,7);
        int numero = Integer.parseInt(num);
        char letra = dni2.charAt(dni2.length()-1);
        numero = numDNI;
        letra = letraDNI;
        nombre = n;
        sueldo = 900;
        fechaNacimiento = LocalDate.of(2003, 
                Month.JANUARY, 31);
    }
    
    //GETTERS
    public String toString() {
        String aux = "El/Ella es " +nombre+ " con DNI: " +dni+ " ,cobra: "
                +sueldo+ " y nacio en el: " +fechaNacimiento;
        return aux;
    }
}
