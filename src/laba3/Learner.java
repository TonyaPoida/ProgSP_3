package laba3;

public class Learner {
    private String fullName;
    private String gender;
    private int age;

    public Learner(){}

    public Learner(String fullName, String gender, int age){
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
    }

    public Learner(String fullName, String gender){
        this(fullName, gender, 0);
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getInfo(){
        return "ФИО: " + fullName + ", Пол: " + gender + ", Возраст: " + age;
    }

    public void EducationalInstitution(){
    }
}
