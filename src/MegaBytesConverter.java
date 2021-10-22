public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
//1 mb = 1024 KB
        int mb;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            mb = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and ");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(4000);
    }

}
