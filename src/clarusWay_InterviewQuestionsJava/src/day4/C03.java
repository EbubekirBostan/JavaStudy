package clarusWay_InterviewQuestionsJava.src.day4;

import java.util.Arrays;

public class C03 {
    public static void main(String[] args) {
        /*
        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)
         */
        String str="java ile hersey guzel";
        hackerDili(str);
        hackerDili2(str);
    }

    private static void hackerDili2(String str) {
        String arr[]=new String[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            arr[i]=str.substring(i,i+1);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <str.length() ; i++) {
            if (arr[i].contains("s")) arr[i]="5";
            if (arr[i].contains("a")) arr[i]="4";
            if (arr[i].contains("e")) arr[i]="3";
            if (arr[i].contains("i")) arr[i]="1";
            if (arr[i].contains("o")) arr[i]="0";
            System.out.print(arr[i]);
        }

    }

    private static void hackerDili(String str) {
        str= str.replaceAll("s","5").replaceAll("a","4")
                .replaceAll("e","3").replaceAll("i","1")
                .replaceAll("o","0");
        System.out.println("str = " + str);
    }
}
