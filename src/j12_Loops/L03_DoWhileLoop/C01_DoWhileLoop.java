package j12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While loop-> önce şart kontrol edilir eğer true alınırsa scope run olur.
        Do- While loop-> önce loop scope çalışır sonra şart kontrol edilir şart true ise döngü devam eder. şart
        false ise döngü kırılır ve döngüden sonraki ilk satır çalışır.
        *do-While-> game app de daha çok kullanılır.
        Trick>> While loop şart sağlanmazsa hiç çalışmayabilir ama do-while şart sağlasın sağlamasın en az bir kez çalışır
         */
        int yas=33;
        while (yas<33){
            System.out.println("agam yas "+yas+" gayet basarılı:)");
            System.out.println("while body action...");
            yas++;
        }
        do {
            System.out.println("agam yas 33 gayet basarılı:)");
            System.out.println("do while body action...");
            yas++;
        }while (yas<33);









    }
}
