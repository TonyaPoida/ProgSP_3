package part2;

public class Pupil implements Learner, Object{
    private String fullName;
    private String gender;
    private int age;
    private int grade;
    private char letter;

    public Pupil(String fullName, String gender, int age, int grade, char letter) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.letter = letter;
    }

    @Override
    public String getInfo(){
        return fullName + ", " + gender + ", " + age + ", " + grade + ", " + letter;
    }

    @Override
    public void print(){
        System.out.println(getInfo());
    }
}
