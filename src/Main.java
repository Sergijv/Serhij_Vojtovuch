import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Homework
        //1.Write parameterized methods union(Set set1, Set
        //set2) and intersect(Set set1, Set set2), realizing the
        //operations of union and intersection of two sets.
        //Test the operation of these techniques on two
        //pre-filled sets.
        Set<String >set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");

        set2.add("3");
        set2.add("a");
        set2.add("b");
        set2.add("c");

        new MySet.UnionClass().union(set1,set2);
        System.out.println("union");
        for (String i : set1) System.out.print(i);

        set1= MySet.InterSetClass.intersect(set1,set2);
        System.out.println();
        System.out.println("interset");
        for (String i : set1) System.out.print(i);

//Hometask2
        //Create map personMap and add to it ten persons of
        //type <String, String> (lastName, firstName).
        //Output the entities of the map on the screen.
        //There are at less two persons with the same firstName among
        //these 10 people?


        System.out.println();
        System.out.println("Task2");
        MyMap myMap=new MyMap();
        Map<String, String> personMap = new HashMap<String, String>();
        personMap=myMap.setPersonMap10();
        myMap.printMyMap(personMap);
        System.out.println(myMap.samefirstName(personMap));
   //Hometask3
        //Write class Student that provides information about the
        //name of the student and his course. Class Student should
        //consists of properties for access to these fields
        //constructor with parameters
        //method printStudents (List students, Integer course),
        //which receives a list of students and the course number
        //and prints to the console the names of the students
        //from the list, which are taught in this course (use an
        //iterator)
        //methods to compare students by name and by course
        //In the main() method
        //declare List students and add to the list five
        //different students
        //display the list of students ordered by name
        //display the list of students ordered by course.
        System.out.println("Task3");
        Student s1 = new Student("a1",2);
        Student s2 = new Student("a2",1);
        Student s3 = new Student("a3",3);
        Student s4 = new Student("a4",5);
        Student s5 = new Student("a5",2);

        System.out.println("Count: "+Student.count);

       ArrayList<Student> studentList =Student.stList;

        System.out.println("List size "+studentList.size());

        Student.printAllStudents(studentList);
        Comparator cn= new Student.NameComparator();
        System.out.println("Sort by name");
       studentList.sort(cn );
       Student.printAllStudents(studentList);

        Comparator cc= new Student.CourseComparator();
        System.out.println("Sort by course");
        studentList.sort(cc );
        Student.printAllStudents(studentList);


        System.out.println("Sort by 2 course");
        Student.printStudents(studentList,2);




    }

}
