package Day06;

public class Q7_ForLoop {
    public static void main(String[] args) {
        /*
        /*
 Interview Question
 1'den 100'e kadar olan sayilari yazdiriniz..
 Ancak kodunuzda herhangi bir sayi kullanmayiniz!
 */
        String str = "d";
        for (int i = str.length(); i <= 'd'; i++) {
            System.out.print(" " + i);
        }
        int i = 'd';
        int j = 'e' - 'd';
        for (int a = j; j < i; j++) {
            System.out.println(j);


        }
    }
}
