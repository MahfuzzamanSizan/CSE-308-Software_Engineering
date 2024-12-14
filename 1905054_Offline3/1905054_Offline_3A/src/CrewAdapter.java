public class CrewAdapter implements CrewmateInterface{
    Imposter imposter;

    public CrewAdapter(Imposter imposter)
    {
        this.imposter= imposter;
    }


    @Override
    public String maintenanceFunc() {
        return imposter.sabotageFunc();
    }
}
