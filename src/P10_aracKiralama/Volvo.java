package P10_aracKiralama;

public class Volvo extends Arac{

    public Volvo(String model, String yakit, String vites, double gunlukUcret) {
        super(model, yakit, vites, gunlukUcret);
    }

    @Override
    public void modelEkle() {
        modeller.add(new Volvo("XC40","Dizel","Otomatik",3000));
        modeller.add(new Volvo("XC60","Hybrid","Otomatik",4000));
        modeller.add(new Volvo("S60","Benzin","Otomatik",2000));
        modeller.add(new Volvo("S40","Benzin","Manuel",1500));
    }
}
