public class mainFunc {
    public static void main(String[] args) {
        System.out.println("***-------Composite Pattern-------***\n");


        Employee developer1 = new Employee("Robert Oppenheimer","Developer","CSE308");
        Employee developer2 = new Employee("John von Neumann","Developer","CSE308");

        Employee developer3 = new Employee("Alfred Aho","Developer","CSE307");

        CompositeEmployee manager1 = new CompositeEmployee("Alan Turing","Project Manager","CSE308");
        CompositeEmployee manager2 = new CompositeEmployee("David Patterson","Project Manager","CSE307");

        CompositeCompany softwareCompany1 = new CompositeCompany("Manhattan Company");

        manager1.addDeveloper(developer1);
        manager1.addDeveloper(developer2);
        manager2.addDeveloper(developer3);

        softwareCompany1.addManager(manager1);
        softwareCompany1.addManager(manager2);

        softwareCompany1.printDetails();

/*
        System.out.println("\n\n");
        System.out.println(softwareCompany1.getEmployeeCount());
        System.out.println(manager1.getEmployeeCount());
        System.out.println(manager2.getEmployeeCount());


        System.out.println();
        manager1.printDetails();
        System.out.println();
        manager2.printDetails();
        System.out.println("\n\n");


        developer2.printDetails();
        System.out.println(developer2.getEmployeeCount());

        System.out.println("\n\n");

 */


        System.out.println("-------Manager 1 Details-------");
        manager1.printDetails();


        System.out.println("-------After Removing Developer 2-------");
        manager1.removeDeveloper(developer2);
        softwareCompany1.printDetails();

        //System.out.println(softwareCompany1.getEmployeeCount());
        //System.out.println(manager1.getEmployeeCount());
        //System.out.println(manager2.getEmployeeCount());


        System.out.println("-------After Removing Manager 2-------");
        softwareCompany1.removeManager(manager2);
        softwareCompany1.printDetails();




    }
}
