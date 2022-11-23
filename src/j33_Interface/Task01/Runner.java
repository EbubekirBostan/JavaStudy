package j33_Interface.Task01;

public class Runner {
    public static void main(String[] args) {
        Cember c=new Cember();
        System.out.println("c.alani(4) = " + c.alani(4));
        System.out.println("c.cevresi(4) = " + c.cevresi(4));
        Dikdortgen d=new Dikdortgen();
        System.out.println("d.alani(4,5) = " + d.alani(4, 5));
        System.out.println("d.cevresi(4,5) = " + d.cevresi(4, 5));
        System.out.println("d.cevresi(24,38) = " + d.cevresi(24, 38));
        Kare k=new Kare();
        System.out.println("k.alani(5) = " + k.alani(5));
        System.out.println("k.cevresi(8) = " + k.cevresi(8));
    }
}
