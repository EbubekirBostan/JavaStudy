package j29_Exceptions.Q02._01;

import java.util.ArrayList;
import java.util.List;

public class ClaruswayOkul {
   private String okulAdi;

    public ClaruswayOkul() {
    }

    @Override
    public String toString() {
        return "ClaruswayOkul{" +
                "okulAdi='" + okulAdi + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciler=" + ogrenciler +
                ", okullist=" + okullist +
                '}';
    }

    private int maxOgrenciSayisi;
    private List<ClaruswayItOgrenci> ogrenciler;

    public ClaruswayOkul(String okulAdi, int maxOgrenciSayisi, List<ClaruswayItOgrenci> ogrenciler) {
        this.okulAdi = okulAdi;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.ogrenciler = ogrenciler;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public List<ClaruswayItOgrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<ClaruswayItOgrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public List<ClaruswayOkul> okullist=new ArrayList<>();



}
