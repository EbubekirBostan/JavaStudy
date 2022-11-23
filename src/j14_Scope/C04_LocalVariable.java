package j14_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {
        int yas=33;// main method local varaible
        System.out.println("yas = " + yas);
        for (int i = 0; i <7 ; i++) {
            System.out.println(yas+" :) ");// yas local variable aynı locale call edildi.
        }
        yas=35;//local variable localinde call edildi.
    }
    //yas=48;->>local dışı call edilemez
}
