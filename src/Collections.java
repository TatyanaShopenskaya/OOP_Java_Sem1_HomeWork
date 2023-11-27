//public class Collections {
//    public static void main(String[] args) {
//        String[] employees = getEmployess(); //создаем массив сотрудников, чтобы добавить +еще 1 сотрудника
//        String[] newArray = new String[employees.length + 1];  //длина на 1 больше становится
//        for (int i=0; i < employees.length; i++) {    //копируем все эл-ты из 1 массива во 2 массив
//            newArray[i] = employees[i];
//        }
//        newArray[newArray.length - 1] = "Tatyana";          //добавление нового сотрудника
//        employees = newArray;
//        for (String employee:employees){
//            System.out.println(employee);
//        }
//    }
//
//
//     static String[] getEmployees() {    //метод, который возвращает список сотрудников, его изменять нельзя
//        String[] employees = new String[5];
//        employees[0] = "Olga";
//        employees[1] = "Alisa";
//        employees[2] = "Alex";
//        employees[3] = "Gigi";
//        employees[4] = "Tim";
//        return employees;
//    }
//}