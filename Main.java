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
