package j33_Interface;

public interface disDonanim {
    public void kapi();//abs meth.
    void kaporta();//abs.meth
    String RENK="opak gırmızııı";//public static final variable
    public default String sisLamp(){
        return "sisli havada dikkat";
    }
    static void anten(){//static conc//method
        System.out.println("agam yine antin kuntin işlerdesin");
    }
    //public static default void sorunMethod(){//static default keyword aynı anda kullanılmaz
    //disDonanim obj=new disDonanim();//obj olmaz olamazz
    /*public static void main(String[] args) {//bad practice-> projede tek bir main method ve main class kullanılır
        System.out.println("RENK = " + RENK);
        aga();//static meth call
    }

     */

}
