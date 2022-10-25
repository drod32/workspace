public class StringMethodExample {

    public static void main(String[] args){
        String test = "Hello World";
        System.out.println("the String is " + test);

        if (test.contains("World")) {
            System.out.println(test + " has World in it");
        }
        if (test.endsWith("d")){
            System.out.println(test + " ends with d");
        }
        if (test.equals("Hello World")){
            System.out.println(test + " says Hello World");
        }
        if (test.equalsIgnoreCase("hello world")){
            System.out.println(test + " says hello world ignoring case");
        }
        if (test.startsWith("Hello")){
            System.out.println("Hello to you too");
        }
        char x = 'H';
        var indexTest = test.indexOf(x);
        System.out.println(test + " is " + test.length() + " characters long"  );
        System.out.println(x + " is character # " + (indexTest + 1));

        String[] splitTest = test.split("");
        for (String word : splitTest){
            System.out.print(word + " ");
        }
        System.out.println("\nusing split with no " +
                "character separates each character");




        String newTest = "    Hello World   ";
        System.out.println(newTest);
        var index2 = newTest.indexOf("H") + 1;
        var length = newTest.length();
        System.out.println("new index of k = " + index2 +
                " new length = " + length);
        String stripNewTest = newTest.strip();
        System.out.println(stripNewTest);
        System.out.println("this is " + stripNewTest +
                " with no leading or trailing white space");
        var index3 = stripNewTest.indexOf("H") + 1;
        var length2 = stripNewTest.length();
        System.out.println("new index of k = " + index3 +
                " new length = " + length2);

        String subString = test.substring(0,6);
        System.out.println(subString + " i used the substring method to get rid of world");


        System.out.println("all uppercase " + test.toUpperCase());
        System.out.println("all lowercase " + test.toLowerCase());











    }
}
