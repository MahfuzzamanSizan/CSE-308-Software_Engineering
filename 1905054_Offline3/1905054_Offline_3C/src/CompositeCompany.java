import java.util.ArrayList;
import java.util.List;

public class CompositeCompany implements SoftwareCompany{

    private int Count=0;
    private String name;
    private List<SoftwareCompany> controls;
    public CompositeCompany(String name)
    {
        this.name= name;
        controls = new ArrayList<SoftwareCompany>();
    }

    public void addManager(SoftwareCompany e)
    {
        controls.add(e);

    }

    public void removeManager(SoftwareCompany e)
    {
        controls.remove(e);

    }

    @Override
    public void printDetails() {
        System.out.println("\tName: " + this.name);
        System.out.println("\tNumber of employees: " + this.getEmployeeCount());
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
