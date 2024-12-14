public abstract class MilkCoffee implements Coffee{

    private Coffee newCoffee;
    public int milkPrice = 50;

    public MilkCoffee(Coffee newCoffee)
    {
        this.newCoffee=newCoffee;
    }

    @Override
    public String makeCoffee()
    {
        return newCoffee.makeCoffee()+ "with milk added\n";
    }

    @Override
    public double coffeePrice() {

        return newCoffee.coffeePrice() + milkPrice;
    }
}
