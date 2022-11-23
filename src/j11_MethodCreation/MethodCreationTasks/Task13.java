package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */
        // TASK 13
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk kelime: ");
        String w1= scan.nextLine();
        System.out.print("İkinci kelime: ");
        String w2= scan.nextLine();
        kontrolEt(w1,w2);
    }
    public static void kontrolEt(String w1, String w2) {
        if (w1.endsWith(w2)){
            System.out.println("True");
        }else System.out.println("False");

      //  String x="feminine";
      //  String y="nine";
       // String z="tio";

        //kontrolEt(x,y,z);

    }

  //  public static void kontrolEt(String x, String y, String z) {
       // System.out.println(x.endsWith(y));
       // System.out.println(x.endsWith(z));

    }




