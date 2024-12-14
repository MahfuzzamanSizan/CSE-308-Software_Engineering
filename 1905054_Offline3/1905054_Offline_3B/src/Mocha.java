public class Mocha extends MilkCoffee{

    public int  chocolateSauce = 60;
    public Mocha(Coffee newCoffee)
    {
        super(newCoffee);
    }

    @Override
    public String makeCoffee() {
        return super.makeCoffee() + "with chocolate sauce\n";
    }

    @Override
    public double coffeePrice() {
        return super.coffeePrice() + chocolateSauce;
    }
}
