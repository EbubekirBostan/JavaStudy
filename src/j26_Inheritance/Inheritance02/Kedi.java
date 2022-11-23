package j26_Inheritance.Inheritance02;

public class Kedi extends Memeli {// Memeli parent class child'i
    public Kedi() {
        super();
        System.out.println("Agam ahan da kedi p'siz cons..");
    }
    public Kedi(String str) {// pli
        this();
        System.out.println(super.c);
        System.out.println("Agam ahan da kedi p'li cons..");
    }
    int c=2;
    int d=5;

    @Override// override rotasyonu overidden method ile overriding methodu ilişkilendirir.
    public void mC() {// Memel parentten ezen method
        System.out.println("mC - > Kedi class method call.");
    }
}
