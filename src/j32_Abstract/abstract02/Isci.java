package j32_Abstract.abstract02;

public class Isci extends Personel {// abs Personel Parent classa  extends-> concrete child işçi classı
    @Override
    public void maasHesapla() {//Personel parrent classdan override edilen abs meth
        System.out.println("agam marabalara ençok yevmiye 499 gayme verilir");
    }

    @Override
    public void maasBilgisi() {//Personel parrent classdan override edilen abs meth
        System.out.println("Agam marabalar cay-cüğara hariç günde 8 saat kürek mahkumu");
    }
}
