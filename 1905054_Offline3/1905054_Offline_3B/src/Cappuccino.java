public class Cappuccino extends MilkCoffee{

    public int  cinnamonPowder = 50;
    public Cappuccino(Coffee newCoffee)
    {
        super(newCoffee);
    }

    @Override
    public String makeCoffee() {
        return super.makeCoffee() + "with cinnamon powder\n";
    }

    @Override
    public double coffeePrice() {
        return super.coffeePrice() + cinnamonPowder;
    }
}
