package j14_Scope;

public class C03_Scope {

    public static void main(String[] args) {
        C01_InstanceVariable kus=new C01_InstanceVariable();// istediğim classtan kuş objessi create ettim.
        kus.name="ebabil";
        kus.developerMı=false;
        System.out.println("kus.name = " + kus.name);
        C01_InstanceVariable.staticMethod();
        kus.non_staticMethod();//obj ile non-static method call edildi

    }
}
