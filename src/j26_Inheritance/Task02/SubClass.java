package j26_Inheritance.Task02;

public class SubClass extends SuperClass{
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.myMethod();

    }
    int num=10;
    @Override
   public void goster() {
       System.out.println("Bu method sub classın görüntüleme methodudur");
   }
    public void myMethod(){
        goster();
        super.goster();
        System.out.println("subclass: "+num);
        System.out.println("süperclass: "+ super.num);
    }
}
