public class mainFunc {
    public static void main(String[] args) {
        System.out.println("***-------Adapter Pattern-------***\n\n");

        Crewmate crewmate = new Crewmate();
        System.out.println("Crewmate working like crewmate : " +  crewmate.maintenanceFunc() + "\n");


        Imposter imposter = new Imposter();
        System.out.println("Imposter working like imposter : " + imposter.sabotageFunc() + "\n");


        CrewmateInterface adaptedImposter = new CrewAdapter(imposter);
        System.out.println("Imposter working like crewmate : " + adaptedImposter.maintenanceFunc() + "\n");


    }
}
