package ejercicio31_t2;
import bpc.daw.musica.*;
public class Ejercicio31_T2 {

    public static void main(String[] args) {
        NotaMusical n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16=null;
        Cancion c1=null ;
        String notas = null;
        c1=new Cancion(notas);
        n1 = new NotaMusical(1,2);
        n2 = new NotaMusical(1,2);
        n3 = new NotaMusical(5,2);
        n4 = new NotaMusical(5,2);
        n5 = new NotaMusical(6,2);
        n6 = new NotaMusical(6,2);
        n7 = new NotaMusical(5,1);
        n8 = new NotaMusical(4, (int)2.5);
        n9 = new NotaMusical(4, (int)2.5);
        n10 = new NotaMusical(3,(int)2.5);
        n11 = new NotaMusical(3, (int)2.5);
        n12 = new NotaMusical(2, (int) 3);
        n13 = new NotaMusical(3, (int) 3);
        n14 = new NotaMusical(4, (int) 3);
        n15 = new NotaMusical(2, (int) 3);
        n16 = new NotaMusical(1,(int)1.5);
        c1.añadir(n1);
        c1.añadir(n2);
        c1.añadir(n3);
        c1.añadir(n4);
        c1.añadir(n5);
        c1.añadir(n6);
        c1.añadir(n7);
        c1.añadir(n8);
        c1.añadir(n9);
        c1.añadir(n10);
        c1.añadir(n11);
        c1.añadir(n12);
        c1.añadir(n13);
        c1.añadir(n14);
        c1.añadir(n15);
        c1.añadir(n16);  
        
        Piano p = new Piano();
        Guitarra g = new Guitarra();
        
        p.reproducir(c1);
        g.reproducir(c1);
        System.out.println("El numero de notas es "+c1.getNumeroNotasMusicales());
        System.out.println("a"+n1.getDuracion());
    }
    
}
