public class MyMath {
    int pageNumber;
    public static final int STARTING_PAGE_NUMBER = 3;
    public static final int FINAL_PAGE_NUMBER = 311;



    public MyMath(int randomPage){
            pageNumber = randomPage;
        }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}

class main {
    public static void main(String[] args) {
        MyMath testNumber = new MyMath(5);

    }
    int randomPage(int min, int max) {
        int range = (max - min);
        return (int) (Math.random() * range) + min;
    }
}