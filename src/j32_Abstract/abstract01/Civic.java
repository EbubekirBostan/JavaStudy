package j32_Abstract.abstract01;

public class Civic extends Lastik{// Honda parent abs Class extend child concreate class
    /*
    extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı java CTE verdi
    çözüm:
    a) Unimplemented(uyarlanmamış) method implement edilmeli
    b)parent Hond class'dan abstract keyword kaldırılmalı
    c)concrete olan child Civic class abstract tanımlanmalı
    //concrete class' da abstract method tanımlanmaz
    //TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement edilmeli
     */
    @Override
    public void motor() {
        System.out.println("Agam 1.6 eco motor az yakar çok kaçar ");
    }

    @Override
    void koltuk() {
        System.out.println("Agam ucuz olsun diye kumaş koltuk temiz kullanın ");
    }

    @Override
    void kapı() {
        System.out.println("5 kapı sedan ");
    }
    public  int vites(){
        return 5;// concrete child method
    }

    @Override
    public void lastikEbatı() {
        System.out.println("21 inç ");
    }
    //Honda obj=new Civic();//honda oğlu civic
    //Civic obj1=new Civic();// civic oğlu civic

}
