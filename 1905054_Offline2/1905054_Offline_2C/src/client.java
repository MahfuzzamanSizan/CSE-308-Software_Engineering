public class client {
    public static void main(String[] args) {

        vendingMachine vendingMachine = new vendingMachine();

        System.out.println("Current Vending Machine State : " + vendingMachine.getVendingMachineState().getClass().getName());

        vendingMachine.dispenseProduct();
        vendingMachine.selectProductAndInsertMoney(90, "Pepsi");

        System.out.println("\nCurrent Vending Machine State : " + vendingMachine.getVendingMachineState().getClass().getName());

        vendingMachine.dispenseProduct();
        vendingMachine.selectProductAndInsertMoney(110, "Pepsi");



        System.out.println("\nCurrent Vending Machine State : " + vendingMachine.getVendingMachineState().getClass().getName());

        vendingMachine.dispenseProduct();
        vendingMachine.selectProductAndInsertMoney(100, "Pepsi");
        vendingMachine.dispenseProduct();


        System.out.println("\nCurrent Vending Machine State : " + vendingMachine.getVendingMachineState().getClass().getName());

    }

}

