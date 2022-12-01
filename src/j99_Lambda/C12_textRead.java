package j99_Lambda;

import javax.management.monitor.StringMonitor;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class C12_textRead {
    public static void main(String[] args) throws IOException {
        // Task 01--> bekir dosyasını okuyunuz..(consola print ediniz)
        Path hlk=Path.of("src/j99_Lambda/Bekir");//erişilecek dosyanın path'i tanımlandı
        Stream<String> akis= Files.lines(hlk);
       // Stream<String> akis1= Files.lines(Path.of("src\\j99_Lambda\\Bekir"));
        akis.//erişimi verilen dosyada ki satırlar akışa alındı
                forEach(C01_LambdaExpression::yazdirString);// akışda ki satırlar(lines) yazdırıldı
        //TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
        System.out.println("*********");
       Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).
               map(String::toUpperCase).
               forEach(C01_LambdaExpression::yazdirString);
       //  Files.readAllLines(hlk).stream().map(String::toUpperCase).forEach(System.out::println);
        //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..
        System.out.println("********");
        Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).map(String::toLowerCase).
               // findFirst'te olur.
                limit(1).
                forEach(C01_LambdaExpression::yazdirString);
        //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("********");
        System.out.println(Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).
                map(String::toLowerCase).
                filter(t -> t.contains("basarı")).
                count());
        //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..
        Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).map(t->t.split(" ")).//flatmap bir akışı alıp başka bir akışa dönüştürür akışın her bir üyesine aynı işlemi uygular.
                flatMap(Arrays::stream).distinct().forEach(C01_LambdaExpression::yazdirString);
        //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..
        Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).map(t->t.split(" ")).
                flatMap(Arrays::stream).sorted().forEach(t-> System.out.println(t+" "));
        //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println(Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).map(String::toLowerCase).
                map(t -> t.split(" ")).flatMap(Arrays::stream).
                filter(t -> t.contains("basarı")).count());
        //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println(Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).map(String::toLowerCase).
                map(t -> t.split(" ")).flatMap(Arrays::stream).
                filter(t -> t.contains("a")).count());
        //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).map(String::toLowerCase).
                map(t -> t.split(" ")).flatMap(Arrays::stream).
                filter(t -> t.contains("a")).forEach(C01_LambdaExpression::yazdirString);
        //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
        System.out.println(Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).map(String::toLowerCase).
                map(t -> t.split("")).flatMap(Arrays::stream).distinct().count());
        //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println(Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).map(String::toLowerCase).
                map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().count());
        //TASK 12 --> haluk.txt dosyasinda  farkli kelimeleri print ediniz
        Files.lines(Paths.get("src\\j99_Lambda\\Bekir")).map(String::toLowerCase).
                map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().forEach(C01_LambdaExpression::yazdirString);




    }
}
