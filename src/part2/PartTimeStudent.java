package part2;

public class PartTimeStudent extends Student {

    public PartTimeStudent(String fullName, String gender, int age) {
        super(fullName, gender, age);
    }
    @Override
    public String getInfo(){
        return  "Заочный студент: " + fullName + ", Пол: " + gender + ", Возраст: " + age;
    }

    @Override
    public void print(){
        System.out.println(getInfo());
    }
}
