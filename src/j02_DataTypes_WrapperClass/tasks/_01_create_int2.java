package j02_DataTypes_WrapperClass.tasks;

public class _01_create_int2 {

    public static void main(String[] args) {

      /*    Değeri 100 olan bir int oluştur.
            Ve bu int 'i yazdır.      */


        //Kodu aşağıya yazınız.

        int a = 100;
        System.out.println(a);


        /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */


            int sayi1=20;
            int sayi2=34;
            int ss12= 54;
            sayi1=ss12-sayi1;
            sayi2=ss12-sayi2;

            // a)
            System.out.println("sayi1="+sayi1+"\nsayi2="+sayi2);

            int num1=20;
            int num2=34;
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;





            // b)
            System.out.println("num1="+num1+"\nnum2="+num2);





        }


    }

