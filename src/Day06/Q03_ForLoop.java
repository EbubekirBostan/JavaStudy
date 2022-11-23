package Day06;

public class Q03_ForLoop {

//Interview Question
// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
public static void main(String[] args) {
    int i=0;
    for (i = 0; i <=255 ; i++) {
        System.out.print(i);
        System.out.println((char)(i));
    }
    while (i<255){
        System.out.print(i);
        System.out.println((char)(i));
        i++;
    }
    do {
        System.out.print(i);
        System.out.println((char)(i));
        i++;
    }while(i<=255);









}

}
