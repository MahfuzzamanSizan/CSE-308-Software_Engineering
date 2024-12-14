import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String location = scn.nextLine();

        CarFactory carObject = new CarFactory();

        Color color1 = carObject.getColor("Red");
        Color color2 = carObject.getColor("Black");
        Color color3 = carObject.getColor("White");

        DriveTrainSystem driveTrain1 = carObject.getDriveTrainSystem("Rear Wheel");
        DriveTrainSystem driveTrain2 = carObject.getDriveTrainSystem("All Wheel");

        Brand brand1= carObject.getBrand("Toyota");
        Brand brand2= carObject.getBrand("BMW");
        Brand brand3=carObject.getBrand("Tesla");



        Engines engine1 = carObject.getEngines("Hydrogen Fuel Cell");
        Engines engine2 = carObject.getEngines("Electric Engine");


        if (location.equalsIgnoreCase("Asia")) {
            ManufacturingCountry manufacturer = carObject.getManufacturingCountry("Japan");
            System.out.println(brand1.getBrand());
            System.out.println(color1.getColor());
            System.out.println(driveTrain1.getDriveTrainSystem());
            System.out.println(manufacturer.getManufacturingCountry());
            System.out.println(engine1.getEngines());

        } else if (location.equalsIgnoreCase("Europe")) {
            ManufacturingCountry manufacturer = carObject.getManufacturingCountry("Germany");
            System.out.println(brand2.getBrand());
            System.out.println(color2.getColor());
            System.out.println(driveTrain1.getDriveTrainSystem());
            System.out.println(manufacturer.getManufacturingCountry());
            System.out.println(engine2.getEngines());

        } else if (location.equalsIgnoreCase("USA")) {
            ManufacturingCountry manufacturer = carObject.getManufacturingCountry("USA");
            System.out.println(brand3.getBrand());
            System.out.println(color3.getColor());
            System.out.println(driveTrain2.getDriveTrainSystem());
            System.out.println(manufacturer.getManufacturingCountry());
            System.out.println(engine2.getEngines());

        }


    }
}
