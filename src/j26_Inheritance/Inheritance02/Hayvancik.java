package j26_Inheritance.Inheritance02;

public class Hayvancik {// Grand Parent Super class
    public Hayvancik() {// p siz cons
        System.out.println("Agam ahan da HAYVANCIK p'siz cons...");
    }
    public Hayvancik(int i) {// p li cons
        System.out.println("Agam ahan da HAYVANCIK p'li cons...");
    }
    public void mA(){
        System.out.println("mA - > Hayvancık class method call.");
    }
    public void mM(){
        System.out.println("mM - > Hayvancık class method call.");
    }
     int a;
    int m=3;
}
