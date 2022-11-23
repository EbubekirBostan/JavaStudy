package j18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {
        C04_Teacher ogrt1=new C04_Teacher();
        ogrt1.ad="Ebubekir";
        ogrt1.soyAd="Bostan";
        ogrt1.brans="Qa";
        ogrt1.maas=23000;
        ogrt1.tecrube=11;
        ogrt1.dersSaati();
        System.out.println("ogrt1 = " + ogrt1);
        C04_Teacher ogrt2=new C04_Teacher("Ebubekir","Bostan","Qa",10,25000,20365,false);
        System.out.println("ogrt2 = " + ogrt2);


    }
}
