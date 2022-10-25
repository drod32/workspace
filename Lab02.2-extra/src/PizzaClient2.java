public class PizzaClient2 {
    public static void main(String[] args){
        Pizza dollarSlice = new Pizza();

        dollarSlice.setSize("Slice");
        dollarSlice.setPrice(0.99);
        dollarSlice.setToppings("Cheese");
        dollarSlice.setStyle("New York ");

        System.out.println(dollarSlice);
        System.out.println();
        dollarSlice.nyStyle();
    }
}

