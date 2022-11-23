package P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi01.Team04OkulYonetimi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    Scanner sc=new Scanner(System.in);


    public boolean illegalArgumentException(int a){

        boolean flag=true;

            try {
                if (a<7){
                    throw new IllegalArgumentException();
                }
                flag=false;

            }catch(IllegalArgumentException e){
                System.out.println("Maalesef 7 yaşından Küçük Öğrencileri Kayıt Alamayız");


                flag=true;
            }


        return flag;
    }
    public boolean illegalArgumentExceptionEkleme(String a){
       boolean flag=false;
       int index=0;
            try {
                if (!(a.charAt(index)>='0' && a.charAt(index)<='9')){
                    throw new IllegalArgumentException();
                }
                flag=false;
            }catch(IllegalArgumentException e){
                System.out.println("Lütfen Pozitif Bir Sayı Giriniz ");
                flag=true;
            }

        return flag;
    }
}
