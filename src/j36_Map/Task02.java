package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */
        Map<String,String> bkrKrtvzt=new HashMap<>();
        bkrKrtvzt.put("isim","bekir");
        bkrKrtvzt.put("email","bostanebubekir@.com");
        bkrKrtvzt.put("adres","Silifke");
        bkrKrtvzt.put("telefon","5414331633");

        Map<String,String> mehmetKrtvzt=new HashMap<>();
        mehmetKrtvzt.put("isim","mehmet");
        mehmetKrtvzt.put("email","ebik@gabık.com");
        mehmetKrtvzt.put("adres","buyuk dut agacının altı");
        mehmetKrtvzt.put("telefon","125635658586");

        Map<String,Map<String,String>> kartvizit=new HashMap<>();
        kartvizit.put("QA Bekir",bkrKrtvzt);
        kartvizit.put("Dev Mehmet",mehmetKrtvzt);
        System.out.println("kartvizit = " + kartvizit);
        System.out.println("kartvizit.get(\"QA Bekir\").get(\"telefon\") = " + kartvizit.get("QA Bekir").get("telefon"));

        Map<Integer, Task02_Kartvizit> krt=new HashMap<>();
        Task02_Kartvizit k1=new Task02_Kartvizit("Bekir","bekir@","silifke","5414331633");
        krt.put(k1.id,k1);
        System.out.println("krt = " + krt);
        System.out.println("krt.get(k1.id) = " + krt.get(k1.id));
        System.out.println("krt.get(k1.id) = " + krt.get(101));
    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
