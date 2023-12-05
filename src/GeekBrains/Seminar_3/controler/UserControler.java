package GeekBrains.Seminar_3.controler;


import GeekBrains.Seminar_3.model.User;
import GeekBrains.Seminar_3.service.StudentService;

public interface UserControler <T extends User>{
    void create(String firstName, String secondName, String lastName);
}
