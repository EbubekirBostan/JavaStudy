package j36_Map;

import java.sql.Array;
import java.util.*;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Kelime Giriniz: ");
        String metin=sc.nextLine();
        String cumle[]=metin.split("\\.");
        List<String> kelime=new ArrayList<>();
        for (int i = 0; i < cumle.length ; i++) {
            kelime.add(String.valueOf(cumle[i].split(" ")));
        }
        HashMap<String,Integer> hm=new HashMap<>();
        int count=0;
        for (int i = 0; i < kelime.size() ; i++) {
            hm.put(kelime.get(i),count);
            for (int j = 0; j < kelime.size() ; j++) {
                if (kelime.get(j).contains(kelime.get(i))){
                    count++;
                }
            }
        }
        System.out.println("hm = " + hm);
//ali ali ata ata bak bak. veli ata bak veli bak ata. can bak ata veli ve ali ile ata bak
    }

}
