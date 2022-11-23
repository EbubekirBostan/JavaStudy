package j14_Scope;

public class C02_StaticVariable {
    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir


 */
    static String firmaName="clarusway";
    static int firmaID;
    static boolean firmaIT;

    public static void main(String[] args) {
        System.out.println("firmaID = " + firmaID);
        firmaID=1001;
        System.out.println("firmaID = " + firmaID);
        C02_StaticVariable.firmaIT=true;//classname ile static variable call -> bad practice
        staticMethod();//static method gelir;non static method gelmez.
        String s = "Bootcamp is BootcaMp";
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("M"));
        System.out.println(s.indexOf('o',3));
        System.out.println(s.indexOf("camp",2));
        System.out.println(s.indexOf("Bootcamp"));
        String a = "Clarusway";
        String b = "Bootcamp";
        System.out.println(a.concat(b).length());

    }
    public static void staticMethod(){
        firmaID=2002;// static variable call edildi.
        System.out.println("firmaID = " + firmaID);
    }
    public void non_staticMethod(){
        firmaName="javaCAN";
        System.out.println("firmaName = " + firmaName);
    }
}
