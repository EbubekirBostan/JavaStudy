package j18_Constructor;

public class C04_Teacher {
    String ad;
    String soyAd;
    String brans;
    int tecrube;
    double maas;
    int id;
    boolean emekli;
    public void dersSaati(){
        System.out.println("agam haftada 20 saatten sonra extraya girer");
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }

    public C04_Teacher() {//PARAMETRELİNİN EZDİĞİ DEFAULT CONS YERİNE P SİZ CONS YAPILDI
    }

    // KİNG OF TRİCK >> PARAMETRELİ CONS. PARAMETRESİZİ DÖGER..
    public C04_Teacher(String ad, String soyAd, String brans, int tecrube, double maas, int id, boolean emekli) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.brans = brans;
        this.tecrube = tecrube;
        this.maas = maas;
        this.id = id;
        this.emekli = emekli;
    }
}
