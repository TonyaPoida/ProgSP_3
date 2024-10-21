package laba3;

public class Pupil  extends Learner {
    private int grade;
    private char letter;

    public Pupil(String fullName,String gender, int age, int grade, char letter ) {
        super(fullName,gender,age);
        this.grade = grade;
        this.letter = letter;
    }

    public Pupil(String fullName,String gender, int grade, char letter) {
        this(fullName,gender,0,grade,letter);
    }

    public Pupil(){
        this("Неизвестно","Неизвестно",0,1,'А');
    }

    public int getGrade() {
        return grade;
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+", Класс:" + grade + letter;
    }

    @Override
    public void EducationalInstitution(){
        System.out.println("Учится в школе");
    }
}
