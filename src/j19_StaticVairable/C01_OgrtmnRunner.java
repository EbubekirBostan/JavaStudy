package j19_StaticVairable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {
        C01_Ogrtmn.okul="KABATAŞ ERKEK LİSESİ";
        C01_Ogrtmn hc1=new C01_Ogrtmn("cüneyt",11);
        System.out.println("hc1.tecrube = " + hc1.tecrube);//11
        System.out.println("hc1.isim = " + hc1.isim);//cüneyt
        System.out.println("C01_Ogrtmn.okul = " + C01_Ogrtmn.okul);



        C01_Ogrtmn hc2=new C01_Ogrtmn("bekir",7);
        System.out.println("hc2.tecrube = " + hc2.tecrube);//7
        System.out.println("hc2.isim = " + hc2.isim);//bekir
        System.out.println("C01_Ogrtmn.okul = " + C01_Ogrtmn.okul);


        C01_Ogrtmn hc3=new C01_Ogrtmn("nazim",13);
        System.out.println("hc3.tecrube = " + hc3.tecrube);//13
        System.out.println("hc3.isim = " + hc3.isim);//nazim
        System.out.println("C01_Ogrtmn.okul = " + C01_Ogrtmn.okul);

        hc1.evlilikYildonumu();
        C01_Ogrtmn.maasHesapla();

    }
}
