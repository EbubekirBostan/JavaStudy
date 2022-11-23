package j10_StringManipulations;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      char e=pickName.charAt(pickName.indexOf("E"));
      char b=pickName.charAt(pickName.indexOf("B"));
      char u=pickName.charAt(pickName.indexOf("U"));
      char b1=pickName.charAt(pickName.indexOf("B"));
      char e1=pickName.charAt(pickName.indexOf("E"));
      char k=pickName.charAt(pickName.indexOf("K"));
      char i=pickName.charAt(pickName.indexOf("I"));
      char r=pickName.charAt(pickName.indexOf("R"));
        System.out.println(e+b+u+b1+e1+k+i+r);// ascii verir>>585
        System.out.println(""+e+b+u+b1+e1+k+i+r);// String verir>>EBUBEKIR











    }
}
