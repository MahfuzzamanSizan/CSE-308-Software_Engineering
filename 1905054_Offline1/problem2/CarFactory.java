public class CarFactory {

    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }

        if (colorType.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("Black")) {
            return new Black();
        } else if (colorType.equalsIgnoreCase("White")) {
            return new White();
        }

        return null;
    }

    public Engines getEngines(String engineType) {
        if (engineType == null) {
            return null;
        }

        if (engineType.equalsIgnoreCase("Hydrogen Fuel Cell")) {
            return new HydrogenFuel();
        } else if (engineType.equalsIgnoreCase("Electric Engine")) {
            return new ElectricEngine();
        }


        return null;
    }

    public DriveTrainSystem getDriveTrainSystem(String driveTrainType) {
        if (driveTrainType == null) {
            return null;
        }

        if (driveTrainType.equalsIgnoreCase("Rear Wheel")) {
            return new RearWheel();
        } else if (driveTrainType.equalsIgnoreCase("All Wheel")) {
            return new AllWheel();
        }

        return null;
    }

    public ManufacturingCountry getManufacturingCountry(String manufactureType) {
        if (manufactureType == null) {
            return null;
        }
        if (manufactureType.equalsIgnoreCase("Japan")) {
            return new Japan();
        } else if (manufactureType.equalsIgnoreCase("Germany")) {
            return new Germany();
        } else if (manufactureType.equalsIgnoreCase("USA")) {
            return new USA();
        }
        return null;
    }

    public Brand getBrand(String brandType)
    {
        if(brandType==null)
        {
            return null;
        }
        else if(brandType.equalsIgnoreCase("Toyota"))
        {
            return new Toyota();
        }
        else if(brandType.equalsIgnoreCase("BMW"))
        {
            return new BMW();
        }

        else if(brandType.equalsIgnoreCase("Tesla"))
        {
            return new Tesla();
        }


        return null;
    }
}
