package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1=new Isci();
        mrb1.maasBilgisi();
        mrb1.maasHesapla();
        mrb1.name="Ebubekir Güzel İnsan :)";
        System.out.println("mrb1.name = " + mrb1.name);
        mrb1.sigorta();//abs Parent class'daki conc meth obj ile call
        IdariPersonel cncCdr=new IdariPersonel();
        cncCdr.name="Dilek orjiklerin efendisi :) ";
        System.out.println(cncCdr.name);
        cncCdr.sigorta();
        cncCdr.maasHesapla();
        cncCdr.maasBilgisi();



    }
}
