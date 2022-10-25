public class PizzaClient {
    public static void main(String[] args){
        Pizza deepDish = new Pizza();

        deepDish.setToppings("Sausage, Peperoni, Peppers, Extra Cheese");
        deepDish.setSize("Large");
        deepDish.setPrice(14.99);
        deepDish.setStyle("Chicago");

        System.out.println(deepDish);

        System.out.println();

        deepDish.chicagoStyle();

    }
}
