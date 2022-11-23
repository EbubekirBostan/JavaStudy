package j10_StringManipulations.tasks1;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Üç Harf Kullanarak Bir İsim Yaziniz");
        String name=scan.nextLine();
        System.out.println( (name.length()==3)? (name.charAt(0)==name.charAt(1)&&name.charAt(0)==name.charAt(2)?"Tüm harfler aynı":name.charAt(0)==name.charAt(2)||name.charAt(0)==name.charAt(1)||name.charAt(1)==name.charAt(2)?"iki harf aynı":"Tüm harfler farklı"):"Lütfen 3 harfli bir isim giriniz"
        );






    }
}