package composition_example;

public class Address {

    private String city;
    private String country;


    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getAddressInfo() {
        String fullAddress = getCity() + " " + getCountry();
        System.out.println(fullAddress);
        return fullAddress;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}



