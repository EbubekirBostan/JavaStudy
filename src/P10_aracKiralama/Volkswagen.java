package P10_aracKiralama;

public class Volkswagen extends Arac {

    public Volkswagen(String model, String yakit, String vites, double gunlukUcret) {
        super(model, yakit, vites, gunlukUcret);
    }

    @Override
    public void modelEkle() {
        modeller.add(new Volvo("Golf","Dizel","Manuel",1000));
        modeller.add(new Volvo("Passat","Benzin","Manuel",2000));
        modeller.add(new Volvo("Tiguan","Benzin","Otomatik",2500));
    }
}
