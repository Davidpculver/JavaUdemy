public class Main {

    public static void main(String[] args) {
//        Call class name, then method name
        double miles = SpeedConverter.toMilesPerHour(100);
        System.out.println(miles);

        SpeedConverter.printConversion(100);
    }

}
