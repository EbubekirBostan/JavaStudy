package j18_Constructor;

public class C05_Arac {
    // Fields -> objenin üretilirken alacağı değer variables
    // Bir class da birden çok cons. tanımlanabilir. (cons. overload)
    /*
    1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
     */
    int maxHiz;
    String model;

    public C05_Arac() {// sefil prmtsiz cons.
    }

    public C05_Arac(int maxHiz) {// 1 prmtli cons.
        this(180,"HacıMurat");//2 p'li cons. call edildi..ilk satıra yazılmalı
                                            // yoksa cte verir
        this.maxHiz = maxHiz;//->this keyword parmetre değeri inst. variable atama yapar
        //obj maxHız değeri parmetrden alır
        System.out.println("agam bu yazıyı okuduysan 1pli cons. call edilmiştir");
    }

    public C05_Arac(int maxHiz, String model) {//2 parmt li cons
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("agam bu yazıyı okuduysan 2pli cons. call edilmiştir");
    }

}
