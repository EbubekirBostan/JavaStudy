package j32_Abstract.abstract01;

public class Crv extends Honda {
    @Override
    public void motor() {
        System.out.println("Agam 2.4 super turbo motor arazii");
    }

    @Override
    void koltuk() {
        System.out.println("agam deri koltuk arazide daha temiz olur ");
    }

    @Override
    void kapı() {
        System.out.println("agam kapılar vakumlu çarpılmayasın :(");
    }
}
