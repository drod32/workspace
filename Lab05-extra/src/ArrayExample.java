import java.util.Arrays;

public class ArrayExample {
    public static String[] family = {"david", "jelisa", "brandon"};

    //public static int[] numbers = new int[];
    //public int i = 0;
    public static void convertAndDisplayNamesToUpperCase() {
        for (String s : family) {
            System.out.print(s.toUpperCase() + " ");
        }
    }

    public static void findOddNumbersFromArray(int[] numbers) {
        int i = 0;
        //int x = 0;
        int[] oddArray = new int[numbers.length];
        for (int oddNumbersOnly : numbers) {
            if (oddNumbersOnly % 2 == 0) {
                i++;
                continue;
            } else {

                System.out.print(oddNumbersOnly + ", ");
                oddArray[i] = oddNumbersOnly;
            }
        }
        System.out.println();
        int[] newOddArray = new int[numbers.length - i];
        int a = 0;
        for (int x : oddArray) {

            if (a <= i) {
                newOddArray[a] = oddArray[a];
                a++;
            }
            //System.out.println(i);

        }
        System.out.println(Arrays.toString(newOddArray));
    }

    static class Test {
        public static void main(String[] args) {
            //ArrayExample.convertAndDisplayNamesToUpperCase();
            ArrayExample.findOddNumbersFromArray(new int[]{1, 2, 3});
        }
    }
}





