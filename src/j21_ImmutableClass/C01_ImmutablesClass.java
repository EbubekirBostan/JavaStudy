package j21_ImmutableClass;

public class C01_ImmutablesClass {
    public static void main(String[] args) {
        String str1="murat";// ilk değeri murat atanan str1 variable
        String str2="murat";// str1 ve str2 aynı ilk değere sahip oldg için String havuzunda ortak referans atanır

        String str3=new String("murat");//değerleri aynı ref farklı obj
        String str4=new String("murat");//değerleri aynı ref farklı obj

        String str5=str1+"";
        System.out.println("str1==str2 = " + (str1 == str2));//T
        System.out.println("str1==str3 = " + (str1 == str3));//F
        System.out.println("str1.equals(str2) = " + (str1.equals(str2)));//T
        System.out.println("str3==str4 = " + (str3 == str4));//F
        System.out.println("str1==str5 = " + (str1 == str5));//F
        System.out.println("str1.equals(str5) = " + (str1.equals(str5)));//T


    }
}
