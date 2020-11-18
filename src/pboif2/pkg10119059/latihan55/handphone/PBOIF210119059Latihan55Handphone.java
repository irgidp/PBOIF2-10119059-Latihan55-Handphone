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
public class PBOIF210119059Latihan55Handphone {

    public static void main(String[] args) {
        
        Android andro = new Android("Samsung", "Android", "Grand", 3000000);
        andro.setKeyStore("234ibfd3840fo");
        
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        
        WindowsPhone win = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        win.setWpKeyStore("UUUQIJWORJ");
        
        
        andro.displayProduct();
        System.out.println("Android Key Store : " +andro.getKeyStore());
        System.out.println("");
        
        bb.displayProduct();
        System.out.println("PIN : " +bb.getPinBB());
        System.out.println("");
        
        win.displayProduct();
        System.out.println("WP Key Store : " +win.getWpKeyStore());
        
    }
    
}
