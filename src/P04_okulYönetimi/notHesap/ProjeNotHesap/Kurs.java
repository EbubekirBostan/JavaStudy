package P04_okulYönetimi.notHesap.ProjeNotHesap;
/*
fields (variable) : name,code,prefix,note,Teacher--> ad, ünvan, notYazılı, notSozlu, öğretmen,
Methods : Course() , addTeacher() , printTeacher()--> kurs(), öğretmenEkle(), öğretmenYazdır()
 */

public class Kurs {
    Ogretmen ogretmen;
    String name;
    int code;
    String prefix;
    int notYazili;
    int notSozlu;
    double sozluNotEtkisi;

    public Kurs() {
    }

    public Kurs(String name, int notYazili, int notSozlu) {
        this.name = name;
        this.notYazili = notYazili;
        this.notSozlu = notSozlu;
    }

    public Kurs(String name, int code, String prefix, double sozluNotEtkisi) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.sozluNotEtkisi = sozluNotEtkisi;
    }
    public void addOgretmen(Ogretmen ogrt){
        this.ogretmen=ogrt;
    }
    public void printOgretmen(Ogretmen ogrt){
        System.out.println("Ogretmen : " + ogrt.getAd()+" "+ogrt.getBrans()+" "+ogrt.getId());

    }




}
