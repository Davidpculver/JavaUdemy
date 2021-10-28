public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
//1 mb = 1024 KB
        int mb;
        int kb;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            mb = kiloBytes / 1024;
            kb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }

//    public static void main(String[] args) {
//        printMegaBytesAndKiloBytes(5000);
//    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }

//    public static void main(String[] args) {
//        System.out.println(shouldWakeUp(false, 1));
//    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){
        num1 = (int) num1 * 1000;
        num2 = (int) num2 * 1000;
        return num1 == num2;
    }

}
