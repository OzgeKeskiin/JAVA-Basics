package day01_helloWorld;

public class C02_VariableOlusturma {
    public static void main(String[] args) {

        int sayi=10;
        System.out.println(sayi);

        // int sayi =30; variable 'sayi' is already defined in the scope.

        sayi=40;
        System.out.println(sayi);

        // 2*sayi=40; variable expected
        // Java'da eşitliğin sol tarafında SADECE variable olmalıdır.

        sayi = sayi * 2;  //80
        System.out.println(sayi);

        sayi = 2 * sayi -5; // 155
        System.out.println(sayi);



    }
}
