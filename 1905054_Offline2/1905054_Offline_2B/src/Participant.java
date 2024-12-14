public abstract class Participant {

    private ExamController examControllerOffice;
    private int id;

    public Participant(ExamController examControllerOffice, int id) {
        this.examControllerOffice = examControllerOffice;
        this.id = id;
    }

    public ExamController getExamControllerOffice() {
        return examControllerOffice;
    }

    public int getID() {
        return id;
    }

    public abstract void receive(ExamPackage examPackage);
}
