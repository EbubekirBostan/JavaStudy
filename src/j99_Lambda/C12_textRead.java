package j99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class C12_textRead {
    public static void main(String[] args) throws IOException {
        // Task 01--> bekir dosyasını okuyunuz..(consola print ediniz)
        Path hlk=Path.of("src\\j99_Lambda\\Bekir");//erişilecek dosyanın path'i tanımlandı
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


    }
}
