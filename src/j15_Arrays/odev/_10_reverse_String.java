package j15_Arrays.odev;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String hi="Hello World";
        String hello[]=hi.split("");
        for (int i = hello.length-1; i >=0 ; i--) {
            System.out.print(hello[i]);
        }


    }
}