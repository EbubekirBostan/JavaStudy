package P10_aracKiralama;

public class Audi extends Arac{

    public Audi(String model, String yakit, String vites, double gunlukUcret) {
        super(model, yakit, vites, gunlukUcret);
    }

    @Override
    public void modelEkle() {
        modeller.add(new Audi("A3","Benzin","Otomatik",3000));
        modeller.add(new Audi("A6","Benzin","Otomatik",3500));
        modeller.add(new Audi("Q5","Dizel","Otomatik",4000));
        modeller.add(new Audi("Q7","Dizel","Otomatik",6000));

    }
}
