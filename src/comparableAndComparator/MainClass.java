package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args){
        List<Student> students=new ArrayList<>();
        students.add(new Student(5,"tishya"));
        students.add(new Student(5,"lavanya"));
        students.add(new Student(3,"pranav"));
        students.add(new Student(7,"pranav"));
        students.add(new Student(9,"brijesh"));

        //using Comaparable
        Collections.sort(students);

        //using comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                if(t1.name.equals(t2.name)){
                    return t1.marks-t2.marks;
                }
                else{
                    return t1.name.compareTo(t2.name);
                }
            }
        });
        students.forEach(System.out::println);
    }
}
