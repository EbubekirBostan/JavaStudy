package p01_Projeler.Kitap_Yönetimi.Deneme;

public class EklenecekKitaplar {
    int kitapNo;
    String kitapAdi;
    String yazarAdi;
    int kitapFiyati;

    public EklenecekKitaplar(int kitapNo, String kitapAdi, String yazarAdi, int kitapFiyati) {
        this.kitapNo = KitapEkle.count;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyati = kitapFiyati;
    }

    public EklenecekKitaplar() {
    }
}
