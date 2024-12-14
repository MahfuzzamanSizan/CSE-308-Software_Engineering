public class ExamScript {

    private int examinerID;

    private int examineeID;

    private int scriptMarks;

    private int reExaminationStatus;

    public ExamScript(int examinerID, int examineeID, int scriptMarks)
    {
        this.examinerID = examinerID;

        this.examineeID = examineeID;

        this.scriptMarks = scriptMarks;

        reExaminationStatus = 1;
    }


    public int getExamineeID()
    {
        return examineeID;
    }


    public int getExaminerID()
    {
        return examinerID;
    }





    public void setReexaminationStatus(int reexaminationStatus)
    {
        this.reExaminationStatus = reExaminationStatus;
        return ;
    }


    public int getReExaminationStatus()
    {
        return reExaminationStatus;
    }


    public void setScirptMarks(int scriptMarks)
    {
        this.scriptMarks = scriptMarks;
        return ;
    }


    public int getScriptMarks()
    {
        return scriptMarks;
    }

}
