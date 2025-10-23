package unidad2.semana8;
import unidad2.semana8.clase.Student;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("John Doe", 4.5);
        Student s2 = new Student("Jane Doe", 2.9);
        Student.compareGrades(s1, s2);

        System.out.println(s1.name + " passed: " + s1.hasPassed());
        System.out.println(s2.name + " passed: " + s2.hasPassed());
    }
}
