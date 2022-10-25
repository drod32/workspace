public class Pizza {

    //FIELDS
    private String toppings = "Cheese";
    private String size;
    private Double price;
    private String style;

    // BUSINESS METHODS
    public void nyStyle(){System.out.println("Fugetaboutit " + toppings + " " + size + ", $" + price);}

    public void chicagoStyle() {System.out.println("DA Bears Deep Dish " + toppings + " " + size + ", $" + price );}

    public void sicilianStyle() {System.out.println("Take the Cannoli");}


    // GETTER AND SETTER METHODS
    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }


    //TO STRING
    @Override
    public String toString() {
        return "Style = " + style + "\n" +
                "Toppings = " + toppings + "\n" +
                "Size = " + size + "\n" +
                "Price = $" + price;
    }
}

