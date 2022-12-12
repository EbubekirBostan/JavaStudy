package P10_aracKiralama;

import java.util.ArrayList;
import java.util.List;

public class Honda extends Arac {
    static ArrayList<Honda> model=new ArrayList<>();

    public Honda(String model, String yakit, String vites, double gunlukUcret) {
        super(model, yakit, vites, gunlukUcret);
    }

    public Honda() {

    }

    @Override
    public String toString() {
        return "Honda{" +
                ", modeller=" + model +
                '}';
    }

    @Override
    public void modelEkle() {
        Honda civic=new Honda("Civic","Dizel","Otomatik",1000);
        model.add(civic);
        Honda jazz=new Honda("Jazz","Benzin","Otomatik",750);
        model.add(jazz);
        Honda crv=new Honda("CRV","Hybrid","Otomatik",3000);
        model.add(crv);

    }

    }



