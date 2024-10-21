package laba3;

public class Student extends Learner{
    private String faculty;
    private String specialty;
    private String groupNumber;

    public Student(String fullName,String gender, int age, String faculty, String specialty, String groupNumber) {
        super(fullName, gender, age);
        this.faculty = faculty;
        this.specialty = specialty;
        this.groupNumber = groupNumber;
    }

    public Student(String fullName,String gender, int age, String faculty, String specialty) {
        this(fullName,gender,age,faculty,specialty,null);
    }

    public Student(){
        this("Неизвестно","Неизвестно",0,
                "Неизвестно","Неизвестно",null);
    }

    public String getFaculty() {
        return faculty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+", Факультет: " + faculty + ", Специальность: "
                + specialty + ", Номер группы: " + groupNumber;
    }

    @Override
    public void EducationalInstitution(){
        System.out.println("Учится в университете");
    }

}
