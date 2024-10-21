package part2;

public class Main2 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil("Иванов Иван", "М", 15, 9, 'A');
        Graduate graduate = new Graduate("Петрова Мария", "Ж", 25, "Квантовая механика", "Др. Сидоров");
        FullTimeStudent fullTimeStudent = new FullTimeStudent("Смирнов Алексей", "М", 20);
        PartTimeStudent partTimeStudent = new PartTimeStudent("Кузнецова Анна", "Ж", 22);

        pupil.print();
        graduate.print();
        fullTimeStudent.print();
        partTimeStudent.print();
    }
}
