package j33_Interface;

import static j33_Interface.icDonanim.KUMAS;
import static j33_Interface.icDonanim.MUSIC;

public class Runner {
    public static void main(String[] args) {
        Sahin dgshn=new Sahin();
        dgshn.ebat();
        dgshn.jant();
        dgshn.kapi();
        dgshn.kaporta();
        dgshn.klima();
        dgshn.koltuk();
        dgshn.motor();
        System.out.println(dgshn.sisLamp());// default conc meth-> obj ile call
        dgshn.sunroof();
        dgshn.yakit();
        System.out.println();


        System.out.println("disDonanim.RENK = " + disDonanim.RENK);
       // icDonanim.KUMAS="deri"; -> CTE final variable atama ya-pıl-mazzz.
        System.out.println("icDonanim.KUMAS = " + KUMAS);
        System.out.println("icDonanim.MUSIC = " + MUSIC);
        System.out.println("icDonanim.RENK = " + icDonanim.RENK);
        System.out.println("Lastik.RENK = " + Lastik.RENK);
        disDonanim.anten();//static conc meth Interface name ile call edildi


    }
}
