package part2;

public abstract class Student implements Learner, Object{
    protected String fullName;
    protected String gender;
    protected int age;

    public Student(String fullName, String gender, int age) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
    }
}
