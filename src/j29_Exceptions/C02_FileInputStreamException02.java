package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("D:\\QA TESTER\\JAVA\\javaLearnsonhali1-573bb425e745fff0ad13a2c409b5e89256f6501d\\src\\j29_Exceptions\\ebikGabik");
            int k;
            try {
                while ((k=fis.read())!=-1) {
                        System.out.print((char) k);
                    }
                    System.out.println("agam içteki try blocktan selamlar");
                } catch (IOException e) {//dosyaya ulaşılır fakat okunamazsa bu catch çalışır
                    System.out.println("agam dediğin dosya okunamayırr..");
                    System.out.println("agam içteki catch blocktan selamlar");
                }
                System.out.println("agam dıştaki try blocktan selamlar");


        } catch//dosyaya ulaşılamazsa bu catch çalışır
          (FileNotFoundException e) {
            System.out.println("agam dediğin dosya ulaşılamayırr..");
            System.out.println("agam dıştaki catch blocktan selamlar");
        }
        System.out.println("agam sorun handle edildi bekleme yapma");
    }
}
