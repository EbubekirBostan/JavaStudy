package P04_okulYönetimi.notHesap.ProjeNotHesap;
/*
fields : name,stuNo,classes,course1,course2,course3
Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
-->öğrenci(), topluSınavNotuEkle(), gectiMi() ortlamaHesapla(), notYazdır()
 */

public class Ogrenci {
    String isim;
    int stuNo;
    String sinif;
    Kurs mat;
    Kurs fiz;
    Kurs tur;
    double ortalamaGenel;

    public Ogrenci() {
    }

    public Ogrenci(String name, int stuNo, String sinif, Kurs mat, Kurs fiz, Kurs tur) {
        this.isim = name;
        this.stuNo = stuNo;
        this.sinif = sinif;
        this.mat = mat;
        this.fiz = fiz;
        this.tur = tur;
    }
    public void topluSinavNotuEkle(Kurs kurs,int yazili, int sozlu){
        kurs.notYazili=yazili;
        kurs.notSozlu=sozlu;
    }
    public double ortalama(){
        return ortalamaGenel=((mat.notSozlu*mat.sozluNotEtkisi+mat.notYazili*(1-mat.sozluNotEtkisi))+
                (fiz.notSozlu*fiz.sozluNotEtkisi+fiz.notYazili*(1-fiz.sozluNotEtkisi))+
                (tur.notSozlu*tur.sozluNotEtkisi+tur.notYazili*(1-tur.sozluNotEtkisi)))/3;

    }
    public String gectiMi(){
        if (ortalamaGenel<50){
            return "Kaldı";
        }else return "Geçti";
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", stuNo=" + stuNo +
                ", sinif='" + sinif + '\'' +
                ", mat=" + mat + mat.notYazili+","+mat.notSozlu+
                ", fiz=" + fiz + fiz.notYazili+","+fiz.notSozlu+
                ", tur=" + tur + tur.notYazili+","+tur.notSozlu+
                ", ortalamaGenel=" + ortalamaGenel +
                ", GeçtiMi=" + gectiMi() +
                '}';
    }



}
