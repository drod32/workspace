import java.util.EnumSet;

public class MyFamilyClient {

    public static void main(String[] args){
        for (MyFamily name : MyFamily.values()) {
            System.out.println(name);
        }
        for (MyFamily name : EnumSet.range(MyFamily.DAVID, MyFamily.GABRIEL)){
            System.out.print(name + " ");
        }

    }



}
