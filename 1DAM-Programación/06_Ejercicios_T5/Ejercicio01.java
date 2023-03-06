package ejercicio1_tema5;
public class Sorteo {
    public double dineroCupon;
    private int pagosRealizados;
    private int pagosPendientes;
    public int totalParticipantes;
    public double dineroRecogido;
    
    public Sorteo(double dC, int tP){
        dineroCupon = dC;
        totalParticipantes = tP;
        pagosRealizados = 0;
        pagosPendientes = tP;
    }
    
    public void registrarPago(){
        pagosRealizados++;
        pagosPendientes--;
        dineroRecogido += dineroCupon;
    }
    
    public void apuntarNuevoParticipante(){
        totalParticipantes++;
        pagosPendientes++;
    }
}
