public class Employe {
        String name;
        String status;
        double salary;

    Employe(String name, String status, int salary ){
        this.name=name;
        this.status=status;
        this.salary=salary;
        }
    void showInfo(){
        System.out.println(name+" "+status+" "+salary);
    }
}
