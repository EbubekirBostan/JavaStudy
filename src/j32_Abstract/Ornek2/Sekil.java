package j32_Abstract.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double alanHesapla();
    public abstract double cevreHesapla();

    public Sekil(String name) {// pli cons
        setName(name);
    }
    //public  void ciz(){
    //    System.out.println(this.name+ " cizildi ");
    //}
    public  String ciz(){
       return this.name+ " cizildi ";
    }

    @Override
    public String toString() {// obje value print eder
        return
                "Sekil ismi='" +this.name + '\'' +
                        "\n sekil alanı : "+this.alanHesapla()+
                        "\n sekil cevre : "+this.cevreHesapla()+
                "\n sekil "+this.ciz();
    }
}
