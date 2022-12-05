package ejercicio12_t2;
import bpc.daw.objetos.*;
public class Ejercicio12_T2 {

    public static void main(String[] args) {
        MarcadorBaloncesto m=new MarcadorBaloncesto("Estudiantes", 
                "CB Granada");
        char E = 1;
        char CB = 1;
        m.anotarCanasta(E,2 );
        m.anotarCanasta(CB,3 );
        m.anotarCanasta(E,2);
        m.anotarCanasta(CB,2 );
        m.anotarCanasta(CB,3 );
        m.anotarCanasta(E,1);
        m.anotarCanasta(E,1 );
        m.anotarCanasta(CB,2 );
        System.out.println("Equipo Local: "+m.getNombreLocal());
        System.out.println("Equipo Visitante: "+m.getNombreVisitante());
        System.out.println("Puntuacion: "+m.getPuntosLocal()
                +" - "+m.getPuntosVisitante());
        System.out.println("Va ganando: "+m.getNombreEquipoGanador()+", por "
                + "lo tanto va perdiendo: "+m.getNombreEquipoPerdedor());
        
        
    }
    
}
