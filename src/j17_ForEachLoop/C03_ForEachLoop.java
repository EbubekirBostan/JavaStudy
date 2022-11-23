package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        // task-> iki string array elemanlarının ortak olmasını control eden code create ediniz
        String str[]={"Ali","Veli","Mehmet"};
        String str1[]={"Ali","Veli","Mehmet","Murat"};
        boolean flag=true;
        int count=0;
        List<String> str2=new ArrayList<>();
        for (String a: str){
            for (String b:str1){
                if (b.equalsIgnoreCase(a)){
                    flag=true;
                    str2.add(b);
                    count++;
                }else flag=false;
            }
        }
        System.out.println("flag = " + flag);
        System.out.println("count = " + count);
        System.out.println("str2 = " + str2);





    }
}
