package GeekBrains.OOP.Seminar_3.controler;


import GeekBrains.OOP.Seminar_3.model.User;

public interface UserControler <T extends User>{
    void create(String firstName, String secondName, String lastName);
}
