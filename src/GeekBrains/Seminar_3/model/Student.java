
package GeekBrains.Seminar_3.model;

public class Student extends User implements Comparable<Student> {
    private int studentId;


    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName,secondName,lastName);
        this.studentId = studentId;

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override      //чтобы программа знала, как сравниь 2 объекта нашего класса
    public int compareTo(Student o) {   //сравнение студентов по ID
        if(o.getStudentId() > studentId)  //если ID больше текущего ID, то вернется -1
            return -1;
        if(o.getStudentId() < studentId)   //и если наоборот, то вернется 1
            return 1;
        return 0;
    }
}
