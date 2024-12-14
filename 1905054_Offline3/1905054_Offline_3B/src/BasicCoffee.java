public class BasicCoffee implements Coffee{
    public int coffeeMug = 100;
    public int coffeeBeans = 30;
    @Override
    public String makeCoffee() {
        return "Presenting Coffee Mug and Grinded Coffee Beans\n";
    }

    @Override
    public double coffeePrice() {
        return coffeeMug + coffeeBeans;
    }
}
