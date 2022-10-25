public class FlowControl {
    // make char variable
    public static char hexChar;
    public static int number;



    // constructor to be used in client
    public FlowControl(char hexChar) {
        this.hexChar = hexChar;
    }

    public FlowControl(int number) {
        this.number = number;
    }
//This is the first part of the excercise
    //this divides the chosen interger by 2 and
    // returns the remainder, if zero remains therefore even

    public static boolean isItEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even!!!");
            return true;
        } else {
            System.out.println(number + " is odd!!!");
            return false;
        }
    }

    // this is the method used to check the convert the hex char
    // to decimal equivalent
    public static char hexCharToDecimal(char hexChar) {

        switch (hexChar) {
            case 'A':
                System.out.println("A is 11");
                break;
            case 'B':
                System.out.println("B is 12");
                break;
            case 'C':
                System.out.println("C is 13");
                break;
            case 'D':
                System.out.println("D is 14");
                break;
            case 'E':
                System.out.println("E is 15");
                break;
            default:
                System.out.println(hexChar + " is not a Hexadecimal");
                break;
        }
    return hexChar; //im not sure why this need to be here
    }
}