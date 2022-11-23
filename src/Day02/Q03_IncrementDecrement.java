package Day02;

public class Q03_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("-----Arttirma------");
        int a =1;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println("------Azaltma-----");
        int b=5;
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
        System.out.println("-----soru1-----");
        int x=20;
        int y=15;
        System.out.println(++x + y--);//36
        System.out.println("x = " + x);//21
        System.out.println("y = " + y);//14
        System.out.println(++x + --y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("----soru 2------");
        int k=5;
        System.out.println(++k + k++ + k++ + --k + k-- +k);








    }




}
