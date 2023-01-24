package icgexament3_01;
public class ICGExamenT3_01 {
    public static void main(String[] args) {
        //Tipo 1
        int a=0;
        while(a!=275){
            a+=5;
        }
        System.out.println(a);
        //Tipo 2
        int b=0;
        do{
            b+=5;
        }while(b!=275);
        System.out.println(b);
        //Tipo 3
        int c=5;
        int i;
        for(i=0;i!=275;i+=c){  
        }
        System.out.println(i);
    }
}
