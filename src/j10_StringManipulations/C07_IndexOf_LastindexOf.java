package j10_StringManipulations;

import java.util.Scanner;

public class C07_IndexOf_LastindexOf {
    public static void main(String[] args) {
        /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/
        String str="Good";
        System.out.println("ilk görülen o nun yeri index no su : "+str.indexOf('o'));
        System.out.println("d nun yeri index no su : "+str.indexOf("d"));
        System.out.println("d nun yeri index no su : "+str.indexOf("D"));// -1 büyük d olmadığı için
        // Trick>>> olmayan karakter indexi sorgulanırsa -1 return eder.
        System.out.println("d nun yeri index no su : "+str.indexOf("od"));//2
        System.out.println("d nun yeri index no su : "+str.indexOf("Od"));//-1

        /* lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */
        String isim="mustafa nizamoğlu";
        System.out.println(isim.indexOf('a'));
        System.out.println(isim.lastIndexOf('a'));
        System.out.println(isim.lastIndexOf("fa"));//5
        System.out.println(isim.indexOf("fa"));//5
        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle=scan.nextLine().toLowerCase();
        if (cumle.indexOf("java")==-1){
            System.out.println("Girilen cumlede java icermiyor");
            
        } else if (cumle.indexOf("java")==cumle.lastIndexOf("java")) {
            System.out.println("Girilen cümlede bir tane var");
        }else System.out.println("Girilen cümlede birden fazla var");


    }
}
