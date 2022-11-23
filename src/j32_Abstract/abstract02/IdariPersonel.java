package j32_Abstract.abstract02;

public class IdariPersonel extends Personel{// abs Personel Parent classa  extends-> concrete child idariPersonel classı
    @Override
    public void maasHesapla() {//Personel parrent classdan override edilen abs meth
        System.out.println("Agam fraban idarecimize saat $120 gayme verilir ");
    }

    @Override
    public void maasBilgisi() {//Personel parrent classdan override edilen abs meth
        System.out.println("Agam cıncık code yazana idari personele ekistiradan bir ay ikramiye ");
    }

    @Override
    public void sigorta() {//Personel parrent classdan override edilen conc. meth
        System.out.println("agam cıncık coder personel full sigorta");
    }
}
