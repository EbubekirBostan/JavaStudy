package j29_Exceptions;

import java.io.IOException;
import java.util.Scanner;
 /*
            Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
        edip mainde kontrol ediniz.
        Trick->
        sicaklikKontrol(int sıcaklık){
        throw new IOException("Hava Gerçekten soğuk dışarı çıkma");
           }
        main(){
        Scanner ...
        try{
         sicaklikKontrol(int sıcaklık);
        }
        catch (IOException e) {

         */

public class Task02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double isi=0;

            try {
                System.out.println("Sıcaklık Giriniz: ");
                isi=sc.nextDouble();
                 sicaklikKontrol(isi);
                System.out.println("Hava güzel çık kemiklerin ısınsın");

            } catch (IOException e) {
                System.out.println(e);
                e.getStackTrace();
                System.out.println("e.getMessage() = " + e.getMessage());
                System.out.println("Kısa kollu ile çık daha çabuk ölürsün");

            }catch (Exception e){
                sc.next();
                System.out.println("Sıcaklık değeri harflerle olmaz canım");

            }
        }

    private static void sicaklikKontrol(double isi) throws IOException {
       if (isi<10){
           throw new IOException("Hava Gerçekten soğuk dışarı çıkma");
       }
    }
}

