package ejercicio03_t3;
public class Ejercicio03_T3 {

    public static void main(String[] args) {
        boolean going=true;
        int num=0;
        while(going){
            int numero=(int)(Math.random()*10+1);
            System.out.println(numero);
            if(numero==10){
                going=false;
            }
            
        }
    }
    
}
