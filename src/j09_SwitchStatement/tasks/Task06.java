package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
		Scanner scan=new Scanner(System.in);
		System.out.println("VIP kısaltmasında öğrenmek istediğiniz harfi giriniz");
		char vip=scan.next().toLowerCase().charAt(0);

		switch (vip){
			case 'v':
				System.out.println("v = Very ");
				break;
			case 'i':
				System.out.println("i = Important ");
				break;
			case 'p':
				System.out.println("p = Person ");
				break;
			default:
				System.out.println("Hatali Giris Yaptiniz ");
				break;


		}









	}
}
