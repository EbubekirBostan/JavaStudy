package j11_MethodCreation;

import java.util.Scanner;

public class JavaTekrar4 {
static Scanner sc=new Scanner(System.in);
public void ilkHarfBuyuk(String a,String b){
    System.out.println(a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase());
    System.out.println(b.substring(0,1).toUpperCase()+b.substring(1).toLowerCase());
}
}
