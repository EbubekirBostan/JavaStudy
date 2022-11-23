package j29_Exceptions.Q02._01;

public class ClaruswayItOgrenci {
    /*
             1- fieldları ad, soyad, yas olan bir It pojo class'ı create ediniz.

     2- fieldları okulAd, maxOgrenciSayisi,
        ArrayList cinsinden Öğrencileri olan bir Clarusway pojo class create ediniz,

     3- main metodunun olduğu OkulMain isimli bir class create ediniz.

     4- bir okul obj create edip, bu okula max öğrenci miktarına ulaşana kadar öğrenci
        ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
        bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
     */
   private String ad;
   private String soyad;
   private int yas;

    public ClaruswayItOgrenci(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public ClaruswayItOgrenci() {
    }





    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


}
