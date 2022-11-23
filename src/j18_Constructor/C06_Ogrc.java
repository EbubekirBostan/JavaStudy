package j18_Constructor;

public class C06_Ogrc {// ogrc obj kalıphane
    //Fields
    String isim="Merwe Hanım";
    int yas;
    String name;
    int age;

    public C06_Ogrc(String isim, int yas) {
       // this.isim = isim;
        //this.yas = yas;
        name=isim;
        age=yas;
        System.out.println("cons taki name :"+isim);
        System.out.println("cons taki name :"+this.isim);
        System.out.println("cons taki name :"+name);
    }
}
