import java.util.Scanner;

public class MainFunc {
    public static void main(String[] args) {
        System.out.println("***-------Decorator Pattern-------***\n");
        System.out.println("###-------Coffee Menu-------###");
        System.out.println("    (1) Americano");
        System.out.println("    (2) Expresso");
        System.out.println("    (3) Cappuccino");
        System.out.println("    (4) Mocha");
        System.out.println("    (5) Exit");

        Scanner scn = new Scanner(System.in);

        double totalPrice=0;

        while (true)
        {
            int choice = scn.nextInt();
            if(choice==1){
                Coffee coffee1 = new Americano((Coffee) new BasicCoffee());
                System.out.println(coffee1.makeCoffee());
                System.out.println(coffee1.coffeePrice() + " taka");
                totalPrice = totalPrice+ coffee1.coffeePrice();
            }


            if(choice==2){
                Coffee coffee2 = new Expresso((Coffee) new BasicCoffee());
                System.out.println(coffee2.makeCoffee());
                System.out.println(coffee2.coffeePrice() + " taka");
                totalPrice = totalPrice + coffee2.coffeePrice();
            }


            if(choice==3){
                Coffee coffee3 = new Cappuccino((Coffee) new BasicCoffee());
                System.out.println(coffee3.makeCoffee());
                System.out.println(coffee3.coffeePrice() + " taka");
                totalPrice = totalPrice + coffee3.coffeePrice();
            }


            if(choice==4){
                Coffee coffee4 = new Mocha((Coffee) new BasicCoffee());
                System.out.println(coffee4.makeCoffee());
                System.out.println(coffee4.coffeePrice() + " taka");
                totalPrice = totalPrice + coffee4.coffeePrice();
            }

            if(choice==5)
            {
                break;
            }
        }

        System.out.println("Total Price : " + totalPrice +" taka");

    }
}
