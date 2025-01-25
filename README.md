"# AZGRD"
// 1 Задача
class Student {
String name;
String surname;
String address;
int id;

        // Конструктор
        Student(String name, String surname, String address, int id) {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.id = id;
        }

        // Метод для вывода информации о студенте
        public String toString() {
            return "Студент: " + name + " " + surname + ", ID: " + id + ", Адрес: " + address;
        }
    }

    // Тестируем класс Student
    public class Main {
        public static void main(String[] args) {
            // Создаем 3 студентов
            Student student1 = new Student("Алиса", "Смит", "Коктем-2", 24);
            Student student2 = new Student("Азамат", "Кайратов", "Орбита-1", 25);
            Student student3 = new Student("Кристина", "Иванова", "Самал-3", 26);

            // Выводим информацию о студентах
            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student3);
        }
    }
//2 задача

public class Triangle {
double a,b,c;
Triangle (double a, double b, double c) {
this.a=a;
this.b=b;
this.c=c;
}
double getPerimetr(){
return  a+b+c;

    }

    double gerArea (){
        double d = getPerimetr()/2;
        return Math.sqrt(d * (d-a) * (d-b)* (d-c));
    }
    public static class Main {
        public static void main (String[]args){
            Triangle triangle = new Triangle(3,4,5);
            System.out.println(triangle.getPerimetr());
            System.out.println(triangle.gerArea());
        }
    }
}
 //3 задача
public class Rectangle {
double length, width;
Rectangle (double length, double width){
this.length=length;
this.width=width;

    }
    double returnArea(){
        return length*width;

    }
    public static class Main{
        public static void main (String[] args){
            Rectangle rect1=new Rectangle(5,9);
            Rectangle rect2 =new Rectangle(10, 14);
            System.out.println(rect1.returnArea());
            System.out.println(rect2.returnArea());
        }
    }
}
//4 задача

public class Avarage {
static double calculateAvarage (double a, double b, double c){
return (a+b+c)/3;
}
public static class Main {
public static void main (String[]args){
double avg = Avarage.calculateAvarage(10,20,30);
System.out.println(avg);
}
}
}
// 5 задача
public class Movie {
String title;
String studio;
String rating;
Movie(String title,String studio, String rating){
this.title=title;
this.studio=studio;
this.rating=rating;
}
Movie (String title, String studio){
this.title=title;
this.studio=studio;
this.rating="PG";

    }
    public String toString(){
        return "Фильм: " + title + ", Студия" + studio + ", Рейтинг " + rating;
    }
}

