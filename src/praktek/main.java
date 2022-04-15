package praktek;
import java.util.*;
    public class main extends mainApp{
    public static void main(String[] args) {
//overriding
        child test = new child ();
        test.identitas();
        test.myname();
        test.gender();
        test.nomor();
        test.bagian();
        test.gaji();
        test.gaji("Baik");
        test.bonus();
    }
}
