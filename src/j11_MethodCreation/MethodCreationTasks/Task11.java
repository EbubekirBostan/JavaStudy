package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.

    */
        // TASK 11
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz : ");
        String cumle=scan.nextLine();
        System.out.println(hackerDili(cumle));
    }

    private static String hackerDili(String cumle) {
        cumle=cumle.replaceAll("s","5");
        cumle=cumle.replaceAll("a","4");
        cumle=cumle.replaceAll("e","3");
        cumle=cumle.replaceAll("i","1");
        cumle=cumle.replaceAll("o","0");

        return cumle;


    }


}