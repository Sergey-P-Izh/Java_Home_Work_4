import java.util.LinkedList;

public class Task_0 {

    public static void main(String[] args) {
       
        Student2 st1 = new Student2 ( "Ivan",  3);
        Student2 st2 = new Student2 ( "Nikolay", 2);
        Student2 st3 = new Student2 ( "Elena",  1);
        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        System.out.println("LinkedList = " + student2LinkedList);
       // System.out.println(student2LinkedList.get(2));
    
    }

}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';

    }
}
