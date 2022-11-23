package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>(Arrays.asList("Nur","Gamze","Erol","Bekir"));
        System.out.println("l1 = " + l1);//[Nur, Gamze, Erol, Bekir]
        // l1 elemanları for loop ile print ediniz
        for (int i = 0; i <l1.size() ; i++) {
            System.out.println(l1.get(i)+ " ");
        }
        System.out.println("*****");
        // l1 elemanları for each ile print ediniz
        for (String w:l1){
            w=w+"!";
        }
        System.out.println("bizim "+l1);
        // l1 herbir elemanı :-) for loop ile update edip print ediniz
        for (int i = 0; i < l1.size() ; i++) {
            l1.set(i, l1.get(i)+":-)");
        }
        System.out.println(l1);

        //her bir elemanı :-) for each loop ile update edip print ediniz..

      // for (String a: l1){
      //     l1.set(l1.indexOf(a),a+":-(");
      // }
      // System.out.println(l1);
        /*
        index desteklemeyen yapılarda tekrarlayan aksiyon için for-each loop update yapamayabilir
        yukardaki taskte olduğu gibi.. Bu durumda Iterator tanımlanacak variable ile tekrarlayan aksiyonlar
        index olmadan yapılır.
       */
        System.out.println("***Iterator***");
        System.out.println(l1);
        Iterator<String> it1=l1.iterator();// Iterator intface'den it1 variable tanımlandı. Atama olarak l1 elemanları
        //atandı
        while (it1.hasNext()){//hasnext()-> it1 elemanları için pointer old yerde eleman varsa true yoksa false verir
            // ve pointer bir sonraki eleman önüne koyulur
           // it1.next();//next() ->Listin önündeki elemanını return eder
            System.out.print(it1.next()+ " ");//Nur:-) Gamze:-) Erol:-) Bekir:-)


        }
        List<String> l2=new ArrayList<>(Arrays.asList("Baran","Gülsüm","Akif","Nazım"));
        // l2 elemanlarını ıterator ile silip print ediniz-> l2=[]
        Iterator<String> it2=l2.iterator();
        while (it2.hasNext()){// tekrardaki pointer önünde eleman varlığını kontrol eder
            it2.next();// tekrarda ki pointer önündeki elemanı verir
            it2.remove();//next() ile gelen elemanı siler
            }
        System.out.println("l2 = " + l2);
        List<String> l3=new ArrayList<>(Arrays.asList("Baran","Gülsüm","Akif","Nazım"));

        ListIterator<String> it3= l3.listIterator();
        while (it3.hasNext()){
            it3.set(it3.next()+":-)");
        }
        System.out.println("l3 = " + l3);
        List<String> l4=new ArrayList<>(Arrays.asList("Serhat","Yakup","Mustafa","Nazlı"));
        // l3 elemanlarının ilk harfi büyük kalan 3 harfi *** karakteri ve l4 listi ekleyip print ediniz
       ListIterator<String> ebikGabık= l3.listIterator();
        while (ebikGabık.hasNext()){
            ebikGabık.set(ebikGabık.next().toUpperCase().charAt(0)+"***");
            ebikGabık.add(l4.toString());//tekrarda ki update edilen l3 e l4 add edildi
        }
        System.out.println("l3 = " + l3);










    }
}
