public class PC1 implements PCBuilder {

    private Accessories accessories = new Accessories();

    @Override
    public void buildPC() {
        accessories.buildPC("Core i5,", "Built in motherboard,", "1TB hdd");

    }

    @Override
    public void addRAM() {
        accessories.addRAM("RAM added");
    }

    @Override
    public void addGraphicsCard() {
        accessories.addGraphicsCard("Graphics card added");
    }

    @Override
    public Accessories getPC() {
        return accessories;
    }
}
