import java.util.Arrays;

public class DailyReview {

    //fields always private
    private String name;
    private int age;

    //constructors

    public DailyReview(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //business classes
    public String getPersonInfo() {
        return name + " " + age;
    }
    //setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {

        String[] family = new String[10];
        family[0] = "Jean";
        family[1] = "Taylor";
        family[2] = "Gary";
        family[3] = "Maurice";
        family[4] = "Denise";
        family[5] = "Gabriel";
        family[6] = "Christian";
        family[7] = "Brandon";
        family[8] = "jelisa";
        family[9] = "David";
        //System.out.println(Arrays.toString(family));

        String[] exercise2 = {"2", "40", "7", "5"};
        int[] intFromString = new int[exercise2.length];
        int number = 0;
        for (int i = 0; i < exercise2.length; i++) {
            int parseInt = Integer.parseInt(exercise2[i]);
            intFromString[i] = parseInt;
        }
        System.out.println(Arrays.toString(intFromString));


        String[] myStringArrayA = {"Hello", "Boston"};
        String[] myStringArrayB = {"Hello", "Boston"};
        String[] myStringArrayC = {"Boston", "Hello"};

        boolean equals1 = Arrays.equals(myStringArrayA, myStringArrayB);

        System.out.println(equals1);


        String initialString = "I love Boston. Yes, you do love Boston.";
        String[] strings = initialString.toLowerCase().split("[ ,.'!?@#$%]+");
        String [] uniqueWords = new String[];
        int x=0;
        for (int i=0; i < strings.length; i++) {
            boolean TheWordAlreadyEncountered =
                    isTheWordAlreadyEncountered( String[] uniqueWords,String s. int currentIndex)

        }


private static boolean isTheWordAlreadyEncountered(
        String[] uniqueWords,String s. int currentIndex)


    }






















    }
//        int[] ints = {3, 9, 6, 2, 1, 10, 5};
//        int smallestNumber = ints[0];
//        int[] smallestNumbersInOrder = new int[ints.length];
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = 0; j < ints.length; j++) {
//                if (ints[j] < smallestNumber) {
//                    smallestNumber = ints[j];
//
//                    smallestNumbersInOrder[j] = smallestNumber;
//
//                }
//            }
//            System.out.println(Arrays.toString(smallestNumbersInOrder));
//        }
//    }
//}
//




















