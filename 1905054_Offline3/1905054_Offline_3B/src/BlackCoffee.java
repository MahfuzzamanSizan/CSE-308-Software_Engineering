public abstract class BlackCoffee implements Coffee{

    private Coffee newCoffee;
    public int waterPrice = 0;

    public BlackCoffee(Coffee newCoffee)
    {
        this.newCoffee=newCoffee;
    }

    @Override
    public String makeCoffee()
    {
        return newCoffee.makeCoffee() + "with water added\n";
    }

    @Override
    public double coffeePrice() {

        return newCoffee.coffeePrice() + waterPrice;
    }
}
