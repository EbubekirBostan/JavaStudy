package j15_Arrays.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
		Scanner sc=new Scanner(System.in);
		System.out.print("Kaç elemanlı array istiyorsun: ");
		int a[]=new int[sc.nextInt()];
		for (int i = 0; i <a.length ; i++) {
			System.out.println(i+". İndex elemanı giriniz: ");
			a[i]=sc.nextInt();
		}
		System.out.println("a isimli Array : "+Arrays.toString(a));
		int ya[]=new int[a.length];
		for (int i =0; i <a.length ; i++) {
		if (i==a.length-1){
			ya[i]=a[0];
		}else ya[i]=a[i+1];
		}
		System.out.println("yeni a isimli Array : "+Arrays.toString(ya));


	}

}
