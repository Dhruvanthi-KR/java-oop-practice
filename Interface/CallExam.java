package Interface;
class Student{
    String name;
    String dept;
    char section;
    float cgpa;
    Student(String name, String dept, char section, float cgpa){
        this.name = name;
        this.dept = dept;
        this.section = section;
        this.cgpa = cgpa;
    }
    void calculate(Student p, Student q){
        this.cgpa = p.cgpa + q.cgpa;
    }
}
public class CallExam {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", "CSE", 'A',9.0f);
        Student s2 = new Student("Ravi", "ISE", 'B',7.0f);
        Student s3 = new Student("Elya", "AIML", 'C',6.0f);
        Student s4 = new Student("Arya", "DS", 'D',7.0f);
        s3.calculate(s1,s2);
        s4.calculate(s2,s3);
        System.out.println("Cgpa "+s1.cgpa);
        System.out.println("Cgpa "+s2.cgpa);
        System.out.println("Cgpa "+s3.cgpa);
        System.out.println("Cgpa "+s4.cgpa);
    }
}
