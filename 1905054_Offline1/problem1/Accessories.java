import java.util.LinkedList;

public class Accessories {

    private LinkedList<String> parts;

    public Accessories() {
        parts = new LinkedList<String>();
    }

    public void buildPC(String processor, String motherboard, String hdd) {
        parts.addLast(processor);
        parts.addLast(motherboard);
        parts.addLast(hdd);
    }

    public void addRAM(String RAM) {
        parts.addLast(RAM);
    }

    public void addGraphicsCard(String GraphicsCard) {
        parts.addLast(GraphicsCard);
    }

    public void SHOW() {
        System.out.println("\nBuild PC is shown below: ");
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }
}
