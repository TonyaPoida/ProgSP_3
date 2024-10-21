package laba3;

public class Graduate extends Learner{
    private String workTitle;
    private String supervisor;

    public Graduate(String fullName, String gender, int age, String workTitle, String supervisor ) {
        super(fullName, gender, age);
        this.workTitle = workTitle;
        this.supervisor = supervisor;
    }

    public Graduate(String fullName, String gender, int age, String workTitle) {
        this(fullName, gender, age, workTitle, "Неизвестно");
    }

    public Graduate(){
        this("Неизвестно","Неизвестно",0,
                "Неизвестно","Неизвестно");
    }
    public String getWorkTitle() {
        return workTitle;
    }

    public String getSupervisor() {
        return supervisor;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+", Название научной работы: " + workTitle + ", Научный руководитель: "
                + supervisor ;
    }

    @Override
    public void EducationalInstitution(){
        System.out.println("Учится в аспирантуре");
    }
}
