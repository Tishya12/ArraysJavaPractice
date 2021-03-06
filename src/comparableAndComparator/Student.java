package comparableAndComparator;

public class Student implements Comparable<Student> {
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //for decreasing order sorting
//    @Override
//    public int compareTo(Student student) {
//      if(this.marks>student.marks) return -1;
//      else if(this.marks<student.marks) return 1;
//      return 0;
//    }

    //for increasing order sorting
    @Override
    public int compareTo(Student student) {
        if(this.marks>student.marks) return 1;
        else if(this.marks<student.marks) return -1;
        //return 0;
        //if marks are same than sort acc. to name
        return this.name.compareTo(student.name);
    }
}
