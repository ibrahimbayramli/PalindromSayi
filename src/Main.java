import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //? Kullanicidan veri girisi alinmasi
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir ifade giriniz:\t\t");
        String myString = scan.next();
        scan.close();

        PalindromSayi.palindromSayim(myString);
        System.out.println("Eklenecek Sayi:\t\t\t" + PalindromSayi.palindromTamamlama(myString));


    }
}