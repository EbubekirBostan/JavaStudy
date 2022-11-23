package j32_Abstract.abstract01;

public class Accord extends Honda{
    @Override
    public void motor() {
        System.out.println("Agam 2.0 turbo ateşle hız felakettir ");
    }

    @Override
    void koltuk() {
        System.out.println("Agam deri koltuk ter yapar pişikten korun ");
    }

    @Override
    void kapı() {
        System.out.println("agam 5 kapı");
    }

    @Override
    void sunroof() {
        System.out.println("agam cugara yakınca sunroof acmayı unutma ");
    }
}
