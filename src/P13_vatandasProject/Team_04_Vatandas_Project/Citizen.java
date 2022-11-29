package P13_vatandasProject.Team_04_Vatandas_Project;

import java.util.HashMap;

public class Citizen {
    //1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
   private String isim;
   private String adres;
   private String telefon;
   private String kimlikNo;

    public Citizen(String isim, String adres, String telefon) {
        this.isim = isim;
        this.adres = adres;
        this.telefon = telefon;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                " isim= " + isim + '\'' +
                " adres= " + adres + '\'' +
                " telefon= " + telefon + '\'' +
                '}';
    }
}
