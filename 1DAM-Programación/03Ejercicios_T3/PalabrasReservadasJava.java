package palabrasreservadasjava;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PalabrasReservadasJava {

    public static void main(String[] args) {
        ArrayList lista=new ArrayList();
        
        lista.add("abstract");
        lista.add("continue");
        lista.add("for");
        lista.add("new");
        lista.add("switch");
        lista.add("assert");
        lista.add("default");
        lista.add("goto");
        lista.add("package");
        lista.add("synchronized");
        lista.add("do");
        lista.add("if");
        lista.add("private");
        lista.add("this");
        lista.add("break");
        lista.add("double");
        lista.add("implements");
        lista.add("protected");
        lista.add("throw");
        lista.add("byte");
        lista.add("else");
        lista.add("import");
        lista.add("public");
        lista.add("case");
        lista.add("enum");
        lista.add("instanceof");
        lista.add("return");
        lista.add("transient");
        lista.add("catch");
        lista.add("extends");
        lista.add("int");
        lista.add("short");
        lista.add("try");
        lista.add("char");
        lista.add("final");
        lista.add("interface");
        lista.add("static");
        lista.add("void");
        lista.add("class");
        lista.add("finally");
        lista.add("long");
        lista.add("strictfp");
        lista.add("volatile");
        lista.add("const");
        lista.add("float");
        lista.add("native");
        lista.add("super");
        lista.add("while");        
        
        System.out.println("Dime todas las palabras reservadas que sepas: ");
        
        String java=JOptionPane.showInputDialog("Pon palibritas porfisnene");
        while (lista.size() !=1){
            if (lista.contains(java)){
                lista.remove(java);
                java = JOptionPane.showInputDialog("Pon otra nene");
            }else{
                JOptionPane.showMessageDialog(null,"ESA NO, ESA NOOOOOO");
                java=JOptionPane.showInputDialog("OOOOTra");
        }
        }
        if (lista.size()==1){
            JOptionPane.showMessageDialog(null,"Se acabo");
        }
    }
    
}
