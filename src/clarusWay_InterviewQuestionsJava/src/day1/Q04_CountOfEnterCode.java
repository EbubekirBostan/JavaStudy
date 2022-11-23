package clarusWay_InterviewQuestionsJava.src.day1;
import java.util.Scanner;
public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        String pin = "sumeyra12345";
        int girisHakki = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Hosgeldiniz****");
        while(true) {
            System.out.println("pin kodu giriniz :");
            String girilenPin = scanner.nextLine();
            if(pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz..");
                break;
            }else{
                System.out.println("yanlis giris yaptiniz...");
                girisHakki--;
                System.out.println("kalan giris hakkiniz : " + girisHakki);
            }if(girisHakki == 0){
                System.out.println("giris hakkiniz kalmadi...sim kartiniz bloke oldu..");
                break;
            }
        }
    }
}
