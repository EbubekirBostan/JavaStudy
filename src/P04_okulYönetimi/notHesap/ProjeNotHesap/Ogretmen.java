package P04_okulYönetimi.notHesap.ProjeNotHesap;

public class Ogretmen {
   private String ad;
    private String brans;
    private int id;

    public Ogretmen(String ad, String brans, int id) {
        this.ad = ad;
        this.brans = brans;
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ad='" + ad + '\'' +
                ", brans='" + brans + '\'' +
                ", id=" + id +
                '}';
    }
}
