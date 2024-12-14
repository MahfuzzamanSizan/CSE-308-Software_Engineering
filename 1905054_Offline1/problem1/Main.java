import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        PCBuilder pc1 = new PC1();
        PCBuilder pc2 = new PC2();
        PCBuilder pc3 = new PC3();
        PCBuilder gamingPC = new GamingPC();

        Accessories a1 = new Accessories();


        Scanner scn = new Scanner(System.in);

        System.out.println("PC1, PC2, PC3, GamingPC?");
        String pcType = scn.nextLine();


        if (pcType.equalsIgnoreCase("PC1")) {
            System.out.println("Want to add RAM?");
            String ans1 = scn.nextLine();

            if (ans1.equalsIgnoreCase("Yes")) {
                System.out.println("2666 MHz or 3200 MHz?");
                String ans2 = scn.nextLine();
                a1.addRAM(ans2);
            }


            System.out.println("Want to add GraphicsCard?");
            String ans3 = scn.nextLine();

            if (ans3.equalsIgnoreCase("Yes")) {
                System.out.println("2GB or 4GB?");
                String ans4 = scn.nextLine();
                a1.addGraphicsCard(ans4);
            }


            director.construct(pc1);
            Accessories acc1 = pc1.getPC();
            acc1.SHOW();
        } else if (pcType.equalsIgnoreCase("PC2")) {
            System.out.println("Want to add RAM?");
            String ans1 = scn.nextLine();

            if (ans1.equalsIgnoreCase("Yes")) {
                System.out.println("2666 MHz or 3200 MHz?");
                String ans2 = scn.nextLine();
                a1.addRAM(ans2);
            }


            System.out.println("Want to add GraphicsCard?");
            String ans3 = scn.nextLine();

            if (ans3.equalsIgnoreCase("Yes")) {
                System.out.println("2GB or 4GB?");
                String ans4 = scn.nextLine();
                a1.addGraphicsCard(ans4);
            }

            director.construct(pc2);
            Accessories acc2 = pc2.getPC();
            acc2.SHOW();

        } else if (pcType.equalsIgnoreCase("PC3")) {

            System.out.println("Want to add RAM?");
            String ans1 = scn.nextLine();

            if (ans1.equalsIgnoreCase("Yes")) {
                System.out.println("2666 MHz or 3200 MHz?");
                String ans2 = scn.nextLine();
                a1.addRAM(ans2);
            }


            System.out.println("Want to add GraphicsCard?");
            String ans3 = scn.nextLine();

            if (ans3.equalsIgnoreCase("Yes")) {
                System.out.println("2GB or 4GB?");
                String ans4 = scn.nextLine();
                a1.addGraphicsCard(ans4);
            }

            director.construct(pc3);
            Accessories acc3 = pc3.getPC();
            acc3.SHOW();

        } else if (pcType.equalsIgnoreCase("GamingPC")) {

            System.out.println("Want to add RAM?");
            String ans1 = scn.nextLine();

            if (ans1.equalsIgnoreCase("Yes")) {
                System.out.println("2666 MHz or 3200 MHz?");
                String ans2 = scn.nextLine();
                a1.addRAM(ans2);
            }


            System.out.println("Want to add GraphicsCard?");
            String ans3 = scn.nextLine();

            if (ans3.equalsIgnoreCase("Yes")) {
                System.out.println("2GB or 4GB?");
                String ans4 = scn.nextLine();
                a1.addGraphicsCard(ans4);
            }

            director.construct(gamingPC);
            Accessories acc4 = gamingPC.getPC();
            acc4.SHOW();

        }


    }
}
