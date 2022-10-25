public class MyNumber {


    int computeRandomInt(int min, int max){

        int range = (max - min);
        return (int)(Math.random() * range) + min;
    }




    public static void main(String[] args) {
        MyNumber numb1 = new MyNumber();
        int rand1 = numb1.computeRandomInt(1,21);
        System.out.println(rand1);

        MyNumber numb2 = new MyNumber();
        int rand2 = numb2.computeRandomInt(1, 7);
        System.out.println(rand2);

        MyNumber numb3 = new MyNumber();
        int rand3 = numb3.computeRandomInt(1,53);
        System.out.println(rand3);

        System.out.println(Math.random());


    }
}
