package j29_Exceptions.Q01;

import java.util.Scanner;

public class MyTask {
    /*
    'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
int v = vize
int f = final

Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
Diğer durumlarda ise,
vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
vizeye 120, finale 80 girin.

Programın çalışmasını sağlayın. (handle edin)
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=0;
        int f=0;
        while (true){
             try {
                 System.out.println("Vize notunuzu Giriniz : ");
                 v= sc.nextInt();
                 if (v<0 || v>100){
                     throw new ArithmeticException();
                 }else break;

             }catch(ArithmeticException e){
                 System.out.println("Yavrucum notlarımız 0-100 arası");
             }catch (Exception e){
                 String str=sc.next();//???
                 System.out.println("Hatalı giriş yaptınız");

             }
        }
         while (true){
             try {
                 System.out.println("Final notunuzu Giriniz : ");
                 f= sc.nextInt();
                 if (f<0 || f>100){
                     throw new ArithmeticException();
                 }else break;

             }catch(ArithmeticException e){
                 System.out.println("Yavrucum notlarımız 0-100 arası");
             }catch (Exception e){
                 String str=sc.next();//???
                 System.out.println("Hatalı giriş yaptınız");
             }

         }
        System.out.println("ortalama(v,f) = " + ortalama(v, f));
    }

    private static double ortalama(int v, int f) {
        return (v*0.4)+(f*0.6);
    }
}
