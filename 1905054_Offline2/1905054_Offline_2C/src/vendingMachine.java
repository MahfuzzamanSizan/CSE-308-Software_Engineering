public class vendingMachine implements vmState{

    private vmState vendingMachineState;
    public int productPrice=100;
    public int productAmount= 2;

    public vendingMachine()
    {
        vendingMachineState = new noMoneyState();
    }

    public vmState getVendingMachineState()
    {
        return vendingMachineState;
    }

    public void setVendingMachineState( vmState vendingMachineState )
    {
        this.vendingMachineState = vendingMachineState;
    }
    @Override
    public void selectProductAndInsertMoney(int amount, String productName) {
        vendingMachineState.selectProductAndInsertMoney(amount, productName);

        if(amount > productPrice)
        {
            vmState hasMoreMoneyState = new moreMoneyState();
            if( vendingMachineState instanceof noMoneyState )
            {
                setVendingMachineState(hasMoreMoneyState);
                System.out.println("Vending Machine internal state has been moved to : " + vendingMachineState.getClass().getName());
            }
            productAmount--;
        }
        else if(amount < productPrice){
            vmState hasLessMoneyState = new lessMoneyState();
            if( vendingMachineState instanceof noMoneyState )
            {
                setVendingMachineState(hasLessMoneyState);
                System.out.println("Vending Machine internal state has been moved to : " + vendingMachineState.getClass().getName());
            }
        }
        else {
            vmState hasEqualMoneyState = new equalMoneyState();
            if( vendingMachineState instanceof noMoneyState )
            {
                setVendingMachineState(hasEqualMoneyState);
                System.out.println("Vending Machine internal state has been moved to : " + vendingMachineState.getClass().getName());
            }
            productAmount--;
        }

    }

    @Override
    public void dispenseProduct() {
        vmState noMoenyState = new noMoneyState();
        vmState noProductState = new noProductState();
        //vmState lessMoneyState = new lessMoneyState();
        vendingMachineState.dispenseProduct();

        if(productAmount==0)
        {
            System.out.println("Product Amount : " + productAmount);
            setVendingMachineState(noProductState);
            System.out.println("Vending Machine internal state has been moved to : " + vendingMachineState.getClass().getName());
        }

        if( vendingMachineState instanceof moreMoneyState )
        {
            System.out.println("Product Amount : " + productAmount);
            setVendingMachineState(noMoenyState);
            System.out.println("Vending Machine internal state has been moved to : " + vendingMachineState.getClass().getName());
        }
        else if( vendingMachineState instanceof equalMoneyState )
        {
            System.out.println("Product Amount : " + productAmount);
            setVendingMachineState(noMoenyState);
            System.out.println("Vending Machine internal state has been moved to : " + vendingMachineState.getClass().getName());
        }
        else if( vendingMachineState instanceof lessMoneyState)
        {
            System.out.println("Product Amount : " + productAmount);
            setVendingMachineState(noMoenyState);
            //System.out.println("You have given less money");
            System.out.println("Vending Machine internal state has been moved to : " + vendingMachineState.getClass().getName());
        }

    }

}
