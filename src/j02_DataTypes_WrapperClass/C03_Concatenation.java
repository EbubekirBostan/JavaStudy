package j02_DataTypes_WrapperClass;

public class C03_Concatenation {

    public static void main(String[] args) {

        String ad="Ebubekir";
        String soyad="Bostan";

        int a=7;
        int b=11;

        // Birden çok String variable ile farklı data type variable'lar + ile işleme alınırsa
        // java birleştirme yaparak yeni bir String oluşturur



        System.out.println(ad+soyad+a+b);

        System.out.println(a+ad+soyad+b);

        System.out.println(" "+a+b);

        System.out.println(ad+soyad+(a+b));

        System.out.println((a+b)+ad+soyad);

        System.out.println(ad+(a-b)+(a-b));


        // TRİCK String souta girdiği zaman sonuç ona göre çıkar yani String
        // Ancak parantez içinin içinde string yoksa int çalışır toplar çıkarır

        System.out.println(ad+((a-b)+(a-b)));

        char ch='1';
        System.out.println(ad+ch);

        System.out.println(a+ch+ad);

        System.out.println(ad+(ch+b));

        System.out.println(a+ad+ch);

        /* TRİCK char data türü işleme girdiği variables'in türüne göre farklı işlem yapar
        eğer işleme girdiği variables aritmetik işlemse ascii değeri ile işlem yapar
         */








    }
}
