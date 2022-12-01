package P13_vatandasProject.Team_04_Vatandas_Project;


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

    public static boolean kimlik4LimitillegalArgument(String a){
        boolean flag=false;
        int index=0;
        int index1=a.length();
        try {
            if (!(a.charAt(index)>='0' && a.charAt(index)<='9')){
                throw new NumberFormatException();
            }
            if(!(index1>3 && index1<5)){
                throw new StringIndexOutOfBoundsException();
            }
            flag=false;
        }catch(NumberFormatException e){
            System.out.println("Lütfen Pozitif Bir Sayı Giriniz ");
            flag=true;

        }catch (IllegalArgumentException e){
            System.out.println("Lütfen Pozitif Bir Sayı Giriniz ");
            flag=true;
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("4 haneli giriniz lütfen");
            flag=true;
        }

        return flag;
    }
    public static boolean kimlik10LimitillegalArgument(String a){
        boolean flag=false;
        int index=0;
        int index1=a.length();
        try {
            if (!(a.charAt(index)>='0' && a.charAt(index)<='9')){
                throw new NumberFormatException();
            }
            if(!(index1>9 && index1<11)){
                throw new StringIndexOutOfBoundsException();
            }
            if (a.charAt(index)=='0'){
                throw new IllegalArgumentException();
            }
            flag=false;
        }catch(NumberFormatException e){
            System.out.println("Lütfen Pozitif Bir Sayı Giriniz ");
            flag=true;

        }catch (IllegalArgumentException e){
            System.out.println("Başında Sıfır Olmadan Gir Dedik Ya  ");
            flag=true;
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Başında Sıfır Olmadan 10 Haneli Giriniz Lütfen");
            flag=true;
        }
        return flag;
    }


}
