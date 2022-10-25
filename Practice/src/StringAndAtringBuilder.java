public class StringAndAtringBuilder {

    private int houseNumber;
    private String street;
    private String state;
    private int zipCode;

    public StringAndAtringBuilder(int houseNumber, String street, String state, int zipCode) {
        this.houseNumber = houseNumber;
        this.street = street;
//        this.state = state;
//        this.zipCode = zipCode;
    }


    public void myAddressUsingString(){
        String stringAddress = (houseNumber + street + state + zipCode);
        System.out.println(stringAddress);
    }
    public void constructMyAdressUsingString(){
        StringBuilder myAddress = new StringBuilder(100);
                myAddress.append(houseNumber).append(" ")
                .append(street).append("\n").toString();

        System.out.println(myAddress);
    }
}
