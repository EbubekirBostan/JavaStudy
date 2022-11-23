package j26_Inheritance.Inheritance02;

public class Memeli extends Hayvancik {
    public Memeli() {// psiz cons
        this('Y');
        System.out.println("Agam ahan da Memeli p'siz cons...");
    }
    public Memeli(char c) {//pli cons
        super(17);
        System.out.println("Agam ahan da Memeli p'li cons...");
    }
    public void mC(){
        System.out.println("mC - > Memeliler class method call.");
    }
    int m=1;
    int c=4;

    @Override
    public void mM() {// parentten ezen method
        System.out.println("mM - > Memeliler class method call.");
    }
}
