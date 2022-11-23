package j12_Loops.L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        Eğer bir döngünün scope unda döngü bulunuyorsa bu tür döngülere nested*loop(iç içe döngü) denir.
        İç döngü dış döngünün her adımda tekrar çalışır
        içiçe döngülerde en içteki döngü en önce çalışır
         */

        for (int apt=0; apt<=10; apt++){
            System.out.println("Apartman : "+apt);
            for (int daire=1; daire<6; daire++){
                System.out.println("apartman "+apt+" için iç döngü daire : "+daire);
            }
        }






    }
}
