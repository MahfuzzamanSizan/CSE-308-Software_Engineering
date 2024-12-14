public class Americano extends BlackCoffee{
    public int grindedBeans = 30;
    public Americano(Coffee newCoffee)
    {
        super(newCoffee);
    }

    @Override
    public String makeCoffee() {
        return super.makeCoffee() + "with extra grinded coffee beans\n";
    }

    @Override
    public double coffeePrice() {
        return super.coffeePrice() + grindedBeans;
    }
}
