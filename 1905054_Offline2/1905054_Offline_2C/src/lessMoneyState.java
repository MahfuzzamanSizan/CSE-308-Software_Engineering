public class lessMoneyState implements vmState{
    @Override
    public void selectProductAndInsertMoney(int amount, String productName) {
        System.out.println("Already Vending machine has money and product selected,So wait till it finish the current dispensing process");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Vending Machine can't dispense your product as you have given less money");
        System.out.println("Take back your money and try again\n");
    }
}
