package GeekBrains.OOP.Seminar_3_and_4.controler;


import GeekBrains.OOP.Seminar_3_and_4.model.User;

public interface UserControler <T extends User>{
    void create(String firstName, String secondName, String lastName);
}
