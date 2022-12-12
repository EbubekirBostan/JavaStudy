package j37_Enum.enum01;

import static P11_depoYonetimi.Team04_depoYonetimi.Methods.sc;

public class Runner {
    public static void main(String[] args) {
        //Task -> verilen bir ay numarasına göre kaç gün çektiğini print eden code create ediniz
       // System.out.println("Bir ay numarası giriniz");
       // String month=sc.nextLine();
        Aylar ay=Aylar.MART;// AYLAR ENUM'DAN AY FİELD value MART olarak tanımlandı
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());

        switch (ay){
            case OCAK:
                System.out.println("Ocak 31 gündür..");
                break;
            case SUBAT:
                System.out.println("Şubat 28 gündür..");
                break;
            case MART:
                System.out.println("mart 31 gündür..");
                break;
            case NISAN:
                System.out.println("nisan 30 gündür..");
                break;
            case MAYIS:
                System.out.println("mayıs 31 gündür..");
                break;
            case HAZIRAN:
                System.out.println("haziran 30 gündür..");
                break;
            case TEMMUZ:
                System.out.println("temmuz 31 gündür..");
                break;
            case AGUSTOS:
                System.out.println("ağustos 30 gündür..");
                break;
            case EYLUL:
                System.out.println("eylül 31 gündür..");
                break;
            case EKIM:
                System.out.println("ekim 30 gündür..");
                break;
            case KASIM:
                System.out.println("Ocak 31 gündür..");
                break;
            case ARALIK:
                System.out.println("Ocak 31 gündür..");
                break;



        }
    }
}
