package part2;

public class Graduate implements Learner, Object{
    private String fullName;
    private String gender;
    private int age;
    private String workTitle;
    private String supervisor;

    public Graduate(String fullName, String gender, int age, String workTitle, String supervisor) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.workTitle = workTitle;
        this.supervisor = supervisor;
    }
    @Override
    public String getInfo(){
        return fullName + ", " + gender + ", " + age + ", " + workTitle + ", " + supervisor;
    }
    @Override
    public void print(){
        System.out.println(getInfo());
    }
}
