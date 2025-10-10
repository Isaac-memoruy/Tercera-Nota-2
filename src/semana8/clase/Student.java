package semana8.clase;


public class Student {
    public String name;
    public double grade;
    
    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    public boolean hasPassed() {
        return this.grade >= 3.0;
    }

    public static void compareGrades(Student s1, Student s2){
        if(s1.grade > s2.grade){
            System.out.println(s1.name + " has a higher grade than " + s2.name);
        } else if(s1.grade < s2.grade){
            System.out.println(s2.name + " has a higher grade than " + s1.name);
        } else {
            System.out.println(s1.name + " and " + s2.name + " have the same grade.");
        }
    }
}