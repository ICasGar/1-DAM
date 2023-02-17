package ejercicio07_t4;
public class CuentaCorriente {
    public int numero;
    public double saldo;
    
    public CuentaCorriente(){
        numero = (int) (Math.random()*1001);
        saldo = 0;
    }
    
    public CuentaCorriente(int n){
        numero = n;
        saldo = 0;
    }
    
    public CuentaCorriente(int n, double s){
        numero = n;
        saldo = s;
    }
    
    public void añadirDinero(int cantidad){
        saldo += cantidad;
    }
    
    public void retirarDinero(int cantidad){
        saldo -= cantidad;
    }
    
    //Getters
    public int getNumeroCuenta(){
        return numero;
    }
    
    public double getSaldoCuenta(){
        return saldo;
    }
    
}
