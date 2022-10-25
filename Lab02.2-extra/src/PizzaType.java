public class PizzaType {
    public static void main(String[] args) {
        Pizza sicilian = new Pizza();

        sicilian.setToppings("onions, tomatoes, Anchovies");
        sicilian.setSize("medium");
        sicilian.setPrice(8.99);
        sicilian.setStyle("Sicilian");

        System.out.println(sicilian);
    }
}