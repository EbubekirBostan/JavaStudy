package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir tam sayı Giriniz: ");
		int sayi=sc.nextInt();
		int carp=1;
		while(carp<=10){
			System.out.print(" "+sayi+"x"+carp+"="+carp*sayi);
			carp++;
		}
				

	}

}
