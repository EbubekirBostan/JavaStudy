package j32_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {
        Civic cvc=new Civic();
        cvc.sunroof();
        System.out.println("cvc.vites() = " + cvc.vites());
        cvc.lastikEbatı();
        cvc.motor();
        cvc.kapı();
        cvc.koltuk();
        Crv crv=new Crv();
        crv.kapı();
        crv.koltuk();
        crv.motor();
        Accord acc=new Accord();
        acc.kapı();
        acc.koltuk();
        acc.motor();
        acc.sunroof();

    }
}
