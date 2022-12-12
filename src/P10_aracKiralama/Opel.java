package P10_aracKiralama;

public class Opel extends Arac {

    public Opel(String model, String yakit, String vites, double gunlukUcret) {
        super(model, yakit, vites, gunlukUcret);
    }

    @Override
    public void modelEkle() {
        modeller.add(new Volvo("Astra","Dizel","Otomatik",750));
        modeller.add(new Volvo("Insignia","Benzin","Otomatik",1000));
        modeller.add(new Volvo("Mokka","Dizel","Otomatik",1500));
    }
}
