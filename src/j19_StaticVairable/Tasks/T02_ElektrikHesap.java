package j19_StaticVairable.Tasks;

import java.util.Scanner;

public class T02_ElektrikHesap {
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method */
  int toplamTuketim;
    double oran= 0.7;
    double fatura;
    int kullanim;
    public void tuketimEkle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Kullanım miktarı Giriniz = ");
        kullanim=sc.nextInt();
        toplamTuketim+=kullanim;
    }
    public double  odenecekTutar(){
        fatura+=(toplamTuketim*oran);
        return fatura;
    }

}

