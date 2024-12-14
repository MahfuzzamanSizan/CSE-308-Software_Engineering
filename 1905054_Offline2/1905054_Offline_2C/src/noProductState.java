public class noProductState implements vmState{
    @Override
    public void selectProductAndInsertMoney(int amount, String productName) {
        System.out.println("Sorry there is no product");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Take back your money");
    }
}
