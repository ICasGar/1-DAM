package ejercicio48_t2;
import bpc.daw.objetos.*;
public class Ejercicio48_T2 {

    public static void main(String[] args) {
        MarcadorMejorado m = new MarcadorMejorado
        ("Estudiantes","CB GRanada");
        int E = 697259;
        int CB = 782507;
        int no = 522;
        int li = 266;
        int tri = 778;
        m.anotarCanasta(E,no );
        m.anotarCanasta(CB,tri );
        m.anotarCanasta(E,no);
        m.anotarCanasta(CB,no );
        m.anotarCanasta(CB,tri );
        m.anotarCanasta(E,li);
        m.anotarCanasta(E,li );
        m.anotarCanasta(CB,no );
        System.out.println("Equipo Local: "+m.getNombreLocal());
        System.out.println("Equipo Visitante: "+m.getNombreVisitante());
        System.out.println("Puntuacion: "+m.getPuntosLocal()
                +" - "+m.getPuntosVisitante());
        System.out.println("Va ganando: "+m.getNombreEquipoGanador()+", por "
                + "lo tanto va perdiendo: "+m.getNombreEquipoPerdedor());
    }
    
}
