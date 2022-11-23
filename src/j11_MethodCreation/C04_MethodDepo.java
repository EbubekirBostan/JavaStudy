package j11_MethodCreation;

public class C04_MethodDepo {
    //main method yok
    /*
    her class da main method mecburiyeti yoktur belirli aksiyonları alarak method başka
    classdan cagrılabilir
     */
    public static void gecmeNotu(int not){
        if (not>=85){
            System.out.println("agam tebrik cok basarili");
        } else if (not>=70) {
            System.out.println("agam basarili");
        } else if (not>=60) {
            System.out.println("agam sadece gectin");
        } else if (not>=45) {
            System.out.println("agam ucuz yirttin");
        }else System.out.println("agam fena caktin");


    }


}
