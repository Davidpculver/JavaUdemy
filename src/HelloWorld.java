public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = myTotal - 1000;
        System.out.println(myFirstNumber);
        System.out.println(myTotal);
        System.out.println(myLastOne);

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Min int val: " + minIntValue);
        System.out.println("Max int val: " + maxIntValue);

    }
}
