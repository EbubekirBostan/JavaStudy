package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /* TASK :
 Kullanıcıdan alacağınız 6 elemanlı bir dizinin
 sadece tek elemanlarını ayrı diziye bir metodda atayarak
  yazdırınız.
 */
        int sayiArr[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <sayiArr.length ; i++) {
            System.out.println(i+1+". elemanı giriniz");
            sayiArr[i]=sc.nextInt();
        }
        System.out.println("tekElemanlar(sayiArr) = " + tekElemanlar(sayiArr));
    }

    private static ArrayList<Integer> tekElemanlar(int[] sayiArr) {
        ArrayList<Integer> tekSayilar=new ArrayList<>();
        for (int i = 0; i <sayiArr.length ; i++) {
            if (sayiArr[i]%2==1){
                tekSayilar.add(sayiArr[i]);
            }
        }
        Collections.sort(tekSayilar);
        return tekSayilar;
    }
}
