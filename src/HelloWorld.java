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



        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println(minByteValue);
        System.out.println(maxByteValue);

        //        cast a number to long number
        long myLongValue = 100L;

        long minlongValue = Long.MIN_VALUE;
        long maxlongValue = Long.MAX_VALUE;

        System.out.println(minlongValue);
        System.out.println(maxlongValue);

        byte newByteValue = (byte) (maxByteValue / 2);
        System.out.println(newByteValue);
        System.out.println(maxByteValue);

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("Not an alien!");
        }

        if (!isAlien){
            System.out.println("Still not an alien!");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This doesnt run");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        double challegeNum = 20.00d;
        double anotherNum = 80.00d;

        double totalNums = (challegeNum + anotherNum) * 100.00d;
        System.out.println(totalNums);

        double remainder = totalNums % 40.00;
        System.out.println(remainder);

        boolean remainderZero = remainder == 0 ? true : false;
        System.out.println(remainderZero);

        if(!remainderZero){
            System.out.println("Got some remainder");
        }


//        SECTION 4




    }
}
