package j18_Constructor;

public class C03_Student {// main olmayan sadece student obj create etmek için pojo->plan old java object: obj için
    //standart kalıphane
    //Fields
    String ad;
    String soyAd;
    int sinif;
    double ortlama;
    int okulNo;
    boolean takdir;
    public void mezuniyet(){// method
        if (ortlama>=50){
            System.out.println("agam diploman hayırlı olsun");
        }else System.out.println("agam seneye de bekleriz devamkee");
    }

    @Override
    //Generate>>>tostring yap o kadar
    public String toString() {// objenin referans değeri print etmemesi için obj datalarını stringe çeviren method oluştu
        return "{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", sinif=" + sinif +
                ", ortlama=" + ortlama +
                ", okulNo=" + okulNo +
                '}';
    }
}
