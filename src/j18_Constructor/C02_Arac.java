package j18_Constructor;

public class C02_Arac {
    String marka;
    String model;
    int km=10;
    double motorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yil;


    public static void main(String[] args) {
        C02_Arac arac1=new C02_Arac();// default cons ile arac1 obj create edildi
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHcm=2.4;
        //                   volvo          xc60           50000          0                true              2.4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yil+" "+arac1.ikinciEl+" "+arac1.motorHcm);
        // task ->2. bir aracın tüm fieldlarıı atayarak print edin
        C02_Arac arac2=new C02_Arac();
        arac2.marka="Doğan Görünümlü Şahan";
        arac2.model="slx";
        arac2.motorHcm=1.6;
        arac2.ikinciEl=true;
        arac2.yil=1999;
        arac2.km=300000;
        arac2.vitesAuto=true;
        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.km+" "+arac2.yil+" "+arac2.ikinciEl+" "+arac2.motorHcm+""+arac2.vitesAuto);
        System.out.println("arac2 = " + arac2);//arac2 = C02_Arac{marka='Doğan Görünümlü Şahan', model='slx', km=300000, motorHcm=1.6, vitesAuto=true, ikinciEl=true, yil=1999}
    }

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHcm=" + motorHcm +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                '}';
    }
}
