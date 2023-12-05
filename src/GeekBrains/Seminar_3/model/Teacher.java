//HomeWork
// — Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
//— Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
//— Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.


package GeekBrains.Seminar_3.model;

public class Teacher extends User implements Comparable<Teacher>{
    private int teacherId;

    public Teacher(int teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Учитель{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return 0;
    }
}
