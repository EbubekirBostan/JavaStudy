package j36_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map.putAll();->Girilen map'i istenen map'e ekler.
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        HashMap<String, String> hm1 = new HashMap<>();

        hm1.put("köfteci yusuf", "kaburga ızgara");
        hm1.put("starBucks", "flat White");
        hm1.put("güllüoğlu", "cennet çamuru");
        hm1.put("nusret", "dana spagetti");
        hm1.put("clarusway", "bolcana offer");
        hm1.put("javaCAN", "javaNaz");

        System.out.println("hm = " + hm);//hm = {Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro,
        // MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
        hm.putAll(hm1);
        System.out.println("hm = " + hm);//hm = {güllüoğlu=cennet çamuru, Saturn=300 Euro, Ebay=234 Euro,
        // starBucks=flat White, Apple store=333 Euro, köfteci yusuf=kaburga ızgara, clarusway=bolcana offer,
        // MediaMarkt=183 Euro, javaCAN=javaNaz, Amazon=296 Euro, nusret=dana spagetti, Vatan=111 Euro}

        //cincix code...
        HashMap<String, String> hm2 = new HashMap<>(hm1);// hm2 map hem tanımlandı hemde entry olarak hm1 parametre
        //olarak entry atandı
        HashMap<String, String> hm3 =hm1;
        System.out.println("hm3 = " + hm3);
        System.out.println("hm2 = " + hm2);//hm2 = {güllüoğlu=cennet çamuru, starBucks=flat White,
        // köfteci yusuf=kaburga ızgara, clarusway=bolcana offer, javaCAN=javaNaz, nusret=dana spagetti}


    }
}
