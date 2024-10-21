package part2;

public class FullTimeStudent extends Student {
    public FullTimeStudent(String fullName, String gender, int age) {
        super(fullName, gender, age);
    }

    @Override
    public String getInfo(){
        return  "Очный студент: " + fullName + ", Пол: " + gender + ", Возраст: " + age;
    }
    @Override
    public void print(){
        System.out.println(getInfo());
    }
}
