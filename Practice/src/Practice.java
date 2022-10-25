

import java.util.Arrays;

public class Practice {


}
class Main {



    public static void main(String[] args) {

        String sentence = "Hello I love Boston. Yes, you do Love Boston.";

        String[] sentenceArray = sentence.split("[, ?.@]+");


        //System.out.println(Arrays.toString(sentenceArray));

        for (int i = 0; i < sentenceArray.length; i++) {
            int wordCount = 1;
            for (int j = i +1  ; j < sentenceArray.length ; j++){
                if (sentenceArray[i].equalsIgnoreCase(sentenceArray[j])) {

                    wordCount++;

                    sentenceArray[j] = "";
                }
            }
            if (sentenceArray[i] != "")
                System.out.println(sentenceArray[i]+ ":" + wordCount);


            }
        }
    }














