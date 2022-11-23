package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		Scanner scan=new Scanner(System.in);
		System.out.println("Çevirmek istediğiniz saati giriniz");
		double saat=scan.nextDouble();
		System.out.println(saniye(saat)+" Saniyedir");
		System.out.println("Çevirmek istediğiniz mil i giriniz");
		double mil=scan.nextDouble();
		System.out.println(kilometre(mil)+" Kilometredir");
		System.out.println("Çevirmek istediğiniz kilogramı giriniz");
		double kg= scan.nextDouble();
		System.out.println(gram(kg)+ " Gramdır");
	}

	private static double gram(double kg) {
		double gram=(kg*1000);
		return gram;
	}

	private static double kilometre(double mil) {
		double km=(mil*1.609344);
		return km;
	}

	private static double saniye(double saat) {
		double sny=(saat*60*60);
		return sny;
	}


}
