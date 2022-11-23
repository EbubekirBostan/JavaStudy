package Deneme02;

public class HesaplaMethodu {

    public void hesapla(char a, double x, double y) {
        Hesap obj=new Hesap();
        switch (a) {
            case '+':
                System.out.println("Toplama Sonucu = " + obj.toplama(x,y));
                break;
            case '-':
                System.out.println("Cikarma Sonucu = " + obj.cikarma(x,y));
                break;
            case '*':
                System.out.println("Carpma Sonucu = " + obj.carpma(x,y));
                break;
            case '/':
                System.out.println("Bolme Sonucu = " + obj.bolme(x,y));
                break;

        }

    }
}
