package lambdaCodeChallenge;
import j99_Lambda.C01_LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;
public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        yazdir(list);
        System.out.println("negatifYazdir(list) = " + negatifYazdir(list));
        pozitifList(list);
        System.out.println("kareList(list) = " + kareList(list));
        System.out.println("kareTekrarsiz(list) = " + kareTekrarsiz(list));
        sirala(list);
        sirala2(list);
        System.out.println(son5bas(list));
        System.out.println(son5basDegil(list));
        System.out.println("topla(list) = " + topla(list));
        System.out.println("negatifKareList(list) = " + negatifKareList(list));
        besBykSyi(list);
        sifirKckSyi(list);
        yuzEsitElmYokMu(list);
        System.out.println("ilkBesElmTpl(list) = " + ilkBesElmTpl(list));
        sonBesElmTpl(list);
    }
    // S10 :list elemanlarini toplamini bulalim
    private static int topla(List<Integer> list) {
        System.out.println();
        return list.stream().reduce(0, (x,y) ->(x+y));
    }
    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
    private static List<Integer> negatifKareList(List<Integer> list) {
        return list.stream().filter(x->x<0).peek(x-> System.out.println("negatifler :" + x )).
                map(x-> x*x).peek(x-> System.out.println(" kareleri :" + x)).collect(Collectors.toList());
    }
    /*
     peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
    ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
    yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir
     */
    // S12 : listeden 5 den buyuk  sayi var mi? -anyMatch
    public static void besBykSyi(List<Integer> list){
        System.out.println("list.stream().anyMatch(t->t>5) = " + list.stream().anyMatch(t -> t > 5));
    }
    // S13 : listenin tum elemanlari sifirdan kucuk mu?
    public static void sifirKckSyi(List<Integer> list){
        System.out.println("list.stream().allMatch(m-> m<0) = " + list.stream().allMatch(m -> m < 0));
    }
    // S14: listenin 100 e esit elemani yok mu ?
    public static void yuzEsitElmYokMu(List<Integer> list){
        System.out.println("list.stream().noneMatch(eb->eb==100) = " + list.stream().noneMatch(eb -> eb == 100));
    }
    // S15: listenin sifira esit elemani yok mu?
    public static void sifirEsitElmYokMu(List<Integer> list){
        System.out.println("list.stream().noneMatch(e->e==0) = " + list.stream().noneMatch(e -> e == 0));
    }
    // S16:  listenin ilk 5 elemanini topla?
    public static Optional<Integer> ilkBesElmTpl(List<Integer> list){
        Optional <Integer> Toplam=list.stream().limit(5).reduce(Integer::sum);
        return Toplam;
    }
    // S17: listenin son bes elemaninin  listele
    public static void sonBesElmTpl(List<Integer> list){
      list.stream().skip(list.size()-5).forEach(C01_LambdaExpression::yazdir);

    }
// S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
    private static  List<Integer> son5basDegil(List<Integer> list) {
        System.out.println();
        return list.stream().filter(x->x>0).map(t->t*t).filter(x->x%10 !=5 ).collect(Collectors.toList());
    }
    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    private static List<Integer> son5bas(List<Integer> list) {
        System.out.println();
        return list.stream().filter(x->x>0).map(t->t*t*t).filter(x->x%10 ==5 ).collect(Collectors.toList());
    }
    // S7: listin elemanlarini buyukten kucuge siralayalim
    private static void sirala2(List<Integer> list) {
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));
    }
    // S6: listin elemanlarini kucukten buyuge siralayalim
    private static void sirala(List<Integer> list) {
        list.stream().sorted().forEach(x-> System.out.print(x+ " "));
    }
    // S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
    private static List<Integer> kareTekrarsiz(List<Integer> list) {
        System.out.println();
        return list.stream().map(t -> t * t).distinct().collect(Collectors.toList());
    }
    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    private static List<Integer> kareList(List<Integer> list) {
        System.out.println();
        return list.stream().map(t -> t * t).collect(Collectors.toList());
    }
    // S3: pozitif olanlardan yeni bir liste olustur
    private static void pozitifList(List<Integer> list) {
        System.out.println();
        System.out.println(list.stream().filter(t -> t > 0).collect(Collectors.toList()));
    }
    // S2: sadece negatif olanlari yazdir
    private static List<Integer> negatifYazdir(List<Integer> list) {
        return list.stream().filter(x -> x < 0).collect(Collectors.toList());
    }
    // S1:listi aralarinda bosluk birakarak yazdiriniz
    private static void yazdir(List<Integer> list) {
        System.out.println();
        list.stream().forEach(x -> System.out.print(x + " "));
    }
}