package clarusWay_InterviewQuestionsJava.src.day1;

import java.util.Scanner;
public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir string giriniz : ");
        String str = scanner.nextLine();
        System.out.print("bir sayi giriniz :");
        int sayi = scanner.nextInt();
        System.out.println(ilkSonHarf(str, sayi));
        System.out.println("ilkSonHarfler(str,sayi) = " + ilkSonHarfler(str, sayi));
    }
    public static String ilkSonHarfler(String s,int a){
        String yeni=(s.substring(0,1)+s.substring(s.length()-1)).repeat(a);
        return yeni;
    }
    private static String ilkSonHarf(String str, int sayi) {
        String ilkSonHarfler = str.substring(0,1) + str.substring(str.length()-1);
        System.out.println("ilkSonHarfler = " + ilkSonHarfler);
        String output ="";
        for (int i = 0; i < sayi; i++) { //birlesimden kac tane yazdiracaksam onu verir
            output+= ilkSonHarfler;
        }
        return output;
    }
}