package P10_aracKiralama;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public abstract class Arac {
   private String model;
   private String yakit;
   private String vites;
   private double gunlukUcret;
   HashMap<Integer,List<Arac>> araclar=new HashMap<>();
   List<Arac> modeller=new ArrayList<>();


    public Arac(String model, String yakit, String vites, double gunlukUcret) {
        this.model = model;
        this.yakit = yakit;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
    }

    public Arac() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }
    public abstract void modelEkle();

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                ", araclar=" + araclar +
                ", modeller=" + modeller +
                '}';
    }
}
