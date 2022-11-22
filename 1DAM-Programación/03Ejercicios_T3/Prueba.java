package prueba;
public class Prueba {

    public static void main(String[] args) {
        String nombreSO="os.name";
        String versionSO="os.version";
        String arquitecturaSO="os.arch";
        String pathSO="java.class.path";
        String homeSO="java.home";
        String separatorSO="file.separator";
        String vendorSO="java.vendor";
        String urlSO="java.vendor.url";
        String versioonSO="java.version";
        String separatoorSO="line.separator";
        System.out.println("\n Información sobre el SO:");
        System.out.println("\nNombre del SO:"+System.getProperty(nombreSO));
        System.out.println("\nVersion del SO:"+System.getProperty(versionSO));
        System.out.println("\nArquitectura del SO:"+System.getProperty(arquitecturaSO));
        System.out.println("\nDirectorio del SO:"+System.getProperty(pathSO));
        System.out.println("\nDirectorio 2 del SO:"+System.getProperty(homeSO));
        System.out.println("\nSeparador del SO:"+System.getProperty(separatorSO));
        System.out.println("\nVendor del SO:"+System.getProperty(vendorSO));
        System.out.println("\nUrl vendor del SO:"+System.getProperty(urlSO));
        System.out.println("\nVersion java del SO:"+System.getProperty(versioonSO));
        System.out.println("\nSeparador de java del SO:"+System.getProperty(separatoorSO));
        
    }
    
}
