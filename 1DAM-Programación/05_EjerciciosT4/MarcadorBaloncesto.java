package ejercicio03_t4;
import java.awt.Point;
import java.time.LocalDate;

public class MarcadorBaloncesto {
    public String nombreLocal;
    public String nombreVisitante;
    public int puntosLocal;
    public int puntosVisitante;
    public LocalDate fecha;
    
    public MarcadorBaloncesto(String nL, String nV){
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = 0;
        puntosVisitante = 0;
        fecha = LocalDate.now();
    }
    
    public MarcadorBaloncesto(String nL, String nV, LocalDate f){
        nombreLocal = nL;
        nombreVisitante = nV;
        fecha = f;
        puntosLocal = 0;
        puntosLocal = 0;
    }
    
    public MarcadorBaloncesto(String nL, int pL, String nV, int pV, LocalDate f){
        nombreLocal = nL;
        puntosLocal = pL;
        nombreVisitante = nV;
        puntosVisitante = pV;
        fecha = f;
    }
    
    //GETTERS
    public int puntosEV(){
        return puntosVisitante;
    }
    
    public int puntosEL(){
        return puntosLocal;
    }
    
    public String nombreEL(){
        return nombreLocal;
    }
    
    public String nombreEV(){
        return nombreVisitante;
    }
    
    public LocalDate fecha(){
        return fecha;
    }    
}
