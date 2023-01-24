package icgexament3_03;
public class ICGExamenT3_03 {
    public static void main(String[] args) {
        int rep=8;
        String asterisco="*";
        int num=1;
        while(rep>=1){
            while(num<=rep){
                System.out.print(asterisco);
                num++;
            }
            num=1;
            System.out.println(" ");
            rep--;
        }
    }
    
}
