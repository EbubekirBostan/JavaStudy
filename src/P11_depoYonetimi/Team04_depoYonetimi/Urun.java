package P11_depoYonetimi.Team04_depoYonetimi;

import java.util.HashMap;
import java.util.Map;

public class Urun {
    private   String urunIsmi;
    private   int urunId;
    private   String uretici;
    private   int miktar;
    private   String birim;
    private String raf;
    public Urun(String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }
    public Urun() {
    }
    public String getUrunIsmi() {
        return urunIsmi;
    }
    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }
    public int getUrunId() {
        return urunId;
    }
    public void setUrunId(int urunId) {
        this.urunId= urunId;
    }
    public String getUretici() {
        return uretici;
    }
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
    public int getMiktar() {
        return miktar;
    }
    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
    public String getBirim() {
        return birim;
    }
    public void setBirim(String birim) {
        this.birim = birim;
    }
    public String getRaf() {
        return raf;
    }
    public void setRaf(String raf) {
        this.raf = raf;
    }
    @Override
    public String toString() {
        return "Urun{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }

}