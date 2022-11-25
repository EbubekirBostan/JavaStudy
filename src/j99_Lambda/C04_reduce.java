package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class C04_reduce {
    public static void main(String[] args) {
        /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

        */
        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
        List<Integer> sayi1=new ArrayList<>(Arrays.asList(1,3,5,4,6,12,8));
        System.out.println("\n******");
        ciftkareEnB(sayi);//Optional[4356]
        System.out.println("\n******");
        ciftkareEnB(sayi1);//Optional.empty
        System.out.println("\n******");
        elTopla(sayi);
        System.out.println("\n******");
        ciftCarp(sayi1);
        System.out.println("\n******");
        minEl(sayi);
        tkPrint(sayi);

    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftkareEnB(List<Integer> sayi){
        Optional<Integer> maxEleman=sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                map(C01_LambdaExpression::karesi).
                reduce(Integer::max);//Integer classı Math classından daha hızlı çalışır.
        //for each akışta çalışır burada tek bir sayı return eder
        //cift filtrelenen ve karesi alınan akış elemanlarını max elemana göre reduce->azaltıldı
        System.out.println(maxEleman);

        /*Bu daha hızlı çalışır
         System.out.println(sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                map(C01_LambdaExpression::karesi).
                reduce(Math::max));
         */
    }
    //Task Listte ki tüm elemanların toplamını print ediniz
    public static void elTopla(List<Integer> sayi){
        Optional<Integer> toplam=sayi.stream().reduce(Integer::sum);
        System.out.println(toplam);
        System.out.println(sayi.stream().reduce(Integer::sum));
        System.out.println("Lamda expression "+sayi.stream().reduce(0, (a, b) -> a + b));//Lambda expression
        /*
        a: ilk değerini her zaman atanan identity değerden alır.
        b: Değerini her zaman stream() akıştan alır
        a ilk değerden sonraki değerlerini action(işlem body)'den alır
         */


    }
    //task list çift elemanları çarpımını yazdırın
    public static void ciftCarp(List<Integer> sayi){
        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(Math::multiplyExact));
        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(1, (t, u) -> t * u));
    }
    //Task Listteki elemanların enküçüğünü 4 farklı yöntemle print ediniz
    public static void minEl(List<Integer> sayi){
        System.out.println(sayi.stream().reduce(Integer::min));
        System.out.println(sayi.stream().reduce(Math::min));
        System.out.println(sayi.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b));
        System.out.println(sayi.stream().reduce(C04_reduce::byHalukMin));
    }
    public static int byHalukMin(int a, int b){

        return a<b?a:b;
    }
    // Task Listte ki 24 ten buyuk en kucuk tek sayıyı print ediniz.
    public static void tkPrint(List<Integer> sayi){
        System.out.println(sayi.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Integer::min));
    }

}
