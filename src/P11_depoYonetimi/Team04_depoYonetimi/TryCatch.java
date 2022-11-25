package P11_depoYonetimi.Team04_depoYonetimi;

public class TryCatch {
    public static boolean illegalArgumentExceptionEkleme(String a){
        boolean flag=false;
        int index=0;
        try {
            if (!(a.charAt(index)>='0' && a.charAt(index)<='9')){
                throw new NumberFormatException();
            }
            flag=false;
        }catch(NumberFormatException e){
            System.out.println("Lütfen Pozitif Bir Sayı Giriniz ");
            flag=true;

        }catch (IllegalArgumentException e){
            System.out.println("Lütfen Pozitif Bir Sayı Giriniz ");
            flag=true;
        }

        return flag;
    }
    public static boolean illegalArgumentExceptionEklemeString(String a){
        boolean flag=false;
        int index=0;
        try {
            if ((a.charAt(index)>='0' && a.charAt(index)<='9')){
                throw new NumberFormatException();
            }
            flag=false;
        }catch(NumberFormatException e){
            System.out.println("Lütfen Harf Kullanınız ");
            flag=true;

        }catch (IllegalArgumentException e){
            System.out.println("Lütfen Harf Kullanınız ");
            flag=true;
        }

        return flag;
    }



}
