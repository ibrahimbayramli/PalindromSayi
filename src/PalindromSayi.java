public class PalindromSayi {

    //! Palindrom sayiya tamamlayan metod
    public static String palindromTamamlama(String myStr) {
        //? girdinin uzunlugunu alir
        int len = myStr.length();

        //? hedeflenen palindrom sayi
        String palindrom = myStr + tersCevir(myStr.substring(0, len - 1));

        //? palindrom sayiyi olusturmak icin fark
        Double fark = Double.valueOf(palindrom) - Double.valueOf(myStr);

        String result = String.format("%.0f", fark);
        if (palindromMu(myStr)) {
            return "0";
        }
        return result;
    }

    //! Girilen string ifadenin palindrom olup olmadigini sorgulayan fonksiyon
    public static boolean palindromMu(String myNum) {

        String result = tersCevir(myNum);

        //? 0-9 arasi tum sayilar palindrom oldugu için kontrol eklendi
        if (myNum.equals(result) || myNum.length() == 1) {
            return true;
        }
        return false;
    }

    //! Girilen string ifadeyi ters ceviren fonksiyon.
    public static String tersCevir(String reverseStr) {
        String result = "";
        for (int i = reverseStr.length() - 1; i >= 0; i--) {
            result += reverseStr.charAt(i);
        }
        return result;
    }

    //! Olusacak hedef palindrom sayiyi gosteren metod
    public static void palindromSayim(String myStr) {
        int len = myStr.length();
        String palindrom = myStr + tersCevir(myStr.substring(0, len - 1));

        System.err.println("Olusan palindrom sayi:\t" + palindrom);
    }
}
