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
public class BlackBerry extends Handphone{
    private String pinBB;

    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getPinBB(){
        return pinBB;
    }
    
    public void setPinBB(String pinBB){
        this.pinBB = pinBB;
    }
}
