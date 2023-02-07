package ejercicio_dni;
import ejercicio_dni.DNI;
import ejercicio_dni.Persona;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Oficina {
    private String nombre;
    private ArrayList<Persona> trabajadores;
    
    public Oficina(String n){
        nombre = n;
    }
    
    public Oficina(String n, int tipo){
        nombre = n;
        if (tipo == 0 && tipo < 3){
            
        }else if (tipo == 1){
            trabajadores.add(new Persona("Anotnio Pérez Pérez",11111111,'H', 900,
             LocalDate.parse("28/2/2000", 
        DateTimeFormatter.ofPattern("DD/MM/YYYY"))));
        }else if (tipo == 2){
            trabajadores.add(new Persona("Anotnio Pérez Pérez",11111111,'H', 900,
             LocalDate.parse("28/2/2000", 
        DateTimeFormatter.ofPattern("DD/MM/YYYY"))));
            trabajadores.add(new Persona("Luis López López",22222222,'J', 1000,
             LocalDate.parse("10/9/1995", 
        DateTimeFormatter.ofPattern("DD/MM/YYYY"))));
        }else if (tipo == 3){
            trabajadores.add(new Persona("Anotnio Pérez Pérez",11111111,'H', 900,
             LocalDate.parse("28/2/2000", 
        DateTimeFormatter.ofPattern("DD/MM/YYYY"))));
            trabajadores.add(new Persona("Luis López López",22222222,'J', 1000,
             LocalDate.parse("10/9/1995", 
        DateTimeFormatter.ofPattern("DD/MM/YYYY"))));
            trabajadores.add(new Persona("Ana Díaz Díaz",33333333,'P', 1200,
             LocalDate.parse("21/5/1985", 
        DateTimeFormatter.ofPattern("DD/MM/YYYY"))));
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public ArrayList<Persona> getTrabajadores(){
        return this.trabajadores;
    }
    
    @Override
    public String toString(){
        
        String aux = "Nombre: "+ this.nombre;
        ArrayList<Persona> t = this.getTrabajadores();
        return aux;
                
    }
}
