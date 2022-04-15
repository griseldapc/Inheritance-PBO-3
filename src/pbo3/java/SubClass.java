package pbo3.java;
public class SubClass extends SuperClas{
    //deklarasi//
    double nilaimax=99.9;
    String nama="Dina";
    int age = 17;
    public void setnama(String nama){
        this.nama=nama;
    }
    //method output program
    public void cetak(){
        System.out.println("Anak ini memiliki sifat " + super.sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+ " tahun");
        System.out.println("dengan tinggi badan "+ super.TB);
   super.hobbi();
    }
}
