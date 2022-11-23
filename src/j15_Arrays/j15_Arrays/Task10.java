package j15_Arrays.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
           */
        Scanner sc=new Scanner(System.in);
        int array[]=new int[6];
        for (int i = 0; i < array.length ; i++) {
            System.out.print(i+". Elemanları işaretleri olacak şekilde giriniz: ");
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i :array) {
            i=i*(-1);
            System.out.print("i = " + i);
        }
    }


}
