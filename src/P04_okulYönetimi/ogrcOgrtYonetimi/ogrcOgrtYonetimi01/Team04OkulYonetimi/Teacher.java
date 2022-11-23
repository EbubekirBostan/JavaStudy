package P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi01.Team04OkulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Teacher extends Person{
    String bolum;
    int sicilNo;
    public Teacher() {
    }

    public Teacher(String ad, String soyad, String kimlikNo, int yas, String bolum, int sicilNo) {
        super(ad, soyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }
    List<Teacher> teacherList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    @Override
    public void ekleme() {
        System.out.print("Kaç öğretmen eklemek istiyorsunuz : ");
        String ogrtSayisi= sc.nextLine();
        if (illegalArgumentExceptionEkleme(ogrtSayisi)){
            ekleme();
        }
        int a=Integer.parseInt(ogrtSayisi);
        while (a>0){
            System.out.print("Öğretmen Adını Giriniz : ");
            ad= sc.next();
            System.out.print("Öğretmen Soyadını Giriniz : ");
            soyad=sc.next();
            System.out.print("Öğretmen Kimlik No Giriniz : ");
           String kimlikNo= setKimlikNo(sc.next());
            System.out.print("Öğretmen Yaşını Giriniz : ");
           int yas=setYas(sc.nextInt());
            if (illegalArgumentException(yas)){
                break;
            }
            System.out.print("Öğretmen Bölümünü Giriniz : ");
            bolum=sc.next();
            System.out.print("Öğretmen Sicil No Giriniz : ");
            sicilNo=sc.nextInt();
            teacherList.add(new Teacher(ad,soyad,kimlikNo,yas,bolum,sicilNo));
            a--;
        }
    }

    @Override
    public void arama() {

        System.out.print("Aramak istediğiniz Sicil No Giriniz : ");
        int arama= sc.nextInt();
        ListIterator<Teacher> ito=teacherList.listIterator();
        boolean teacherFound=false;
        while (ito.hasNext()){
            Teacher s= ito.next();
            if (s.sicilNo==arama){
                System.out.print("Aradığınız Öğretmen Mevcuttur : "+ s.ad.toUpperCase()+
                        " "+ s.soyad.toUpperCase()+" " + s.bolum.toUpperCase());
                System.out.println();//dummy
                teacherFound=true;
            }
        } if (!teacherFound){
            System.out.print("Maalesef Bu Sicil No'ya Sahip bir Öğretmen Bulunamadı : "+arama);
            System.out.println();//dummy
        }
    }

    @Override
    public void listeleme() {
        for (Teacher a:teacherList){
            System.out.println(a.toString());
        }
    }
    @Override
    public void silme() {
        System.out.print("Silmek istediğiniz öğretmenin kimlik no'sunu giriniz : ");
        String kNo=sc.next();
        boolean teacherDelete=false;
        for (int i = 0; i <teacherList.size() ; i++) {
            if (teacherList.get(i).getKimlikNo().equals(kNo)){
                System.out.print(teacherList.get(i).ad.toUpperCase()+" "+teacherList.get(i).soyad.toUpperCase()+
                        " "+teacherList.get(i).bolum.toUpperCase()+ " Siliniyooorrrr....");
                System.out.println();//dummy
                teacherDelete=true;
                teacherList.remove(i);
            }
        }
        if (!teacherDelete){
            System.out.print("Böyle bir kimlik no eşleşmesi bulunamadı : "+kNo);
            System.out.println();//dummy
        }
    }

    @Override
    public String toString() {
        return
                "Ad= " + ad.toUpperCase() + '\'' +
                " Soyad= " + soyad.toUpperCase() + '\'' +
                "bolum= " + bolum.toUpperCase() + '\'' +
                '}';
    }
}
