public class Iteration {
    public static int[] range;

    public void setRange(int[] range) {
        this.range = range;
    }

    //Method exercise 1
    public void displayNumbersUsingForLoop() {
        for (int i : range) {
            if (i == 7) {
                break;
            }
            System.out.print(i + ", ");
        }
    }

    public void displayNumberUsingWhile() {
        for (int i : range) {
            while (i != 7) {
                System.out.print(i + ", ");
                break;
            }
        }
    }


    public void displayNumberUsingDoWhile() {
        for (int i : range) {
            do {
                System.out.print(i + ", ");
                break;
            }
            while (i != 6);


            }
        }

    public void setRange(int i, int i1, int i2, int i3, int i4, int i5) {
    }
}












//    public static void main(String[] args){
//        Iteration test = new Iteration();
//        test.displayNumbersUsingForLoop();
//        }
//}