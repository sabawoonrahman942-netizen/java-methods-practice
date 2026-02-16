import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

class JavaMethodsPractice {

    public static void main(String[] args) {
        message();
        message2();
        System.out.println("-----------");
        randomNumber();
        System.out.println("-----------");
        getHour();
        System.out.println("-----------");

        int a;
        int b;
        int sonuc = carpma(a = 3, b = 4);
        System.out.println("sonuc  =" + sonuc);

        System.out.println("-----------");

        System.out.printf(" sayiyi giriniz");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();

        String sonuc1 = sayiDurumu(sayi);
        System.out.println("sonuc1 =" + sonuc1);

        System.out.println("-----------");

        prints(34);
        prints("sonucunu  gösterir");
        prints(23.23);

        System.out.println("-----------");

        System.out.printf("faktoryel = " + faktoryel(12));

        scanner.close();
    }

    public static void message() {
        System.out.println("java dersine hos Geldiniz");
    }

    public static void message2() {
        System.out.println("metotlari ogreniyorum");
    }

    public static void randomNumber() {
        Random randon = new Random();
        int number = randon.nextInt(110) + 1;
        System.out.println("Random Number:" + number);
    }

    public static void getHour() {
        LocalTime now = LocalTime.now();
        System.out.println("Tıme:" + now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());
    }

    // parametreli metotlari kullanimi
    public static int carpma(int a, int b) {
        return a * b;
    }

    public static String sayiDurumu(int sayi) {
        if (sayi > 0) {
            return "sayi pozitif";
        } else if (sayi < 0) {
            return "sayi negatiftir";
        } else {
            return "sayi sifirdir";
        }
    }

    public static void prints(int number) {
        System.out.println(number);
    }

    public static void prints(String message1) {
        System.out.println(message1);
    }

    public static void prints(double number) {
        System.out.println(number);
    }

    // rekursif metotlari kullanimi faktoryel hesaplama
    public static int faktoryel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktoryel(n - 1);
        }
    }
}
