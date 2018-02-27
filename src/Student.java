import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    //Write class Student that provides information about the
    //name of the student and his course. Class Student should
    //consists of properties for access to these fields
    //constructor with parameters
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    static List<Student> stList=new ArrayList<>();
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        stList.add(new Student(name,course));

    }
    //method printStudents (List students, Integer course)
    //which receives a list of students and the course number
    //and prints to the console the names of the students
    //from the list, which are taught in this course(use an iterator)
    public static void printStudents (ArrayList<Student> listSt,int couse){

    }






}
