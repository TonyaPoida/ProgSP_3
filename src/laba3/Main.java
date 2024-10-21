package laba3;

public class Main {
    public static void main(String[] args) {
        Learner pupil = new Pupil("Страшинский П.В.", "М", 10,5,'Г');
        Learner student = new Student("Рохликова Н.С.", "Ж", 20,"ИЭ", "ИСИТ(вЭ)");
        Learner graduate = new Graduate();

        WriterInfo writer = new WriterInfo();
        writer.printInfo(pupil);
        pupil.EducationalInstitution();

        writer.printInfo(student);
        student.EducationalInstitution();

        writer.printInfo(graduate);
        graduate.EducationalInstitution();
    }
}
