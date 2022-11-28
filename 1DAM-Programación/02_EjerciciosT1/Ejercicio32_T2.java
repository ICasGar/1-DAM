package ejercicio32_t2;
import bpc.daw.reproductor.*;
public class Ejercicio32_T2 {

    public static void main(String[] args) {
        ArchivoMP3 a = new ArchivoMP3("C:\\Users\\usuario-tarde\\Desktop\\1.mp3");
        Reproductor rep = new Reproductor(a,false,false);
        rep.play();
        System.out.println("Título "+a.getTitulo());
        System.out.println("Autor "+a.getAutor());
        System.out.println("Duración "+a.getDuracion());
    }
    
}
