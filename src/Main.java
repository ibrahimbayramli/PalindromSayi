import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir ifade giriniz: ");
        String myString = scan.next();
        scan.close();

        System.out.println("Palindrom: " + PalindromSayi.palindromTamamlama(myString));


    }
}