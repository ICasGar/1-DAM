package daw.zoo;

import java.util.Objects;

public abstract class Animal {
    private String nombre;
    private int peso;
    boolean encerrado;
    
    public Animal(String n, int p){
        n = nombre;
        p = peso;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public boolean isEncerrado(){
        return this.encerrado;
    }
    
    public void setEncerrado(boolean e){
        this.encerrado = e;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.peso != other.peso) {
            return false;
        }
        if (this.encerrado != other.encerrado) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + this.peso;
        hash = 23 * hash + (this.encerrado ? 1 : 0);
        return hash;
    }
    
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre +"\nPeso del animal: "+ peso;
    }
    
    public abstract void emitirSonido();
}
