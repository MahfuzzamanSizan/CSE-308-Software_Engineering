public class Director {
    PCBuilder pcBuilder;

    public void construct(PCBuilder pcBuilderType) {
        pcBuilder = pcBuilderType;
        pcBuilder.buildPC();
        pcBuilder.addRAM();
        pcBuilder.addGraphicsCard();
    }
}
