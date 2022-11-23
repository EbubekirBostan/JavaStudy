package j29_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        /*NumberFormatException-> Sayiformatında olmayan bir datayı parseInt() method run ederek Integere
        çevrildiğinde oluşan Runte exceptiondur.*/
        // java' da String içinde ki rakam karakterler parseInt() ile integere çevrilir

        String str="1453";
        System.out.println("str = " + str+5);//str = 14535 concat edilir
        int sayi= Integer.parseInt(str);// str deki rakam sayı variabla atandı
        System.out.println("sayi = " + sayi);//1453
        System.out.println("sayi+5 = " + (sayi + 5));//1458

        String id="57l622";
       // System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));//NumberFormatException
        try {
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));
            System.out.println("canım canım komut sorunsuz :)");
        }catch (NumberFormatException e){
            System.out.println("agam hata aldın ben yaptım işin iş");
        }
        try {
            System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str));
            System.out.println("canım canım komut sorunsuz :)");
        }catch (NumberFormatException e){
            System.out.println("agam hata aldın ben yaptım işin iş");
        }
        System.out.println("agam handle ettim her zaman olmaz");
    }
}
