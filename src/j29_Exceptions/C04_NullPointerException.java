package j29_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        //NullPointerException-> null atamsı yapılan bir stringde length() method run edildiğinde oluşan Runte excp.
        String str="";
        System.out.println("str.length() = " + str.length());//0

        String str1=null;
        //System.out.println("str1.length() = " + str1.length());//NullPointerException
        try {
            System.out.println("str1.length() = " + str1.length());// excp try block kırılır catch block çalışmaz
        }catch(NullPointerException e){
            System.out.println("agam hata aldın ben yaptım işin iş");
        }
        try {
            System.out.println("str.length() = " + str.length());// excp olmadığı için try block tamamlaır catch çalışmaz
            System.out.println("try block çalıştı hata yok çünkü");
        }catch(NullPointerException e){
            System.out.println("agam hata aldın ben yaptım işin iş");
        }
        System.out.println("agam handle ettim her zaman olmaz");


    }
}
