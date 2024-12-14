public class noMoneyState implements vmState{
    @Override
    public void selectProductAndInsertMoney(int amount, String productName) {
        System.out.println(amount +  " taka has been inserted and " + productName + " has been selected");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Vending Machine can not dispense your product because money is not inserted and product is not selected\n");
    }
}
