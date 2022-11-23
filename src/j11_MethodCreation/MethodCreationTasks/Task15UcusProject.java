package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task15UcusProject {/*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$
yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
12 ve 24 yas arasindaysa 10% indirim,
65 yasindan buyukse 30% indirim,
bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Hangi Şehre Uçmak İstiyorsunuz B,C,D giriniz: ");
        String rota=sc.next().toUpperCase();
        System.out.print("Gidiş-Dönüş veya Tek yön 2/1 giriniz: ");
        double ucusYonu=sc.nextDouble();
        System.out.println("Yaşınızı Giriniz: ");
        int yas=sc.nextInt();
        switch (rota){
            case "B":
                System.out.println("Toplam Bilet Fiyatınız: "+Method01_UcusProject.ucusBFiyat(Method01_UcusProject.indirimYas(yas), Method01_UcusProject.indirimGD(ucusYonu)));
                break;
            case "C":
                System.out.println("Toplam Bilet Fiyatınız: "+Method01_UcusProject.ucusCFiyat(Method01_UcusProject.indirimYas(yas), Method01_UcusProject.indirimGD(ucusYonu)));
                break;
            case "D":
                System.out.println("Toplam Bilet Fiyatınız: "+Method01_UcusProject.ucusDFiyat(Method01_UcusProject.indirimYas(yas), Method01_UcusProject.indirimGD(ucusYonu)));
                break;
            default:
                System.out.println("Yanlış Rota Seçtiniz");
                break;
        }











      /*  double fiyatB=500*0.10;
        double fiyatC=700*0.10;
        double fiyatD=900*0.10;
        if (rota.equals("B")||rota.equals("C")||rota.equals("D")){
            if (yas>65){
                if (rota.equals("B")){
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatB*0.7*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatB*0.7)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("C")) {
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatC*0.7*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatC*0.7)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("D")) {
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatD*0.7*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatD*0.7)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                }else System.out.println("hatalı giriş yaptınız");

            } else if (yas<24 && yas>=12) {
                if (rota.equals("B")){
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatB*0.9*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatB*0.9)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("C")) {
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatC*0.9*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatC*0.9)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("D")) {
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatD*0.9*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatD*0.9)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                }else System.out.println("hatalı giriş yaptınız");

            } else if (yas<12) {
                if (rota.equals("B")){
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatB*0.5*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatB*0.5)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("C")) {
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatC*0.5*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatC*0.5)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("D")) {
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatD*0.5*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatD*0.5)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                }else System.out.println("hatalı giriş yaptınız");
            }else {
                System.out.println("agam maalesef yas sana yaramadı 0 yas indirimi");
                if (rota.equals("B")){
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatB*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatB)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("C")) {
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatC*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatC)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("D")) {
                    if (ucusYonu.equals("G")){
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatD*0.8*2)+" $");
                    } else if (ucusYonu.equals("T")) {
                        System.out.println("  ***  ");
                        System.out.println("ucus toplam bilet fiyatınız : "+(fiyatD)+" $");
                    }else System.out.println("agam hala yönün belli değil");

                }else System.out.println("hatalı giriş yaptınız");
            }
        }else System.out.println("agam henuz başka ucuş yok");*/





    }



}
