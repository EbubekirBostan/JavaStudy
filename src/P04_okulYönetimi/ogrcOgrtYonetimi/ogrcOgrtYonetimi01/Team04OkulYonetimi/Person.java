package P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi01.Team04OkulYonetimi;

public abstract class Person extends TryCatch {
    String ad;
    String soyad;
   private String kimlikNo;

    public String getKimlikNo() {
        return kimlikNo;
    }

    public String setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public int setYas(int yas) {
        this.yas = yas;
        return yas;
    }

    private int yas;
    public Person() {
    }

    public abstract void ekleme();
    public abstract void arama();
    public abstract void listeleme();
    public abstract void silme();

    public Person(String ad, String soyad, String kimlikNo, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }
}
