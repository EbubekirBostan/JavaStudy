package j25_Encapsulation.Encapsulation02;

public class Runner {
    public static void main(String[] args) {
        Kisi obj1=new Kisi("umit","K","umitK33",33);
        System.out.println("obj1.ad = " + obj1.ad);
        obj1.setYas(-33);
        System.out.println("obj1.getYas() = " + obj1.getYas());

    }
}
