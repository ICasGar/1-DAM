package ejercicio07_t4;
import ejercicio07_t4.CuentaCorriente;
public class Ejercicio07_T4 {
    public static void main(String[] args) {
        CuentaCorriente cc=new CuentaCorriente();
        System.out.println(cc.getNumeroCuenta());
        cc.añadirDinero(1500);
        System.out.println(cc.getSaldoCuenta());
        try{
        cc.retirarDinero(-90);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(cc.getSaldoCuenta());
    }
}
