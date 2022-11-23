package j18_Constructor;

public class C07_Ogrtm {
    //Fields
    String isim;
    int tecrube;
    int kidem=5;

    public C07_Ogrtm(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public void kidemHesapla(int kidem){
        System.out.println("agam kıdem : "+(kidem*2));// method parametre değeri kıdeme atanır
        System.out.println("agam kıdem : "+(this.kidem*2));// this herzaman instance variable bağlar
    }
}
