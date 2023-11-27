//public class HW {
//    public static void main(String[] args) {
//        int days = 10000;
//        int years=days/365;
//        int months=(days-(years*365))/30;
//        int new_days=days-(years*365)-(months*30);
//        System.out.println(years+","+months+","+new_days);
//    }
//}


//public class HW {
//    public static void main(String[] args) {
//        int a =5;
//        if(a>6) System.out.println("Гамбургер");
//        if(a>10) System.out.println("Хот-дог");
//        else System.out.println("Конфета");
//    }
//}


import Main.HW.Human;
import MyCollection.myCollection;

import java.sql.Array;
import java.sql.SQLOutput;


//public class HW {
//    public static void main(String[] args) {
//        int time = 20;
//        int weather = 2;
//        boolean goodWeather = weather >= 15;
//        boolean dayTime = time>10 && time<21;
//        if (goodWeather && dayTime){
//            System.out.println("Иди гулять");
//        }
//        if (!goodWeather && dayTime){
//            System.out.println("Читай книгу");
//        }
//        if (!dayTime){
//            System.out.println("Иди спать");
//        }
//    }
//}


//public class HW {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i <= 1000) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//            if (i==10) {
//                break;
//            }
//        }
//    }
//}


//public class HW {
//    public static void main(String[] args) {
//        for (int i = 1000; i >= 0; i--) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}


//public class HW {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 5, 10, 15, 55};
//            for (int i= numbers.length-1; i<numbers.length;i--){
//                System.out.println(numbers[i]);
//            }
//        }
//    }


//public class HW {
//    public static void main(String[] args) {
//        String[] names = {"Anton", "Anna", "Alina", "Alexey" };
////        for (int i = 0; i < names.length; i++) {
////            System.out.println(names[i]);
////        }
//        for(String name: names){
//            System.out.println(name);
//        }
//    }
//}


//public class HW {
//    public static void main(String[] args) {
//        int[] numbers = new int[100];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + 100;
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//    }
//}


//public class HW {
//    public static void main(String[] args) {
//        int month = 8;
//        switch (month){
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("Зима");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Весна");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Лето");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Осень");
//                break;
//            default:
//                System.out.println("Неверно");
//            }
//        }
//    }
//public class HW {
//    public static void main(String[] args) {
//        Human Anna = new Human("Anna", 20, 50);
//        Human Alena = new Human("Alena", 15, 40);
//        Human Anton = new Human("Anton", 33, 60);
//        double sum_age = Anna.getAge() + Alena.getAge() + Anton.getAge();
//        double average_age = sum_age/3;
//        System.out.println(average_age);
//        }
//    }


//public class HW {
//    public static void main(String[] args) {
//        Dog_new dog = new Dog_new();
//        dog.name = "tuzik";
//        dog.age = 5;
//        dog.weight = 15;
//        dog.speed = 5;
//        String info = dog.getDogNew();
//        System.out.println(info);
//        dog.run();
//    }
//}


//public class HW {
//    public static void main(String[] args) {
//        Pryamoug pryamoug = new Pryamoug();
//        pryamoug.setDimens(5,10);
//        System.out.println(pryamoug.getArea());
//
//    }
//    }


//public class HW {
//    public static void main(String[] args) {
//        Employe employe = new Employe("Ivan","manager",100000);
//    employe.showInfo();
//    }
//}



//public class HW {
//    public static void main(String[] args) {
//        Monster1 monster1 = new Monster1(2,10,5);
//        monster1.voice(5,"cake!!!");
//    }
//}


//public class HW {
//    public static void main(String[] args) {
//        Box1 current = new Box1(10);
//        Box1 another = new Box1(20);
//        System.out.println(current.getVolume());
//        System.out.println(another.getVolume());
//        int result = current.compare(another);
//        System.out.println(result);
//        Box1 new1 = current.copy(10);
//        System.out.println(new1.getVolume());
//        Box1 new2 = current.increase(2);
//        System.out.println(new2.getVolume());
//    }
//}

//package MyCollection;

//public class HW {
//    public static void main(String[] args) {
//        myCollection employees = getEmployee();
//        employees.add("James");
//        for (int i = 0; i < employees.getSize(); i++) {
//            System.out.println(employees.get(i));
//        }
//    }

//    private static myCollection getEmployee() {
//        myCollection employees = new myCollection();
//        employees.add("Anna");
//        employees.add("Anton");
//        employees.add("Ivan");
//        employees.add("Alisa");
//        employees.add("Alex");
//        return employees;
//    }
//}

import Main.HW.Human;
//public class HW {
//    public static void main(String[] args) {
//        String s = "This is John. He is 27 years old";
//        String name = s.substring(8, 12);
//        String age = s.substring(20, 22);
//        int age1 = Integer.parseInt(age);
//        System.out.println(name+", "+age1);
//        Human human = new Human(name, age1);
//        System.out.println(human.Getname+" "+human.Getage());
//
//    }
//}
