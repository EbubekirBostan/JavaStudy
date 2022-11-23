package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class _12_method12 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */
    // TASK 02
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int sayi=scan.nextInt();
        System.out.println(ucUssumu(sayi));
    }

    private static boolean ucUssumu(int sayi) {
        boolean ucUssumu=true;
        if (sayi%3==0){
            if (sayi%3==0){
                ucUssumu=true;
            }else ucUssumu=false;
        }else ucUssumu=false;
        return ucUssumu;
    }


}
