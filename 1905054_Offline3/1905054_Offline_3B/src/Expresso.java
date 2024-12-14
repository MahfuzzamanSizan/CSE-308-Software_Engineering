public class Expresso extends BlackCoffee{
    public int dairyCream = 40;
    public Expresso(Coffee newCoffee)
    {
        super(newCoffee);
    }

    @Override
    public String makeCoffee() {
        return super.makeCoffee() + "with dairy cream\n";
    }

    @Override
    public double coffeePrice() {
        return super.coffeePrice() + dairyCream;
    }
}
