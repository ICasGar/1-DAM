package icgexament3_05;
public class ICGExamenT3_05 {
    public static void main(String[] args) {
        int numeros;
        int fin=10;
        do{
            numeros= (int)(Math.random()*10+1);
            System.out.println(numeros);
        }while(numeros!=fin);
        System.out.println("Se ha llegado al numero diez. Fin.");
    }
    
}
