package day02_variables_scanner;

import java.util.Scanner;

public class C04_Scanner_KullanicidanBilgiAlma {
    public static void main(String[] args) {

        Scanner kullanici = new Scanner(System.in);
        System.out.println("Adınızı Girin...");
      /* String girilenIsim = kullanici.next(); kullanıcının
         girdiği metnin ilk space'a kadar olan kısmını alır.
         ali mert canli girerse sadece aliyi alır. */

        String girilenIsim = kullanici.nextLine(); //tamamini alır.

        System.out.println("Girilen ismin büyük harflerle yazılan hali : "+ girilenIsim.toUpperCase());

    }
}
