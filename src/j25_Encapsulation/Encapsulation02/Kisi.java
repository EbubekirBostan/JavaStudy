package j25_Encapsulation.Encapsulation02;

public class Kisi {
    /*
    Kisi pojo class için fields-> ad.soyad,pasword(String), yaş
    tüm fieldları kullanıcı görebilmeli ve update edebilmeli
    pasword encapsulated update edilmemeli yas variable negatif değer girmeye karşı encapsulated
    runner class da obj ile fieldları print eden code create ediniz

     */

    String ad;
    String soyad;
   private String password;
   private int yas;

    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas = yas;
    }
    public String getPassword() {
        return password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas =Math.abs(yas);
    }
}
