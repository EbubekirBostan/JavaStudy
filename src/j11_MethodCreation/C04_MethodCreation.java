package j11_MethodCreation;

public class C04_MethodCreation {//motor
    public static void main(String[] args) {
        String name="haluk";
        System.out.println("car car : "+name);
        C04_MethodDepo.gecmeNotu(24);//depo classtan name ile method çağırma
        /*
        farklı class'dan method call etmek için
        1.method static olmalıdır
        2. ClassName.methodName() şeklinde call edilir
        aynı class daki method doğrudan ismi ile call edilir
        */
        C03_MethodOverloading.topla(35,63);



    }
}
