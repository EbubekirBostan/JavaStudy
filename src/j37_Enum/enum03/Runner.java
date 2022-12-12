package j37_Enum.enum03;

import java.util.ArrayList;

public class Runner {
    /*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 2 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.

 */
    public static void main(String[] args) {
    Kitap ktp1=new Kitap();
    ktp1.name="Leyla Mecnunun nesi oluyor";
    ktp1.kategori=KitapKategori.FANTEZI;
    Kitap ktp2=new Kitap();
        ktp2.name="Ferhat Kimdir Dağlarla Derdi nedir";
        ktp2.kategori=KitapKategori.EKONOMI;
        ArrayList<Kitap> kutuphane=new ArrayList<>();
        kutuphane.add(ktp1);
        kutuphane.add(ktp2);
        for (Kitap k: kutuphane){
            if (k.kategori.equals(KitapKategori.EKONOMI)){
                System.out.println(ktp2.name);
            }
        }
    }
}
