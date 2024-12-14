import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("***-------Composite Pattern-------***\n");

        System.out.println("    (1) Create");
        System.out.println("    (2) Remove");
        //System.out.println("    (3) Print");
        //System.out.println("    (4) Exit");

        String A = scn.nextLine();
        int inputA = Integer.parseInt(A);

        if(inputA==1)
        {
            System.out.println("How many software company you want to create?");
            String B = scn.nextLine();
            int inputB = Integer.parseInt(B);
            for(int i = 1; i<=inputB; i++) {
                System.out.println("        Create Software Company : " + i);

                System.out.println("Company Name : ");
                String companyName = scn.nextLine();
                CompositeCompany softwareCompany1 = new CompositeCompany(companyName);
                System.out.println("How many project manager you want to create?");
                String C = scn.nextLine();
                int inputC = Integer.parseInt(C);
                for(int j = 1; j <= inputC; j++) {
                    System.out.println("        Create Project Manager : " + j);

                    System.out.println("Project Manager Name : ");
                    String managerName = scn.nextLine();
                    //String managerRole = scn.nextLine();
                    System.out.println("Current Project : ");
                    String CurrentProject = scn.nextLine();

                    CompositeEmployee manager1 = new CompositeEmployee(managerName, "Project Manager", CurrentProject);
                    softwareCompany1.addManager(manager1);

                    System.out.println("How many developer you want to create?");
                    String D = scn.nextLine();
                    int inputD = Integer.parseInt(D);
                    for(int k =1;k<=inputD; k++) {
                        System.out.println("        Create Developer : " + k);

                        System.out.println("Developer Name : ");
                        String developerName = scn.nextLine();
                        //String developerRole = scn.nextLine();
                        //String developerCurrentProject = scn.nextLine();

                        Employee developer1 = new Employee(developerName, "Developer", CurrentProject);
                        manager1.addDeveloper(developer1);
                    }

                }


                System.out.println();
                softwareCompany1.printDetails();



            }


        }


        if(inputA==2)
        {
            System.out.println("Sorry!!! No company has been created");
        }


    }
}
