package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
        // TASK 14
        Scanner scan=new Scanner(System.in);
        System.out.println("Is baslama saatinizi giriniz : ");
        double basSaat=scan.nextDouble();
        System.out.println("Is cikis saatinizi giriniz : ");
        double cikSaat=scan.nextDouble();
        System.out.println("Mesai cikis saatinizi giriniz : ");
        double mesCikSaat=scan.nextDouble();

        System.out.println("Toplam Ucretiniz = "+ucretHesapla(basSaat, cikSaat,mesCikSaat));
    }

    private static double ucretHesapla(double basSaat, double cikSaat, double mesCikSaat) {
        double mesai;
        double normSure;
        if (cikSaat<mesCikSaat){
            mesai=((mesCikSaat-cikSaat)*1.8*40);
        }else mesai=0;
         normSure=((cikSaat-basSaat)*40);
         double toplam=mesai+normSure;
        return toplam;
    }
}
