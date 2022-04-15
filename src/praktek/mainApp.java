package praktek;
import java.util.*;
public class mainApp  {
     private int no = 3333;
    private String name = "Diah";
    private String kelamin = "wanita";
    private String jabatan = "admin";
    public int gaji = 1200000;
    public int bonus = 2400000;
    //overloading
    void identitas () {
        System.out.println("Berikut Identitas Pegawai ");
    }

    void myname () {
        System.out.println("Nama                                : " +this.name);
    }
    void gender() {
        System.out.println("Jenis Kelamin                       : " +this.kelamin);
    }
    void nomor () {
        System.out.println("Nomor pegawai                       : " +this.no);
    }
    void bagian () {
        System.out.println("Bekerja di bagian                   : " +this.jabatan);
    }
    void gaji () {
        System.out.println("Gaji utama yang didapatkan          : "+ gaji);
        }
    void bonus () {
        System.out.println("Gaji yang didapatkan jika bekerja secara baik adalan "+ bonus);
    }
}
