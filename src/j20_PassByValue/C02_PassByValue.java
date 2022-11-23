package j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        //task- > verilen fiyat için %11 %22 ve %33 indirılmış fiyatı print eden method create ediniz.
        double fiyat=100;
        System.out.println("fiyat = " + fiyat);
        System.out.println("indir11(fiyat) = " + indir11(fiyat));
        System.out.println("indir22(fiyat) = " + indir22(fiyat));
        System.out.println("indir33(fiyat) = " + indir33(fiyat));
        System.out.println("fiyat = " + fiyat);


    }
    public static double indir11(double x){
        x*=0.89;
        return x;
    }
    public static double indir22(double x){
        x*=0.78;
        return x;
    }
    public static double indir33(double x){
        x*=0.67;
        return x;
    }
}
