import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class CompositeEmployee implements SoftwareCompany{

    private int Count=0;
    private String name;
    private String role;
    private String currentProject;
    private List<SoftwareCompany> controls;

    public CompositeEmployee(String name, String role, String currentProject)
    {
        this.name=name;
        this.role=role;
        this.currentProject=currentProject;
        controls = new ArrayList<SoftwareCompany>();
    }

    public void addDeveloper(SoftwareCompany e)
    {
        controls.add(e);

    }

    public void removeDeveloper(SoftwareCompany e)
    {
        controls.remove(e);

    }



    @Override
    public void printDetails() {

        System.out.println("\t\tName: " + this.name);
        System.out.println("\t\tRole: " + this.role);
        System.out.println("\t\tCurrent Project: " + this.currentProject);
        System.out.println("\t\tNumber of Supervisees: " + this.getEmployeeCount());
        System.out.println();
        for (SoftwareCompany e : controls)
        {
            e.printDetails();
        }



    }

    @Override
    public int getEmployeeCount() {
        Count = controls.size();
        for (SoftwareCompany e : controls)
        {
            Count += e.getEmployeeCount();
        }

        return Count;
    }
}
