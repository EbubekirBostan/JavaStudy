package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String name="Bekir;";

        int yas=33;

        // Wrapper sarmalayıcı demektir.

        System.out.println( name.toLowerCase());
        System.out.println( name.toUpperCase());



       //TRİCK**

            // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
            // ancak primitive data turlerinin boyle bir ozelligi yoktur
            // primitive data turleri sadece degerleri saklarlar (container) ve herhangi bir özellik(method) vs bulundurmaz.
            //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
            // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
            // ara çözüm imkanı sunmuştur.
        //Task id ve tc String değerlerinin toplamını print eden code yazınız.
        String tc = "1234455";
        String id="98765";

        System.out.println(tc+id);
        int yenitc=Integer.valueOf(tc);
        System.out.println("yenitc = " + yenitc);
        int yeniid=Integer.valueOf(id);
        System.out.println("yeniid = " + yeniid);
        System.out.println(yeniid+yenitc);

      //  String okulNo="234543l";
      //  int yeniokulNo=Integer.valueOf(okulNo); // run time Exception -> çalışma zamanı hatası
        //System.out.println("yeniokulNo = " + yeniokulNo);
       // System.out.println("madem geldin dünyaya otur çalış javaya");

        //TASK byte short int maximum ve minumum değerlerini print eden code yazınız.

        byte maxByteDegeri=Byte.MAX_VALUE;
        byte minByteDegeri=Byte.MIN_VALUE;
        System.out.println("minByteDegeri = " + minByteDegeri);
        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);


    }
}
