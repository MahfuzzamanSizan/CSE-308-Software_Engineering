public class Employee implements SoftwareCompany{
    private String name;
    private String role;
    private String currentProject;

    private int Count=0;

    public Employee(String name, String role, String currentProject)
    {
        this.name= name;
        this.role= role;
        this.currentProject= currentProject;
    }
    @Override
    public void printDetails() {
        System.out.println("\t\t\tName: " + this.name);
        System.out.println("\t\t\tRole: " + this.role);
        System.out.println("\t\t\tCurrent Project: " + this.currentProject);
        System.out.println();

    }

    @Override
    public int getEmployeeCount() {
        return Count;
    }
}
