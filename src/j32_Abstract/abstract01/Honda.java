package j32_Abstract.abstract01;

public abstract class Honda {//parent abstract class
    public abstract void motor();
    void sunroof(){
          System.out.println("agam keyfini bilirsen ekstra ücret :)");
     }
     // abs parent class da variable tanımlanabilir mi
    String name="Gülsüm team lead";
    // variable'lar abstract olur mu -->> HAYIR




     abstract void koltuk();
     abstract void kapı();
     //final void finalMethod();//concrete method bodysiz olamaz
     //final abstract void finalMethod();//abstract method final olamaz
    //private  void privateMethod();//concrete method bodysiz olamaz
   // private abstract  void privateMethod();//abstract method private olamaz
    //static void gunesMethod();//concrete method bodysiz olamaz
    //static abstract void gunesMethod();//abstract method static olamaz

    //Honda obj=new Honda();// melekler doğurmaz yani abs class obj üretmez




}
