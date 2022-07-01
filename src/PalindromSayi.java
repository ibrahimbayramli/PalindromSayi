public class PalindromSayi {
    public static String palindromTamamlama(String myStr) {
        String retval = "";
        int myNum;
        try {
            myNum = Integer.valueOf(myStr);
        } catch (NumberFormatException e) {
            return "Girilen String ifade sayisal degildir.";
        }
        if (palindromMu(myNum)) {
            return "0";
        } else {
            for (int i = 1; i < myNum; i++) {
                myNum++;
                if (palindromMu(myNum)) {
                    retval = String.valueOf(i);
                    break;
                }
            }
        }
        return retval;
    }

    public static boolean palindromMu(int myNum) {
        String newStr = String.valueOf(myNum);
        String result = "";
        for (int i = newStr.length() - 1; i >= 0; i--) {
            result += newStr.charAt(i);
        }

        if (newStr.equals(result)) {
            return true;
        }
        return false;
    }
}
