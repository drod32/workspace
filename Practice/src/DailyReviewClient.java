public class DailyReviewClient {

    public static void main(String[] args){
        DailyReview person = new DailyReview("david", 29);
        String personInfo = person.getPersonInfo();
        System.out.println(personInfo);
    }
}
