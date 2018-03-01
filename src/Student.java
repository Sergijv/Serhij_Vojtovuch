import java.util.*;

public class Student implements Comparator<Student> {
    //Write class Student that provides information about the
    //name of the student and his course. Class Student should
    //consists of properties for access to these fields
    //constructor with parameters
    private String name;
    private int course;
    public static int count;

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
    static ArrayList<Student> stList=new ArrayList<>();
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        this.stList.add(this);
        count=count+1;

    }
    //method printStudents (List students, Integer course)
    //which receives a list of students and the course number
    //and prints to the console the names of the students
    //from the list, which are taught in this course(use an iterator)
    public static void printStudents (ArrayList<Student> listSt,int couse){
        ListIterator<Student> listIterator = stList.listIterator();
        while (listIterator.hasNext()){
            Student s=listIterator.next();
            if(s.course==couse) System.out.println(s.name+" "+couse);
        }
    }
    public static void printAllStudents (ArrayList<Student> listSt){
        for (Student s:listSt) {
            System.out.println(s.name+" "+s.course);
        }
    }



    @Override
    public int compare(Student s1, Student s2) {
        return s1.course>s2.course ? 1:s1.course<s2.course ? -1 :s1.name.compareTo(s2.name);
    }
    //methods to compare students by name and by course
    static class CourseComparator implements Comparator<Student>{
        public int compare(Student s1,Student s2){
            return s1.course>s2.course ? 1:s1.course<s2.course ? -1 :0;
        }
    }
    static class NameComparator implements Comparator<Student>{
        public int compare(Student s1,Student s2){
            return s1.name.compareTo(s2.name);
        }
    }

}




