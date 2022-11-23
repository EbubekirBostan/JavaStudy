package j22_DateTime.Proje_Task;

import java.time.LocalDateTime;

public class Kullanici {// kullanıcı obj üretecek kalıphane
    //task 1.stepp
    String name;// obj de değer alacak instance variable
    LocalDateTime kayitZamani;// obj de değer alacak instance variable

    public Kullanici(String name, LocalDateTime kayitZamani) {// full p li teleskopik cons.
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    @Override
    public String toString() {// bu class'dan olusturulan obj print etmek için stringe çevirir
        return
                "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }
}
