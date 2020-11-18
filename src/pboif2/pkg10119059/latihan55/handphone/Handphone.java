/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan HP
 */
package pboif2.pkg10119059.latihan55.handphone;
/**
 *
 * @author Corazon
 */
public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufaktur : " +manufacture);
        System.out.println("OS : " +operatingSystem);
        System.out.println("Model : " +model);
        System.out.println("Harga : " +harga);
    }
}
