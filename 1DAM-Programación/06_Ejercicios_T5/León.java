package daw.zoo;
public class León extends Animal{

    public León(String n, int p){
        super(n,p);
    }
   
    @Override
    public void emitirSonido() {
        System.out.println(getNombre()+" ruge.");
    }
    
}
